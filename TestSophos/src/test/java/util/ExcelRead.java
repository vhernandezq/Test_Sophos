package util;

import java.util.Hashtable;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

 public class ExcelRead {


static Fillo fillo;
static Connection connection;
final String excelWorksheetName = "Data";
private String connectionString;
private String testDataStartRow;

public ExcelRead(int testdataStartRowNum) {
 this.connectionString = "select * from " + excelWorksheetName + " where Ejecutar='Y'"; 
 this.testDataStartRow = Integer.toString(testdataStartRowNum);
}

static Configurations configuration;

public Object[][] getExcelData() throws FilloException {
	  
 configuration = new Configurations();
 System.setProperty("ROW", testDataStartRow);
 System.setProperty("COLUMN", "1");

 fillo = new Fillo();

 if (connection == null) {
  connection = fillo.getConnection(configuration.pathExcel);
 }

 Recordset recordset = connection.executeQuery(connectionString);
 
 Hashtable<String, String> table; 
 
 Object[][] data = new Object[recordset.getCount()][1];
 
 int rowIndex = 0;
 
 while (recordset.next()) {
  table = new Hashtable<String, String>();
  for (String strColumn : recordset.getFieldNames()) {
   table.put(strColumn, recordset.getField(strColumn.toString()));
  }
  data[rowIndex][0] = table;
  rowIndex++;
 }

 recordset.close();
 connection.close();
 return data;

}
}
