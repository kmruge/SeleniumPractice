package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	@FindBy(name="q")
	WebElement googleSearch;
	@Test
	void pageFactory()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		PageFactory.initElements(driver,this);
		googleSearch.sendKeys("Aishu oru loosu");
	}
}
