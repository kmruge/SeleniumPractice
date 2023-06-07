package page_Object_WebDriver;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverClass {
	protected RemoteWebDriver driver;
	@BeforeMethod
	public void Drivercall()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://letcode.in/signup");
		driver.manage().window().maximize();
	}
}
