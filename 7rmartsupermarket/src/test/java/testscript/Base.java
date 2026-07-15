package testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constant.Constant;
import utilities.ScreenShotUtility;
import utilities.WaitUtility;

public class Base {
	public WebDriver driver;
	Properties pr;
	FileInputStream fileinput;
	@BeforeMethod
	@Parameters("browser")
	public void initializebrowser(String Browser) throws Exception
	{
		try
		{
			pr=new Properties();
			fileinput=new FileInputStream(Constant.CONFIGFILE);
			pr.load(fileinput);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		if(Browser.equalsIgnoreCase("Chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			throw new Exception("Invalid Browser");
		}
		//driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.get(pr.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void browserQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			ScreenShotUtility scrShot = new ScreenShotUtility(); // creating obj
			scrShot.getScreenShot(driver, iTestResult.getName());
		}
  driver.quit();
	}
}
 