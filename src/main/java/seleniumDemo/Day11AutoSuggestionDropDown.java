package seleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day11AutoSuggestionDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Rajini");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li//span"));
		System.out.println("All Auto Suggestion :");
		for(WebElement hi:list)
		{
			System.out.println(hi.getText());
		}
		for(WebElement li:list)
		{
			if(li.getText().contains("kanth"))
			{
				li.click();
				break;
			}
		}
	}

}
