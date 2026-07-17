package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	//@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement managenewsmoreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']")WebElement enternews;
	@FindBy(xpath="//button[@name='create']")WebElement save;
	@FindBy(xpath="//h1[text()='Manage News']")WebElement managenewsdashboard;
	@FindBy(xpath="//div[contains(@class,'alert alert-success alert-dismissible')]")WebElement newscreated;
	
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*public void clickOnManageNewsmoreinfo()
	{
		Actions action=new Actions(driver);
		action.moveToElement(managenewsmoreinfo).click().perform();
		
	}*/
	/*public boolean isManageNewsDashboardDisplayed()
	{
		return managenewsdashboard.isDisplayed();
	}*/
	public ManageNewsPage clickOnNew()
	{
		newbutton.click();
		return this;
	}
	public ManageNewsPage enterNews(String enterthenews)
	{
		enternews.sendKeys(enterthenews);
		return this;
	}
	public ManageNewsPage clickOnSave()
	{
		save.click();
		return this;
	}
	public boolean isNewsDisplayed()
	{
		return newscreated.isDisplayed();
	}
	

}
