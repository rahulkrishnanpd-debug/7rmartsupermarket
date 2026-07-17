package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;


public class ManageDeliveryBoyPage {
	public WebDriver driver;
	//@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']")WebElement managedeliveryboymoreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newdeliveryboy;
	@FindBy(xpath="//input[@id='name']")WebElement deliveryboyname;
	@FindBy(xpath="//input[@id='email']")WebElement deliveryboyemail;
	@FindBy(xpath="//input[@id='phone']")WebElement deliveryboyphonenumber;
	@FindBy(xpath="//textarea[@id='address']")WebElement deliveryboyaddress;
	@FindBy(xpath="//input[@id='username']")WebElement deliveryboyusername;
	@FindBy(xpath="//input[@id='password']")WebElement deliveryboypassword;
	@FindBy(xpath="//button[@type='submit']")WebElement button;
	@FindBy(xpath="//h1[text()='List Delivery Boy']")WebElement deliveryboypage;
	@FindBy(xpath="//div[contains(@class,'alert alert-danger alert-dismissible')]")WebElement detailscreated;
	
	public ManageDeliveryBoyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*public void clickOnManageDeliveryBoyMoreInfo()
	{
		managedeliveryboymoreinfo.click();
	}*/
	public ManageDeliveryBoyPage clickOnNewButton()
	{
		newdeliveryboy.click();
		return this;
	}
	public ManageDeliveryBoyPage enterName(String name)
	{
		deliveryboyname.sendKeys(name);
		return this;
	}
	public ManageDeliveryBoyPage enterEmail(String email)
	{
		deliveryboyemail.sendKeys(email);
		return this;
	}
	public ManageDeliveryBoyPage enterPhonenumber(String phone)
	{
		deliveryboyphonenumber.sendKeys(phone);
		return this;
	}
	public ManageDeliveryBoyPage enterAddress(String address)
	{
		deliveryboyaddress.sendKeys(address);
		return this;
	}
	public ManageDeliveryBoyPage enterUsername(String username)
	{
		deliveryboyusername.clear();
		deliveryboyusername.sendKeys(username);
		return this;
	}
	public ManageDeliveryBoyPage enterPassword(String password)
	{
		deliveryboypassword.clear();
		deliveryboypassword.sendKeys(password);
		return this;
	}
	public ManageDeliveryBoyPage clickOnSave()
	{
		PageUtility scroll=new PageUtility();
		scroll.mousehover(driver, button);
		button.click();
		return this;
	}
	/*public boolean isDeliveryBoyPageDisplayed()
	{
		return deliveryboypage.isDisplayed();
	}*/
	public boolean isDetailsCreatedDisplayed()
	{
		return detailscreated.isDisplayed();
	}

}
