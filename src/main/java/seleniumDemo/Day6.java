package seleniumDemo;
/*loading link
 * getting all links and printing them with name
 * click firt link
 * get the tile
 * move back to previous page
 * finally close the window
 */
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		System.out.println("Printing links for first time");
		for(int i=0;i<allLink.size();i++)
		{
			WebElement singleElement=allLink.get(i);
			String linkName=singleElement.getText();
			System.out.println(linkName);
			String link=singleElement.getAttribute("href");
			System.out.println(link);
		}
		driver.findElement(By.linkText("Go to Home Page")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.close();
	}
}
