package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lombok.Getter;


@Getter
public class PageElement extends PageBase {
		
	public PageElement(WebDriver driver) {
		super(driver);
	}

	By barragoogle		= By.name("q");
	By btnbuscar		= By.name("btnK");
	By labelresul		= By.id("result-stats");
	
}
