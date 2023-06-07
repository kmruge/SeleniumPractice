package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day12SelectingCheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='form-check']//input[contains(@id,'day')]"));
		//Selecting all checkBox
//		for(WebElement ki:ele)
//		{
//			ki.click();
//		}
		
		
		//Selecting last two or first two box
//		int size=ele.size();
//		for(int i=size-2;i<size;i++)
//		{
//			ele.get(i).click();
//		}
		
		//Selecting check based on text
		List<WebElement> ele2=driver.findElements(By.xpath("//input[contains(@id,'day')]/parent::label"));
		for(int i=0;i<ele2.size();i++)
		{
			if(ele2.get(i).getText().contains("Monday")||ele2.get(i).getText().contains("Tuesday"))
			{
				ele.get(i).click();
			}
		}
		List<WebElement> ele3=driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox']/label"));
		for(WebElement ki:ele3)
		{
			ki.click();
		}
		
		//Checking whether disable or not
		boolean checking=driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox']/input[@id='customCheck7']")).isEnabled();
		System.out.println(checking);
	}

}
