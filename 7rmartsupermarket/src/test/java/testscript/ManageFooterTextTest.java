package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base {
	@Test
	public void verifyUserIsAbleToAccessManageFooterTextField() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		
		ManageFooterTextPage footer=new ManageFooterTextPage(driver);
		
		String entertheaddress=ExcelUtility.getStringData(1, 0, "managefootertextpage");
		String enteremail=ExcelUtility.getStringData(1, 1, "managefootertextpage");
		String phonenumbervalue=ExcelUtility.getStringData(1, 2, "managefootertextpage");
		footer.clickOnManageFooterText();
		footer.clickOnActionButton();
		footer.enterAddress(entertheaddress);
		footer.enterEmail(enteremail);
		footer.enterPhoneNumber(phonenumbervalue);
		footer.clickOnUpdate();
		
	}

}
