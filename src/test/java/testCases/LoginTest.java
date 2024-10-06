package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass{
	
	@Test(groups= {"Regression","Masters"})
	public void validateLogin() {
		logger.info("******** Starting Login Test **********");
		logger.debug("Capturing application debug logs....");
		try {
		//HomePage
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccount();
		homePage.clickOnLogin();
		logger.info("******** Clicked On Login Link under MyAccount **********");
		
		//LoginPage
		LoginPage loginPage = new LoginPage(driver);
		logger.info("******** Adding Login Credentials **********");
		loginPage.setEmail(prop.getProperty("email"));
		loginPage.setPassword(prop.getProperty("password"));
		loginPage.clickLogin();
		logger.info("******** Clicked On Login Button **********");
		
		//MyAccountPage
		MyAccountPage myAcctPage = new MyAccountPage(driver);
		boolean displayStatusMyAccountPage =myAcctPage.isMyAccountPageExists();
		
		Assert.assertEquals(displayStatusMyAccountPage, true, "Login Failed");
	} catch(Exception e) {
		Assert.fail();
	}finally {
		logger.info("******** Login Test Completed **********");
	}
		
		
		
	}		
		
		

}
