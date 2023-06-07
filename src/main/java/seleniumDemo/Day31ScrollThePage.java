package seleniumDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day31ScrollThePage {
	@Test
	void main() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("//div[@id=\"maintext\"]/h1"));
		js.executeScript("arguments[0].scrollIntoView();", findElement);
	}
}
