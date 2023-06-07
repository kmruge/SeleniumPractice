package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day20ActionsKeyBoardFunction {
	public static void main(String args[])
	{
		System.out.println("nvienve");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://demoqa.com/text-box");
		WebElement curentAddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		curentAddress.sendKeys("Aishu oru vaiyadi.......jai oru muthevi");
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("A");
//		act.keyUp(Keys.CONTROL);
//		act.build().perform();
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("C");
//		act.keyUp(Keys.CONTROL);
//		act.sendKeys(Keys.TAB);
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("V");
//		act.keyUp(Keys.CONTROL);
//		act.build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB);
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}
}
