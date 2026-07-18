package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageCategoryTest extends Base {
	HomePage homepage;
	ManageCategoryPage category;
	@Test(description="Test case for ManageCategory section")
	public void verifyUserIsAbleToAccessManageCategoryField() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.enterPassword(passwordvalue);
		homepage=loginpage.signIn();
		
		//ManageCategoryPage category=new ManageCategoryPage(driver);
		category=homepage.clickOnManageCategoryMoreInfo();
		FakerUtility faker=new FakerUtility();
		String categoryname=faker.generateCategory();
		
		//String categoryname=ExcelUtility.getStringData(1, 0, "managecategorypage");
		//category=homepage.clickOnManageCategoryMoreInfo();
		category.clickOnNewCategory().enterCategory(categoryname).clickOnDiscount().clickOnChooseFile().clickOnSave();
		//category.enterCategory(categoryname);
		//category.clickOnDiscount();
		//category.clickOnChooseFile();
		//category.clickOnSave();
		//boolean listcategory=category.isCategoryDashboardDisplayed();
		//Assert.assertTrue(listcategory,Constant.CATEGORYPAGE);
		
	}

}
