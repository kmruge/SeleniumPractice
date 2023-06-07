package TestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class threadPoolSize {
	@Test(invocationCount=3, threadPoolSize=2)
	public void google()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
}
