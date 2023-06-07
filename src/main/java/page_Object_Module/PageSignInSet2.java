package page_Object_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import page_Object_WebDriver.DriverClass;

public class PageSignInSet2 extends DriverClass {
	RemoteWebDriver driver;
	 public PageSignInSet2(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public PageSignInSet2 Name(String name)
	{
		driver.findElement(By.id("name")).sendKeys(name);
		return this;
	}
	public PageSignInSet2 Email(String Email)
	{
		driver.findElement(By.id("email")).sendKeys(Email);
		return this;
	}
	public PageSignInSet2 Password(String Password)
	{
		driver.findElement(By.id("pass")).sendKeys(Password);
		return this;
	}
	public PageSignInSet2 Click()
	{
		driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
		return this;
	}
	// verification Assert always be in the test class
	
	public  boolean name()
	{
		return driver.findElement(By.xpath("//label[text()='Name']")).isDisplayed();
	}
	public boolean email()
	{
		return driver.findElement(By.xpath("//label[text()='Email']")).isDisplayed();
	}
	public boolean password()
	{
		return driver.findElement(By.xpath("//label[text()='Password']")).isDisplayed();
	}
}
