package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

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
		
		ManageCategoryPage category=new ManageCategoryPage(driver);
		FakerUtility faker=new FakerUtility();
		String categoryname=faker.generateCategory();
		
		//String categoryname=ExcelUtility.getStringData(1, 0, "managecategorypage");
		category.clickOnManageCategoryMoreInfo();
		boolean listcategory=category.isCategoryDashboardDisplayed();
		Assert.assertTrue(listcategory);
		category.clickOnNewCategory();
		category.enterCategory(categoryname);
		category.clickOnDiscount();
		category.clickOnChooseFile();
		category.clickOnSave();
		
	}

}
