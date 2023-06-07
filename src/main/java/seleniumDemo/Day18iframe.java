package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day18iframe {

	public static void main(String[] args) {
		System.out.println("hvowova");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi' and @target='packageFrame']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//a[@title='interface in org.openqa.selenium.bidi']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("deprecate");
		driver.switchTo().defaultContent();
	}

}
