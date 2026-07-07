package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategory;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
	@Test
	public void verifyUserIsAbleToAccessManageCategoryField() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		
		ManageCategory category=new ManageCategory(driver);
		
		String categoryname=ExcelUtility.getStringData(1, 0, "managecategorypage");
		category.clickOnManageCategory();
		category.clickOnNewCategory();
		category.enterCategory(categoryname);
		category.clickOnDiscount();
		category.clickOnChooseFile();
		category.clickOnSave();
	}

}
