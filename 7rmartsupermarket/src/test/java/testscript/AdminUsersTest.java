package testscript;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base {
	HomePage homepage;
	AdminUsersPage admin;
	@Test(description="Test case for AdminUsers section")
	public void verifyUserIsAbleToRedirectSuccessfullyToAdminUsersPage() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.signIn();
		//AdminUsersPage admin=new AdminUsersPage(driver);
		//admin.clickOnAdminUsersMoreInfo();
		//admin.clickOnAlert();
		
	}
	@Test(description="Test case for AdminUsers section")
	public void verifyUserIsAbleToAddNewUserInformation() throws IOException
	{
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
	    String password = ExcelUtility.getStringData(1, 1, "loginpage");
        LoginPage loginpage = new LoginPage(driver);
	    loginpage.enterUserName(username).enterPassword(password);
	    //loginpage.enterPassword(password);
	    homepage=loginpage.signIn();
		
	   // AdminUsersPage admin=new AdminUsersPage(driver);
	    
	    String username1=ExcelUtility.getStringData(1, 0, "adminuserspage");
	    String password1=ExcelUtility.getStringData(1, 1, "adminuserspage");
	    String usertype=ExcelUtility.getStringData(1, 2, "adminuserspage");
		admin=homepage.clickOnAdminUsersMoreInfo();
		/*boolean adminusers=admin.isAdminDashboardDisplayed();
	    Assert.assertTrue(adminusers);*/
	    admin.clickOnNew().enterUserName(username1).enterPassword(password1).dropDownVisibleText(usertype).save();
	    /*admin.enterUserName(username1);
	    admin.enterPassword(password1);
	    admin.dropDownVisibleText(usertype);
	    admin.save();*/
	    boolean useriscreated=admin.isUserCreatedAlertDisplayed();
	    Assert.assertTrue(useriscreated,Constant.ADMINPAGE);
}

}
