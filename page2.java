package StepDefinations;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class page2 {
	
	private WebDriver driver;
	
	//1.by locators:
	
	private By Flightsbutton = By.partialLinkText("Flights");
	private By Closebutton = By.xpath("//input[@id='dismiss-button']");
	private By Type = By.xpath("//input[@value='roundtrip']");
	private By Passengers = By.xpath("//select[@name='passCount']");
	private By Departing_From = By.xpath("//select[@name='fromPort']");
	private By On = By.xpath("//select[@name='fromMonth']");
	private By On1 = By.xpath("//select[@name='fromDay']");
			
		
	
	
	private By Arriving_In = By.xpath("//select[@name='toPort']");
	private By Returning = By.xpath("//select[@name='toMonth']");
	private By Returning1 = By.xpath("//select[@name='toDay']");
	
	private By Service_class = By.xpath("//input[@value='Business']");
	private By Airline = By.xpath("//select[@name='airline']");
	private By Continue = By.cssSelector("input[name='findFlights']");
	private By back_to_home = By.cssSelector("img[src='images/home.gif']");
	
	//2.Constructor of the page class:
	public page2(WebDriver driver) {
		this.driver = driver;
	}

	
	
	
	//3.page actions : Behavior of the page in the form of methods
	
	public String getFlightspage() {
		return driver.getTitle();
	}
	
	
	
	public void clickonFlights() {
		driver.findElement(Flightsbutton).click();
	
	}
	public void Closebutton() {
		 driver.findElement(Closebutton).click();
	}
	public void Type() {
		  
		 
         WebElement radio1 = driver.findElement(Type);
         radio1.click();
		
	}
	public void Passengers() {
		
		   WebElement element =  driver.findElement(Passengers);
		    Select sel = new Select(element);
		    sel.selectByValue("4");
		
		
		
		   
	}
	public void Departing_From() {
		 WebElement element = driver.findElement(Departing_From);
		    Select sel = new Select(element);
		    sel.selectByValue("Paris");
	}
	public void On() {
		 WebElement element = driver.findElement(On);
		    Select sel = new Select(element);
		    sel.selectByValue("12");
		    
		    WebElement element1 = driver.findElement(On1);
		    Select sel1 = new Select(element1);
		    sel1.selectByValue("6");
		    
		}
	
	
	
	public void Arriving_In() {
		WebElement element = driver.findElement(Arriving_In);
	    Select sel = new Select(element);
	    sel.selectByValue("London");
	    
	}
	public void Returning() {
		WebElement element = driver.findElement(Returning);
	    Select sel = new Select(element);
	    sel.selectByValue("3");
	    
	    WebElement element1 = driver.findElement(Returning1);
	    Select sel2 = new Select(element1);
	    sel2.selectByValue("6");
	}
	public void Service_Class() {
		 WebElement radio2 = driver.findElement(Service_class);
		    radio2.click();
	}
	public void Airline() {
	    WebElement element = driver.findElement(Airline);
	    Select sel = new Select(element);
	    sel.selectByVisibleText("Unified Airlines");
	}
	public void Continue() {
		 driver.findElement(Continue).click();
	}
	public void back_to_home() {
		driver.findElement(back_to_home).click();
	}
	

}
 