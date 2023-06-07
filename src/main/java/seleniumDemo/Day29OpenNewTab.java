package seleniumDemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day29OpenNewTab {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions alert=new ChromeOptions();
		alert.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(alert);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ebay.co.uk/");
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.xpath("//a[@class='gh-p' and text()=' Daily Deals']")).sendKeys(tab);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ebay.co.uk/");
		Set<String> ele=driver.getWindowHandles();
		ArrayList<String> win=new ArrayList<String>(ele);
		for(String st:win)
		{
			System.out.println(st);
		}
		driver.switchTo().window(win.get(0));
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.ebay.co.uk/");
	}

}
