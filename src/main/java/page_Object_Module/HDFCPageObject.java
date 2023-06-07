package page_Object_Module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import page_Object_WebDriver.HSDFPageDriver;

public class HDFCPageObject {
	
	public RemoteWebDriver driver;
	public HDFCPageObject(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public List<WebElement> swatch1()
	{
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		return driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
	}
	public void swatch2()
	{
		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		List<WebElement> swatch2Option=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		for(WebElement ele:swatch2Option)
		{
			if(ele.getText().equals("Home Loan"))
			{
				ele.click();
				break;
			}
		}
	}
}
