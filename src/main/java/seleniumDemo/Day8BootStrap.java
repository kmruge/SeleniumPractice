package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8BootStrap {
	public static void option(List<WebElement> list, String value)
	{
		for(WebElement op:list)
		{
			if(op.getText().equals(value))
			{
				op.click();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("nivincdni");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
	    driver.findElement(By.xpath("//a[text()='Select Product Type']/parent::div")).click();
		List<WebElement> productType=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		option(productType,"Deposits");
		driver.findElement(By.xpath("//a[text()='Select Product']/parent::div")).click();
		List<WebElement> product=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		option(product,"Fixed Deposit");
	}

}
