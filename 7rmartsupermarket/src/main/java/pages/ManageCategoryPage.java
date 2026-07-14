package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;


public class ManageCategoryPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-category']")WebElement managecategorymoreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newcategory;
	@FindBy(xpath="//input[@placeholder='Enter the Category']")WebElement entercategory;
	@FindBy(xpath="//li[@id='1-selectable']")WebElement goodness;
	@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	@FindBy(xpath="//h1[text()='List Categories']")WebElement categorydashboard;
	
	public ManageCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnManageCategoryMoreInfo()
	{
		managecategorymoreinfo.click();
	}
	public boolean isCategoryDashboardDisplayed()
	{
		return categorydashboard.isDisplayed();
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
		action.moveToElement(goodness).click().perform();
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
