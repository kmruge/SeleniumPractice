package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCountAndTime {
//	@Test(invocationCount=5)
//	public void login()
//	{
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.google.co.in/");
//		driver.findElement(By.name("q")).sendKeys("Match", Keys.ENTER);
//		List<WebElement> list=driver.findElements(By.xpath("//*[text()='Match']"));
//		System.out.println(list.size());
//		driver.quit();
//	}
	@Test(invocationCount=5, invocationTimeOut=50000)
	public void login()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Match", Keys.ENTER);
		List<WebElement> list=driver.findElements(By.xpath("//*[text()='Match']"));
		System.out.println(list.size());
	}
}
