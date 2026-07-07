package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNews;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	@Test
	public void verifyUserIsAbleToAccessManageNewsPageSuccessfully() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		ManageNews news=new ManageNews(driver);
		String enterthenews=ExcelUtility.getStringData(1, 0, "newspage");
		news.clickOnManageNews();
		news.clickOnNew();
		news.enterNews(enterthenews);
		news.clickOnSave();
	}
	

}
