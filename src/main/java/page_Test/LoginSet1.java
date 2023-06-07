package page_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page_Object_Module.PageLogin;
import page_Object_Module.PageLoginset1;

public class LoginSet1 {
	RemoteWebDriver driver=null;
	@Test()
	/**
	 * for login the page 
	 */
	void login()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		PageLoginset1 ji=new PageLoginset1(driver);
		ji.email("admin");
		ji.password("admin123");
		ji.signIn().click();
	}
	@AfterMethod
	void quit()
	{
		driver.quit();
	}
}
