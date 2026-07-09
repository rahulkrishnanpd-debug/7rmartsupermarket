package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {
public WebDriver driver;
@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-contact']")WebElement managecontact;
@FindBy(xpath="//i[contains(@class,'fas fa-edit')]")WebElement edit;
@FindBy(xpath="//input[@id='phone']")WebElement phone;
@FindBy(xpath="//input[@id='email']")WebElement email;
@FindBy(xpath="//textarea[@placeholder='Enter the Address']")WebElement address;
@FindBy(xpath="//textarea[@placeholder='Enter Delivery Time']")WebElement deliverytime;
@FindBy(xpath="//input[@id='del_limit']")WebElement deliverychargelimit;
@FindBy(xpath="//button[@type='submit']")WebElement update;

public ManageContactPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void clickOnManageContact()
{
	managecontact.click();
}
public void clickOnEdit()
{
	edit.click();
}
public void enterPhone(int phonenumber)
{
	phone.clear();
	phone.sendKeys(String.valueOf(phonenumber));
}
public void enterEmail(String emailaddress)
{
	email.clear();
	email.sendKeys(emailaddress);
}
public void enterAddress(String enteraddress)
{
	address.clear();
	address.sendKeys(enteraddress);
}
public void enterDeliveryTime(int enterdeliverytime)
{
	deliverytime.clear();
	deliverytime.sendKeys(String.valueOf(enterdeliverytime));
}
public void enterDeliveryCharge(int deliverycharge)
{
	deliverychargelimit.clear();
	deliverychargelimit.sendKeys(String.valueOf(deliverycharge));
}
public void clickOnUpdate()
{
	PageUtility obj=new PageUtility();
	obj.pageScroll(driver);
	update.click();
}
}