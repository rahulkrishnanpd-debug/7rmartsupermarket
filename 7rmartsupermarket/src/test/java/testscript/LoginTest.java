package testscript;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	HomePage homepage;
	@Test(description="Test case for Logging in with valid credentials")
	public void verifyUserIsAbleToLoginWithValidCredentials() throws IOException
	{
		//String usernamevalue="admin";
		//String passwordvalue="admin";
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.signIn();
		boolean homepage=loginpage.isDashboardDisplayed();
		Assert.assertTrue(homepage,Constant.LOGINVALIDCREDENTIALS);
	}
	@Test(description="Test case for Logging in with valid username and invalid password")
	public void verifyUserIsAbleToLoginWithValidUsernameAndInvalidPassword() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(2, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(2, 1, "loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.signIn();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert,Constant.LOGININVALIDPASSWORD);
		
	}
	@Test(description="Test case for Logging in with invalid username and valid password")
	public void verifyUserIsAbleToLoginWithInvalidUsernameAndValidPassword() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(3, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(3, 1, "loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.signIn();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert,Constant.LOGININVALIDUSERNAME);
		
	}
	@Test(description="Test case for Logging in with invalid credentials")
	public void verifyUserIsAbleToLoginWithInvalidCredentials() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(4, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(4, 1, "loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.signIn();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert,Constant.LOGININVALIDCREDENTIALS);
		
	} 

}
