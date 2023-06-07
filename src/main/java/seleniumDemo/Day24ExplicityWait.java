package seleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day24ExplicityWait {
	static WebElement explicity(ChromeDriver driver, By by, int a)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(a));
		WebElement hi=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return hi;
	}
	public static void main(String[] args) {
		System.out.println("bviewki");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		By by=By.xpath("//h3[text()='Selenium']");
		WebElement ele3=explicity(driver,by, 10); //Generic method
		ele3.click();
	}

}
