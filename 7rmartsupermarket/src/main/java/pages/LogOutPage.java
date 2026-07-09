package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	public WebDriver driver;
	@FindBy (xpath="//a[@data-toggle='dropdown']") WebElement dropdown;
	@FindBy (xpath="//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout;
	@FindBy(xpath="//p[text()='Sign in to start your session']")WebElement loggedout;
	public LogOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnDropDown()
	{
		dropdown.click();
	}
	public void clickOnLogOut()
	{
		logout.click();
	}
	public boolean isLoginPageDisplayed()
	{
		return loggedout.isDisplayed();
	}

}
