package utilities;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	public void fileUploadUsingSendKeys(WebElement elementname, String filepath)
	{
		elementname.sendKeys(filepath);
	}

}
