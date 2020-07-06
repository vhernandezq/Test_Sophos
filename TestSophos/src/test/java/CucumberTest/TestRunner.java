package CucumberTest;


import java.util.Hashtable;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pageobjects.SearchPageObject;
import util.Configurations;
import util.ExcelRead;
import util.Utilidad;
 

@RunWith(Cucumber.class)

@CucumberOptions(plugin = "json:target/cucumber-report.json",
features="classpath:features",
glue="stepDefinitions"
)

public class TestRunner {

	private WebDriver driver;
	SearchPageObject searchPageObject;
	Configurations configuration;
	Utilidad utilidad;
	

@Test(
		groups = {"cucumber"},
		description = "Runs Cucumber Feature",
		dataProvider = "dataPool")
public void reservaPage(Hashtable<String, String> data) throws Exception {
	searchPageObject.searchPage(data);
	  Thread.sleep(2000);
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  configuration = new Configurations();
	  searchPageObject = new SearchPageObject(driver);
	  configuration.CargarConfig();
	  driver = searchPageObject.chromeDriver();
	  searchPageObject.page(configuration.url);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  System.out.println("Ejecucion terminada");
  }
  
  @DataProvider
  public Object[][] dataPool() throws FilloException {
   ExcelRead reader = new ExcelRead(1);
   return reader.getExcelData();
  }
  
}