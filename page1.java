package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page1 {
	private WebDriver driver;
	
	//1.By Locators:
	
	private By username = By.xpath("//input[@Name='userName']");
	private By password = By.xpath("//input[@Name='password']");
	private By submitbutton = By.cssSelector("input[type='submit']");
	
	
	//2.Constructor of the page class:
	public page1(WebDriver driver) {
		this.driver = driver;
	}

	
	//3.page actions : Behavior of the page in the form of methods
	public String getloginPageString() {
		return driver.getTitle();
		
	}
	public void enterusername(String Username) {
		driver.findElement(username).sendKeys("sruthiveggalam2@gmail.com");
	}
	public void enterPassword(String Password) {
		driver.findElement(password).sendKeys("Mounika@2622");
	}
	public void clickonlogin() {
		driver.findElement(submitbutton).click();
	}

}
