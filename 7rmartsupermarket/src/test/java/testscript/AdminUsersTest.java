package testscript;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base {
	@Test(description="Test case for AdminUsers section")
	public void verifyUserIsAbleToRedirectSuccessfullyToAdminUsersPage() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		//AdminUsersPage admin=new AdminUsersPage(driver);
		//admin.clickOnAdminUsersMoreInfo();
		//admin.clickOnAlert();
		
	}
	@Test
	public void verifyUserIsAbleToAddNewUserInformation() throws IOException
	{
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
	    String password = ExcelUtility.getStringData(1, 1, "loginpage");
        LoginPage loginpage = new LoginPage(driver);
	    loginpage.enterUserName(username);
	    loginpage.enterPassword(password);
	    loginpage.signIn();
		
	    AdminUsersPage admin=new AdminUsersPage(driver);
	    
	    String username1=ExcelUtility.getStringData(1, 0, "adminuserspage");
	    String password1=ExcelUtility.getStringData(1, 1, "adminuserspage");
	    String usertype=ExcelUtility.getStringData(1, 2, "adminuserspage");
		admin.clickOnAdminUsersMoreInfo();
		boolean adminusers=admin.isAdminDashboardDisplayed();
	    Assert.assertTrue(adminusers);
	    admin.clickOnNew();
	    admin.enterUserName(username1);
	    admin.enterPassword(password1);
	    admin.dropDownVisibleText(usertype);
	    admin.save();
	    boolean useriscreated=admin.isUserCreatedAlertDisplayed();
	    Assert.assertTrue(useriscreated);
}

}
