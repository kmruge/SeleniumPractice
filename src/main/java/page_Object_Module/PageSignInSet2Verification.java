package page_Object_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import page_Object_WebDriver.DriverClass;

public class PageSignInSet2Verification extends DriverClass  {
	RemoteWebDriver driver;
	public PageSignInSet2Verification(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public void Email(String email)
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
	}
	public void passWord(String password)
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	public void click()
	{
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	}
}