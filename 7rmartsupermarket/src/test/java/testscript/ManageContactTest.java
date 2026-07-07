package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContact;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	@Test
	public void userIsAbleToAccessManageContactModule() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		
		ManageContact contact=new ManageContact(driver);
		
		int phonevalue=ExcelUtility.getIntegerData(1, 0, "contactpage");
		String emailvalue=ExcelUtility.getStringData(1, 1, "contactpage");
		String addressvalue=ExcelUtility.getStringData(1, 2, "contactpage");
		int deliverytimevalue=ExcelUtility.getIntegerData(1, 3, "contactpage");
		int deliverychargevalue=ExcelUtility.getIntegerData(1, 4, "contactpage");
		contact.clickOnManageContact();
		contact.clickOnEdit();
		contact.enterPhone(phonevalue);
		contact.enterEmail(emailvalue);
		contact.enterAddress(addressvalue);
		contact.enterDeliveryTime(deliverytimevalue);
		contact.enterDeliveryCharge(deliverychargevalue);
		contact.clickOnUpdate();
		
		
	
	    
		
	}

}
