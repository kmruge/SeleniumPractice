package page_Test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import page_Object_Module.HDFCPageObject;
import page_Object_WebDriver.HSDFPageDriver;

public class HDFCSearch extends HSDFPageDriver{
	@Test
	void test()
	{
		List<WebElement> swatch1Option=new HDFCPageObject(driver).swatch1();
		for(WebElement ele:swatch1Option)
		{
			if(ele.getText().equals("Loans"))
			{
				ele.click();
				break;
			}
		}
		new HDFCPageObject(driver).swatch2();
	}
}
