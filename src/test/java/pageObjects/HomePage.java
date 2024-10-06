package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	WebDriver driver;
	//constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	//locators
	@FindBy (xpath="//*[@title='My Account']")
	WebElement link_myAccount;
	@FindBy (xpath="//a[text()='Register']")
	WebElement link_register;
	@FindBy (xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement link_login;
	

	//Action Methods
	public void clickOnMyAccount() {
		link_myAccount.click();
			
	}
	public void clickOnRegister() {
		link_register.click();
			
	}
	public void clickOnLogin() {
		link_login.click();
		
	}

}
