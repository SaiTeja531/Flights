/*
ProjectNameCase:Mercury Tours
Designed by:Sruthi Veggalam
Designed date:9/7/2022
	*/




package StepDefinations;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepslogin {

	WebDriver driver;
	page1 login;
	page2 SelectFlight;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:/Users/M1076923/eclipse-workspace/mavenCucumber/src/test/java/drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
        driver.get("https://www.demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside Step - user is on login page");

	   
	    
	    
	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String username,String password){

	    System.out.println("Inside Step - user enters username and password");
	    login = new page1(driver);
	    login.enterusername(username);
	    login.enterPassword(password);

	}

	@And("clicks on submit button")
	public void clicks_on_submit_button() {
	    System.out.println("Inside Step - clicks on submit button");
	    login.clickonlogin();

	}

	@Then("user should be able to see the message login successfully")
	public void user_should_be_able_to_see_the_message_login_successfully() {
	    System.out.println("Inside Step - user should be able to see the message login successfully");
	    
	}
	
   
	 
   
	

	@Given("user able to click on Flights")
	public void user_able_to_click_on_flights() throws Exception { 
	    System.out.println("Inside Step - user able to click on Flights");
	    SelectFlight = new page2(driver);
	    SelectFlight.clickonFlights();
	}

	@When("user navigates to the Flight Details")
	public void user_navigates_to_the_flight_details() {
	    System.out.println("Inside Step - user navigates to the Flight Details");
	    
	}
	

	@And("user needs to select Type {string}")
	public void user_needs_to_select_type(String Type) {
	    System.out.println("Inside Step - user needs to select Type");
	  //  SelectFlight.Closebutton();
	    SelectFlight.Type();
	    }
	    
	

	@And("user needs to select Passengers {string}")
	public void user_needs_to_select_passengers(String Passengers) {
	    System.out.println("Inside Step - user needs to select Passengers");
	    SelectFlight.Passengers();
	    
	    
	    
	}

	@And("user needs to select Departing From {string}")
	public void user_needs_to_select_departing_from(String Departing_From) {
	    System.out.println("Inside Step - user needs to select Departing From");
	    SelectFlight.Departing_From();
	    
	    
	}

	@And("user needs to select On {string}")
	public void user_needs_to_select_on(String On) {
	    System.out.println("Inside Step - user needs to select On");
	    SelectFlight.On();
	  
	    
	    
	}

	@And("user needs to select Arriving In {string}")
	public void user_needs_to_select_arriving_in(String Arriving_In) {
	    System.out.println("Inside Step - user needs to select Arriving In");
	    SelectFlight.Arriving_In();
	    
	}

	@And("user needs to select Returning {string}")
	public void user_needs_to_select_returning(String Returning) {
	    System.out.println("Inside Step - user needs to select Returning");
	    SelectFlight.Returning();
	}
	    

	@When("user navigates to the Preferences")
	public void user_navigates_to_the_preferences() {
	    System.out.println("Inside Step - user navigates to the Preferences");
	}

	@And("user needs to select Service Class {string}")
	public void user_needs_to_select_service_class(String Service_Class) {
	    System.out.println("Inside Step - user needs to select Service Class");
	    SelectFlight.Service_Class();
	    
	}

	@And("user needs to select Airline {string}")
	public void user_needs_to_select_airline(String Airline) {
	    System.out.println("Inside Step - user needs to select Airline");
	    SelectFlight.Airline();
	}

	@Then("user clicks on continue")
	public void user_clicks_on_continue() {
	    System.out.println("Inside Step - user clicks on continue");
	    SelectFlight.Continue();
	}

	@Then("user able to click on back to home")
	public void user_able_to_click_on_back_to_home() {
	    System.out.println("Inside Step - user able to click on back to home");
	    SelectFlight.back_to_home();
	}


}
