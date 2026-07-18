package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageLocationPage;
import utilities.ExcelUtility;

public class ManageLocationTest extends Base {
	HomePage homepage;
	ManageLocationPage location;
	
	@Test(description="Test case for ManageLocation section")
	public void verifyUserIsAbleToAccessManageLocationPage() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.signIn();
		//ManageLocationPage location=new ManageLocationPage(driver);
		location=homepage.clickOnManageLocationMoreInfo();
		//boolean listlocation=location.isManageLocationPageDisplayed();
		//Assert.assertTrue(listlocation);
		
		String statename=ExcelUtility.getStringData(1, 0, "managelocationpage");
		String locationname=ExcelUtility.getStringData(1, 1, "managelocationpage");
		int deliverycharge=ExcelUtility.getIntegerData(1, 2, "managelocationpage");
		location.clickOnNewButton().dropDownVisibleState(statename).enterLocation(locationname).enterDeliveryCharge(deliverycharge).clickOnSave();		
		/*location.dropDownVisibleState(statename);
		location.enterLocation(locationname);
		location.enterDeliveryCharge(deliverycharge);
		location.clickOnSave();*/
		boolean locationcreatedsuccessfull=location.isLocationCreationDisplayed();
		Assert.assertTrue(locationcreatedsuccessfull,Constant.LOCATIONPAGE);
		
		
	}

}
