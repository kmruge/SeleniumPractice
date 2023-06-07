package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
public class Day7DropDownGenericMethod {

	public static void selectOption(WebElement ele, String value)
	{
		Select select=new Select(ele);
		List<WebElement> list=select.getOptions();
		for(WebElement singleEle:list)
		{
			if(singleEle.getText().equals(value))
			{
				singleEle.click();
			}
		}
	}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		WebElement Option=driver.findElement(By.xpath("//*[@id='dropdown1']"));
		selectOption(Option,"Selenium");
		WebElement Option1=driver.findElement(By.xpath("//*[@name='dropdown2']"));
		selectOption(Option1,"Appium");
		WebElement Option2=driver.findElement(By.xpath("//*[@id='dropdown3']"));
		selectOption(Option2,"UFT/QTP");
		WebElement di=driver.findElement(By.xpath("//h1[@class='wp-heading']"));
		System.out.println(di.getText());
	}

}
