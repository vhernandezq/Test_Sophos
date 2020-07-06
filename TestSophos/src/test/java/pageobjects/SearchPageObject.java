package pageobjects;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;

public class SearchPageObject extends PageElement {
	
//	private PageElement pageElement;
	SearchPageObject reservaPageObject;
	
	public SearchPageObject(WebDriver driver) {
		super(driver);
	}
	
//	private WebDriver driver;

	public void searchPage(Hashtable<String, String> data) throws Exception {
	   	try {
			click(this.barragoogle);

			type(data.get("Busqueda"), this.barragoogle);
		    //	type("Sophos solutions", this.barragoogle);
			click(this.btnbuscar);
			Thread.sleep(1000);
			
			String a = getText(this.labelresul);
			System.out.println("el numero de resultados de la busqueda es : " + a);

			tomaEvidencia();
			Thread.sleep(5000);
			System.out.println("llego a pagina resultados");
	   	}
	   	catch(Exception e) {
	   		System.out.println("se genero un error : " + e);
	   		tomaEvidencia();
	   	}
			
	}
	
	public String sarchMessage() {
		return "";
	}
	
}
