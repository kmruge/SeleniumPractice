package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day20MouseClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://demoqa.com/buttons");
		WebElement ele=driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
		// Right click;
		
		act.contextClick(ele).build().perform();
		
		// Double click;
		act.doubleClick(driver.findElement(By.xpath("//*[@id='doubleClickBtn']"))).build().perform();
		// Click operation
		
		driver.findElement(By.xpath("//*[@id='2NTq0']")).click();
	}

}
