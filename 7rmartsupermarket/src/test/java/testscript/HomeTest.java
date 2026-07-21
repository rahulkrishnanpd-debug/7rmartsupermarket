package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	HomePage home;
	
	@Test(description="Test case for LoggingOut")
	public void verifyUserIsAbleToLogOutSuccessfully() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		home=loginpage.signIn();
		
		HomePage logout=new HomePage(driver);
		
		logout.clickOnDropDown().clickOnLogOut();
		//logout.clickOnLogOut();
		boolean loggedoutsuccessfully=logout.isLoginPageDisplayed();
		Assert.assertTrue(loggedoutsuccessfully,Constant.LOGGINGOUTFAILED);
	}

}
