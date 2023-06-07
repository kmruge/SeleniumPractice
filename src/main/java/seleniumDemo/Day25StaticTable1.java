package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day25StaticTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("nienvs");
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		int row=driver.findElements(By.xpath("//table/tbody/tr/td[1]")).size();
		System.out.println(row);
		for(int i=1;i<=row;i++)
		{
			String p=Integer.toString(i+1);
			WebElement ele=driver.findElement(By.xpath("//table/tbody/tr["+p+"]/td[2]"));
			System.out.println(ele.getText());
			if(ele.getText().equals("100%"))
			{
				driver.findElement(By.xpath("//table/tbody/tr["+p+"]/td[3]")).click();
			}
		}
	}

}
