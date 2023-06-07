package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunProperty {
	@Test()
	public void login() throws FileNotFoundException, IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		Properties property=new Properties();
		property.load(new FileInputStream("C:\\Users\\kmruge\\Pictures\\Program to Github\\SeleniumPractice\\src\\main\\java\\PropertiesFile\\property.properties"));
		driver.findElement(By.xpath(property.getProperty("emailXpath"))).sendKeys(property.getProperty("email"));
		driver.findElement(By.xpath(property.getProperty("passwordXpath"))).sendKeys(property.getProperty("password"));
		driver.findElement(By.xpath("//input[@name=\"commit\"]")).click();
	}
}
