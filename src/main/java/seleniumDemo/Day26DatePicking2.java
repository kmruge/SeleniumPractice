package seleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day26DatePicking2 {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/?gclid=CjwKCAiApvebBhAvEiwAe7mHSAobgm7031d7WTVC6gxFob74HLv1jfq20r7UygocWbplYAwDNJHJUhoCPUQQAvD_BwE&cmp=SEM|D|DF|G|Generic|DF_Generic_Exact|Tickets_Exact|RSA|Offer3|483490446455&s_kwcid=AL!1631!3!483490446455!e!!g!!ticket%20booking&ef_id=CjwKCAiApvebBhAvEiwAe7mHSAobgm7031d7WTVC6gxFob74HLv1jfq20r7UygocWbplYAwDNJHJUhoCPUQQAvD_BwE:G:s");
		driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10']/parent::label[@for]")).click();
		String day="13";
		String month="August";
		String year="2023";
		while(true)
		{
		String displayedDate=driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[@class='DayPicker-Caption']/div")).getText();
		System.out.println(displayedDate);
		String arr[]=displayedDate.split(" ");
		String monthDis=arr[0];
		String yearDis=arr[1];
		if(monthDis.equalsIgnoreCase(month)&&yearDis.equals(year))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		}
		List<WebElement> displayedDays=driver.findElements(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[@class='DayPicker-Body']//div[@class='dateInnerCell']/p[1]"));
		for(WebElement days:displayedDays)
		{
			if(days.getText().equals(day))
			{
				days.click();
			}
		}
	}

	private static void SelectingDate(ChromeDriver driver, String day, String month, String year) {
		while(true)
		{
		String displayedDate=driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[@class='DayPicker-Caption']/div")).getText();
		System.out.println(displayedDate);
		String arr[]=displayedDate.split(" ");
		String monthDis=arr[0];
		String yearDis=arr[1];
		if(monthDis.equalsIgnoreCase(month)&&yearDis.equals(year))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//div[@class='fa3f76ae6b']/preceding::button[5]")).click();
		}
		}
	}
}
