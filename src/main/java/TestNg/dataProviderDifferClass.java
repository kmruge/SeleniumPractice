package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dataprovider.data;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProviderDifferClass {
	@Test(dataProvider="login", dataProviderClass=data.class)
	public void datatake(String userID, String password)
	{
		System.out.println(userID);
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(userID);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.quit();
	}
}
