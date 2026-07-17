package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;


public class AdminUsersPage {
    public WebDriver driver;
	//@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-admin']")WebElement adminusersmoreinfo;
	@FindBy(xpath="//a[contains(@class,'btn btn-rounded btn-danger')]")WebElement newuser;
	@FindBy(xpath="//input[@id='username']")WebElement username;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//select[@id='user_type']")WebElement dropdown;
	@FindBy(xpath="//button[@name='Create']")WebElement save;
    @FindBy(xpath="//h1[text()='Admin Users']")WebElement adminusersdashboard;
    @FindBy(xpath="//div[contains(@class,'alert alert-danger alert-dismissible')]")WebElement usercreated;
	
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	/*public void clickOnAdminUsersMoreInfo()
	{
		adminusersmoreinfo.click();
	}*/
	/*public boolean isAdminDashboardDisplayed()
	{
		return adminusersdashboard.isDisplayed();
	}*/
	public AdminUsersPage clickOnAlert()
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();
		return this;
	}
	public AdminUsersPage clickOnNew()
	{
		newuser.click();
		return this;
	}
	public AdminUsersPage enterUserName(String usernamevalue)
	{
		username.sendKeys(usernamevalue);
		return this;
	}
	public AdminUsersPage enterPassword(String passwordvalue)
	{
		password.sendKeys(passwordvalue);
		return this;
	}
	public AdminUsersPage dropDownVisibleText(String usertype)
	{
		//Select select=new Select(dropdown);
		//select.selectByVisibleText(usertype);
		PageUtility pageutility=new PageUtility();
		pageutility.dropDownIndex(dropdown, 3);
		return this;
	}
	public AdminUsersPage save()
	{
		save.click();
		return this;
	}
	
	public boolean isUserCreatedAlertDisplayed()
	{
		//WaitUtility obj=new WaitUtility();
		//obj.waitForAlertIsPresent(driver);
		return usercreated.isDisplayed();
	}

}
