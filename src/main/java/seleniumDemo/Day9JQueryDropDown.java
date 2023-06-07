package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day9JQueryDropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		System.out.println("biwbi");
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		Selection(driver,"choice 1", "choice 2 1");
	}

	private static void Selection(ChromeDriver driver, String...strings ) {
		List<WebElement> list=driver.findElements(By.xpath("//ul/li[@class='ComboTreeItemChlid']"));
		for(WebElement ele:list)
		{
			for(String fi:strings)
			{
				if(ele.getText().equals(fi))
				{
					ele.click();
				}
			}
		}
	}
}