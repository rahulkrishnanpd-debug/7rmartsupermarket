package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constant.Constant;

public class ManageCategory {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-category']")WebElement managecategory;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newcategory;
	@FindBy(xpath="//input[@placeholder='Enter the Category']")WebElement entercategory;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement discount;
	@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	
	public ManageCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnManageCategory()
	{
		managecategory.click();
	}
	public void clickOnNewCategory()
	{
		newcategory.click();
	}
	public void enterCategory(String categoryname)
	{
		entercategory.sendKeys(categoryname);
	}
	public void clickOnDiscount()
	{
		Actions action = new Actions(driver);
		action.moveToElement(discount).click().perform();
	}
	public void clickOnChooseFile()
	{
		choosefile.sendKeys(Constant.LAYSIMG);
	}
	public void clickOnSave()
	{
		Actions action=new Actions(driver);
		action.moveToElement(save).click().perform();
	}

}
