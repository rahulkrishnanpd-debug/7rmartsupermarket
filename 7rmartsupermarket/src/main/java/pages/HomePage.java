package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement managenewsmoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-location' and @class=\"small-box-footer\"]")WebElement managelocationmoreinfo;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-category']")WebElement managecategorymoreinfo;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']")WebElement managedeliveryboymoreinfo;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-admin']")WebElement adminusersmoreinfo;
	
	@FindBy (xpath="//a[@data-toggle='dropdown']") WebElement dropdown;
	@FindBy (xpath="//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout;
	@FindBy(xpath="//p[text()='Sign in to start your session']")WebElement loggedout;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}  
	public ManageNewsPage clickOnManageNewsmoreinfo()
	{
		Actions action=new Actions(driver);
		action.moveToElement(managenewsmoreinfo).click().perform();
		return new ManageNewsPage(driver);
		
	}
	public ManageLocationPage clickOnManageLocationMoreInfo()
	{
		managelocationmoreinfo.click();
		return new ManageLocationPage(driver);
	}
	public ManageCategoryPage clickOnManageCategoryMoreInfo()
	{
		managecategorymoreinfo.click();
		return new ManageCategoryPage(driver);
	}
	public ManageDeliveryBoyPage clickOnManageDeliveryBoyMoreInfo()
	{
		managedeliveryboymoreinfo.click();
		return new ManageDeliveryBoyPage(driver);
	}
	public AdminUsersPage clickOnAdminUsersMoreInfo()
	{
		adminusersmoreinfo.click();
		return new AdminUsersPage(driver);
	}
	
	
	
	
	public HomePage clickOnDropDown()
	{
		dropdown.click();
		return new HomePage(driver);
	}
	public HomePage clickOnLogOut()
	{
		logout.click();
		return new HomePage(driver);
	}
	public boolean isLoginPageDisplayed()
	{
		return loggedout.isDisplayed();
	}

}
