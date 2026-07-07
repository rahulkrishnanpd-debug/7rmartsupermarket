package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void dropDownVisibleText(WebElement elementname,String visibletext)
	{
		Select select=new Select(elementname);
		select.selectByVisibleText(visibletext);
	}
	public void dropDownValue(WebElement elementname,String value)
	{
		Select select=new Select(elementname);
		select.selectByValue(value);
	}
	public void dropDownIndex(WebElement elementname,int index)
	{
		Select select=new Select(elementname);
		select.selectByIndex(index);
	}
	
	public void dragAndDrop(WebDriver driver, WebElement drag, WebElement drop)
	{
		
		Actions obj=new Actions(driver);
		obj.dragAndDrop(drag,drop).perform();
	}
	public void mousehover(WebDriver driver,WebElement elementname)
	{
		Actions obj=new Actions(driver);
		obj.moveToElement(elementname).perform();
	}
	public void rightclick(WebDriver driver, WebElement elementname)
	{
		Actions obj=new Actions(driver);
		obj.contextClick(elementname).perform();
	}
	public void doubleclick(WebDriver driver,WebElement elementname)
	{
		Actions obj=new Actions(driver);
		obj.doubleClick(elementname).perform();
	}
	public void click(WebDriver driver, WebElement elementname)
	{
		Actions obj=new Actions(driver);
		obj.click(elementname);
	}
	public void javaScriptExecutor(WebDriver driver, WebElement elementname, String value)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='value';",elementname,value);
	}
	public void pageScroll(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}

}
