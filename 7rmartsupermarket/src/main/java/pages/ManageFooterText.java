package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageFooterText {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")WebElement managefooter;
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss' and @href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement action;
	@FindBy(xpath="//textarea[@id='content']")WebElement address;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//button[@type='submit']")WebElement update;
	
	public ManageFooterText(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnManageFooterText()
	{
		managefooter.click();
	}
	public void clickOnActionButton()
	{
		action.click();
	}
	public void enterAddress(String addressvalue)
	{
		address.clear();
		address.sendKeys(addressvalue);
	}
	public void enterEmail(String emailvalue)
	{
		email.clear();
		email.sendKeys(emailvalue);
	}
	public void enterPhoneNumber(String phonenumber)
	{
		phone.clear();
		phone.sendKeys(phonenumber);
	}
	public void clickOnUpdate()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(update));
		update.click();
	}

}
