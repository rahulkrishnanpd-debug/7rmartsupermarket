package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitUtility;

public class ManageLocationPage {
	public WebDriver driver;
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-location' and @class=\"small-box-footer\"]")WebElement managelocationmoreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newlocation;
	@FindBy(xpath="//select[@id='st_id']")WebElement statedropdown;
	@FindBy(xpath="//input[@id='location']")WebElement location;
	@FindBy(xpath="//input[@id='delivery']")WebElement delivery;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	@FindBy(xpath="//h1[text()='List Locations']")WebElement locationpage;
	@FindBy(xpath="//div[contains(@class,'alert alert-success alert-dismissible')]")WebElement locationcreated;
	
	public ManageLocationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*public void clickOnManageLocationMoreInfo()
	{
		managelocationmoreinfo.click();
	}*/
	public ManageLocationPage clickOnNewButton()
	{
		newlocation.click();
		return this;
	}
	public ManageLocationPage dropDownVisibleState(String statename)
	{
		Select select=new Select(statedropdown);
		select.selectByVisibleText(statename);
		return this;
	}
	public ManageLocationPage enterLocation(String locationname)
	{
		location.sendKeys(locationname);
		return this;
	}
	public ManageLocationPage enterDeliveryCharge(int deliveryamount)
	{
		delivery.sendKeys(String.valueOf(deliveryamount));
		return this;
	}
	public ManageLocationPage clickOnSave()
	{
		WaitUtility obj=new WaitUtility();
		obj.waitForVisibilityOff(driver, save);
		save.click();
		return this;
	}
	public boolean isManageLocationPageDisplayed()
	{
		return locationpage.isDisplayed();
	}
	public boolean isLocationCreationDisplayed()
	{
		return locationcreated.isDisplayed();
	}
}
