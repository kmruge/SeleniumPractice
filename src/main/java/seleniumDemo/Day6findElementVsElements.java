package seleniumDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
public class Day6findElementVsElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fget-started");
		System.out.println("Getting list of element by findELement");
		WebElement sinElement=driver.findElement(By.xpath("//div[@class='footer-block information']/parent::div//a"));
		System.out.println(sinElement.getText());
		List<WebElement> listOfElement=driver.findElements(By.xpath("//div[@class='footer-block information']/parent::div//a"));
		System.out.println("Getting list of element by findELements");
		System.out.println("Number of Elements captured  "+ listOfElement.size());
		ArrayList<String> list=new ArrayList<String>();
		for(WebElement ele:listOfElement)
		{
			list.add(ele.getText());
		}
		System.out.println(list);
		List<WebElement> listOfElement2=driver.findElements(By.id("FirstName"));
		System.out.println(listOfElement2.size());
	}

}
