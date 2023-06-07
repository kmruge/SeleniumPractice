package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day23MouseOver {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://demoqa.com/menu/#");
		WebElement ele=driver.findElement(By.xpath("//*[text()='Main Item 2']"));
		act.moveToElement(ele).perform();
		WebElement ele1=driver.findElement(By.xpath("//*[text()='SUB SUB LIST »']"));
		act.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.get("https://www.toolsqa.com/");
		driver.findElement(By.xpath("//span[@class='navbar__tutorial-menu--menu-bars']")).click();
		act.moveToElement(driver.findElement(By.xpath("//span[text()='QA Practices']"))).perform();
	}

}
