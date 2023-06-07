package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6Navigate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.get("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.myntra.com/");
		driver.close();
	}
}
