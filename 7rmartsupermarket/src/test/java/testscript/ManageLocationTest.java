package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageLocationPage;
import utilities.ExcelUtility;

public class ManageLocationTest extends Base {
	
	@Test(description="Test case for ManageLocation section")
	public void verifyUserIsAbleToAccessManageLocationPage() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		ManageLocationPage location=new ManageLocationPage(driver);
		location.clickOnManageLocationMoreInfo();
		boolean listlocation=location.isManageLocationPageDisplayed();
		Assert.assertTrue(listlocation);
		location.clickOnNewButton();
		String statename=ExcelUtility.getStringData(1, 0, "managelocationpage");
		String locationname=ExcelUtility.getStringData(1, 1, "managelocationpage");
		int deliverycharge=ExcelUtility.getIntegerData(1, 2, "managelocationpage");
		location.dropDownVisibleState(statename);
		location.enterLocation(locationname);
		location.enterDeliveryCharge(deliverycharge);
		location.clickOnSave();
		boolean locationcreatedsuccessfull=location.isLocationCreationDisplayed();
		Assert.assertTrue(locationcreatedsuccessfull);
		
		
	}

}
