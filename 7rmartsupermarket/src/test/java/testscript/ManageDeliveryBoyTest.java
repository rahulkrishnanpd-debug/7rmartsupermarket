package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageDeliveryBoyPage;
import utilities.ExcelUtility;

public class ManageDeliveryBoyTest extends Base {
	HomePage homepage;
	ManageDeliveryBoyPage deliveryboy;

	@Test(description="Test case for ManageDeliveryBoy section")
	public void verifyUserIsAbleToAccessManageDeliveryBoyPage() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.signIn();
		
		//ManageDeliveryBoyPage deliveryboy=new ManageDeliveryBoyPage(driver);
        
        //boolean listdeliveryboy=deliveryboy.isDeliveryBoyPageDisplayed();
        //Assert.assertTrue(listdeliveryboy);
		deliveryboy=homepage.clickOnManageDeliveryBoyMoreInfo().clickOnNewButton();
    	String deliveryname=ExcelUtility.getStringData(1, 0, "managedeliveryboypage");
		String deliveryemail=ExcelUtility.getStringData(1, 1, "managedeliveryboypage");
		String deliveryphone=ExcelUtility.getStringData(1, 2, "managedeliveryboypage");
		String deliveryaddress=ExcelUtility.getStringData(1, 3, "managedeliveryboypage");
		String deliveryusername=ExcelUtility.getStringData(1, 4, "managedeliveryboypage");
		String deliverypassword=ExcelUtility.getStringData(1, 5, "managedeliveryboypage");
		deliveryboy.enterName(deliveryusername).enterEmail(deliveryemail).enterPhonenumber(deliveryphone).enterAddress(deliveryaddress).enterUsername(deliveryusername).enterPassword(deliverypassword).clickOnSave();
		/*deliveryboy.enterEmail(deliveryemail);
		deliveryboy.enterPhonenumber(deliveryphone);
		deliveryboy.enterAddress(deliveryaddress);
		deliveryboy.enterUsername(deliveryusername);
		deliveryboy.enterPassword(deliverypassword);
		deliveryboy.clickOnSave();*/
		boolean detailsalreadycreated=deliveryboy.isDetailsCreatedDisplayed();
		Assert.assertTrue(detailsalreadycreated,Constant.DELIVERYBOYPAGE);
	
	}
}
