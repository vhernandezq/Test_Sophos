package stepDefinitions;

 
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

 
public class Steps {
    
	  private final WebDriver driver = new FirefoxDriver();
	    
	    @Given("I am on the Google search page")
	    public void I_visit_google() {
	    	//  @BeforeTest
	    }

	    @When("I search for {string}")


	   @Then("the page title should start with {string}")

	

	   @After()
	   public void closeBrowser() {
	       driver.quit();
	   }
	}