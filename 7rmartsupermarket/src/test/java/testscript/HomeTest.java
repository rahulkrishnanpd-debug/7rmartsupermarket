package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	
	@Test(description="Test case for LoggingOut")
	public void verifyUserIsAbleToLogOutSuccessfully() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		
		HomePage logout=new HomePage(driver);
		
		logout.clickOnDropDown();
		logout.clickOnLogOut();
		boolean loggedoutsuccessfully=logout.isLoginPageDisplayed();
		Assert.assertTrue(loggedoutsuccessfully);
	}

}
