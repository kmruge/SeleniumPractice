package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day26DatePicking {
	public static void dateSelecting(ChromeDriver driver, String day, String month, String year)
	{
		while(true)
		{
			WebElement monthandYear=driver.findElement(By.xpath("//tr[@class='rb-monthHeader']/td[@class='monthTitle']"));
			String monthYear=monthandYear.getText();
			String arr[]=monthYear.split(" ");
			String disMonth=arr[0];
			String disYear=arr[1];
			if(disMonth.equalsIgnoreCase(month) && disYear.equals(year))
			{
				break;
			}
			WebElement next=driver.findElement(By.xpath("//tr[@class='rb-monthHeader']/td[@class='next']"));
			next.click();
		}
		List<WebElement> dayList=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody//td[@class='wd day' or @class='we day']"));
		for(WebElement ki:dayList)
		{
			if(ki.getText().equals(day))
			{
				ki.click();
				break;
			}
		}
	}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		String day="10";
		String month="Nov";
		String year="2023";
		dateSelecting(driver, day, month, year);
	}

}
