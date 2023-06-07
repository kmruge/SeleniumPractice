package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3LoginWithXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa"); //Index based X-path.
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Create Contact')]")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@name='preferredCurrencyUomId']"));
		Select se=new Select(ele);
		List<WebElement> list=se.getOptions();
		for(int i=0;i<list.size();i++)
		{
			WebElement options=list.get(i);
			System.out.println(options.getText());
		}
	}

}
