package testCases;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class AccountRegistrationTest extends BaseClass{
	
	@Test(groups= {"Sanity","Masters"})
	public void validateAccountRegistration() {
		logger.info("******Starting Account Registration Test*******");
		logger.debug("####### This is a debug log message #########");
				
		try {
		HomePage homePage = new HomePage(driver);
		logger.info("Clicking on MyAccount");
		homePage.clickOnMyAccount();
		homePage.clickOnRegister();
		logger.info("Clicked on Register Link");
		
		//create object of registration
		logger.info("Providing Customer Information");
		RegistrationPage regPage = new RegistrationPage(driver);
		regPage.setFristName(randomString().toUpperCase());
		regPage.setLastName(randomString().toUpperCase());
		regPage.setEmail(randomString()+"@mail.com");
		regPage.setTelephone(randomNumber());
		
		String pwd = randomAlphaNumeric();
		
		regPage.setPassword(pwd);
		regPage.setConfirmPassword(pwd);
		
		regPage.setPrivacyPolicy();
		regPage.clickContinue();
		logger.info("Validating Expected Message.....");
		String confmsg = regPage.getConfirmationMsg();
		AssertJUnit.assertEquals(confmsg, "Your Account Has Been Created!");
		logger.info("Account Registration Test Passed");
	}   catch (Exception e) {
		
	}   finally {
		logger.info("*******Finished Account Registration Testing*****");
	}
	}
		
	
	
	
		
	
	
	

}
