package seleniumDemo;

import java.nio.channels.Selector;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day27DatePicking {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		String exDay="20";
		String exMonth="Jul";
		String exYear="2002";
		WebElement disMonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sect=new Select(disMonth);
		sect.selectByVisibleText(exMonth);
		WebElement disYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sect1=new Select(disYear);
		sect1.selectByVisibleText(exYear);
		List<WebElement> dayList=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement day:dayList)
		{
			if(day.getText().equals(exDay))
			{
				day.click();
			}
		}
		System.out.println("Expected date "+ exDay+" "+exMonth+" "+exYear);
	}

}
