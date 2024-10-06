package pageObjects;

//import java.time.Duration;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
	
	WebDriver driver;
	
	public RegistrationPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath="//*[@id=\"input-firstname\"]")
	WebElement txtFirstname;
	
	@FindBy (xpath="//*[@id=\"input-lastname\"]")
	WebElement txtLastname;
	
	@FindBy (xpath="//*[@id=\"input-email\"]")
	WebElement txtEmail;
	
	@FindBy (xpath="//*[@id=\"input-telephone\"]")
	WebElement txtTelephone;
	
	@FindBy (xpath="//*[@id=\"input-password\"]")
	WebElement txtPassword;
	
	@FindBy (xpath="//*[@id=\"input-confirm\"]")
	WebElement txtConfirmPassword;
	
	@FindBy (xpath="//input[@name='agree']")
	WebElement chkBoxPrivacy;
	
	@FindBy (xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	//Action Methods
	public void setFristName(String fname) {
		txtFirstname.sendKeys(fname);
		
	}
		
	public void setLastName(String lname) {
			txtLastname.sendKeys(lname);
			
	}
	
	public void setEmail(String email) {
			txtEmail.sendKeys(email);
			
	}
	
	public void setTelephone(String telephone) {
			txtTelephone.sendKeys(telephone);
	
	}
	
	public void setPassword(String pwd) {
			txtPassword.sendKeys(pwd);
			
	}
	
	public void setConfirmPassword(String pwd) {
			txtConfirmPassword.sendKeys(pwd);
			
}
	
	public void setPrivacyPolicy() {
			chkBoxPrivacy.click();
			
	}
	
	public void clickContinue() {
		 	btnContinue.click();
		 	
		 	// option 2
		 	//btnContinue.submit();
		 	
		 	/* option 3
		 	Actions act = new Actions(driver);
		 	act.moveToElement(btnContinue).click().perform();
		 	*/
		 	
		 	/* option 4
		 	JavascriptExecutor js = (JavascriptExecutor)driver;
		 	js.executeScript("arguments[0].click();", btnContinue;
		 	*/
		 	
		 	/* option 5
		 	btnContinue.sendKeys(Keys.RETURN);
		    */
		 	
		 	/* option 6
		 	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		 	*/
		 			
		 	
	}
	
	public String getConfirmationMsg() {
		try {
	return	msgConfirmation.getText();
		} catch(Exception e) {
			return e.getMessage();
		}
		
		
		

	}
	

}
