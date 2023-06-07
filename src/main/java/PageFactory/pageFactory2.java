package PageFactory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageFactory2 extends pageFactory1 {
	@Test
	void google()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		PageFactory.initElements(driver,pageFactory1.class);
		googleSearch.sendKeys("Jai loosu");
	}
	
}
