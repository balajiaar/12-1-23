package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Searchhotel {
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
	@Then("user sholud check all fields by searchhotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_sholud_check_all_fields_by_searchhotel(String location, String hotels, String roomtype, String noofrooms, String checkindate, String checkoutdate, String adultperroom, String childperroom) {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement location1= driver.findElement(By.id("location"));
	    Select s=new Select(location1);
	    s.selectByValue(location);
	    
	}

	@Then("user should click the search button and receive the select hotel message")
	public void user_should_click_the_search_button_and_receive_the_select_hotel_message() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
