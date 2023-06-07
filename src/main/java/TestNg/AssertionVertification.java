package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionVertification {
	WebDriver driver;
	@BeforeClass
	void driver()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test(priority=1)
	void tileCheck1()
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,"Google","failed titleCheck1");
	}
	@Test(priority=2)
	void tileCheck2()
	{
		String actualTitle=driver.getTitle();
		Assert.assertNotEquals(actualTitle,"Google","failed titleCheck2");
	}
	@Test(priority=3)
	void Logo1()
	{
		WebElement logo=driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']/img"));
		Assert.assertTrue(logo.isDisplayed(),"Logo1 Failed");
	}
	@Test(priority=4)
	void Logo2()
	{
		WebElement logo=driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']/img"));
		Assert.assertFalse(logo.isDisplayed(),"Logo2 failed");
	}
	@AfterClass
	void exit()
	{
		driver.quit();
	}
}
