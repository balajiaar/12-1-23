package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
	WebDriver driver;
	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	   driver.navigate().to("https://adactinhotelapp.com/");
	   
	}

	@When("user sholud be enter the {string} and {string}")
	public void user_sholud_be_enter_the_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("username")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("user should click the login btn")
	public void user_should_click_the_login_btn() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("login")).click();
	}

	@Then("user should receive the sucess message {string}")
	public void user_should_receive_the_sucess_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("login success");
	}



;}
