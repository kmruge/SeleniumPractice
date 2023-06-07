package page_Object_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageLoginset1 {
	RemoteWebDriver driver=null;
	//Location with three different method of invoking them
	public PageLoginset1(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public void email(String UserName)
	{
		driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys(UserName);  //Beginner Level
	}
	public PageLoginset1 password(String PassWord)
	{
		driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys(PassWord); //Advanced level
		return this;
	}
	public WebElement signIn()
	{
		return driver.findElement(By.xpath("//button[@type='submit']")); //Normal level
	}
}
