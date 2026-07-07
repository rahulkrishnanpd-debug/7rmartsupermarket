package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement managenews;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']")WebElement enternews;
	@FindBy(xpath="//button[@name='create']")WebElement save;
	
	public ManageNews(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnManageNews()
	{
		managenews.click();
	}
	public void clickOnNew()
	{
		newbutton.click();
	}
	public void enterNews(String enterthenews)
	{
		enternews.sendKeys(enterthenews);
	}
	public void clickOnSave()
	{
		save.click();
	}

}
