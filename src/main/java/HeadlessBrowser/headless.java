package HeadlessBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class headless {
	@Test
	public void run()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	}
}
