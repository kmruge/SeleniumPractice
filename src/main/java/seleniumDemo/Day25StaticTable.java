package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day25StaticTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		//get row size
		System.out.println("Size of row"+driver.findElements(By.xpath("//table//tr/th")).size());
		//getting column size
		System.out.println("Size of column"+driver.findElements(By.xpath("//table//tr/td[1]")).size());
		//display all element from the table
		List<WebElement> row=driver.findElements(By.xpath("//table//tr/th"));
		List<WebElement> column=driver.findElements(By.xpath("//table//tr/td[1]"));
		System.out.println();
		for(int i=1;i<=row.size();i++)
		{
			for(int j=1;j<=column.size();j++)
			{
				String value=driver.findElement(By.xpath("//table//tr["+(i+1)+"]/td["+j+"]")).getText();
				System.out.print(value+"     ");
			}
			System.out.println();
		}
		
		// apply condition locate the special value
		for(int i=1;i<=row.size();i++)
		{
			String Details=driver.findElement(By.xpath("//table//tr["+(i+1)+"]/td[1]")).getText();
			if(Details.equalsIgnoreCase("Handle Exceptions"))
			{
				String Progress=driver.findElement(By.xpath("//table//tr["+(i+1)+"]/td[2]")).getText();
				System.out.println("Progress percentage of "+Details+" "+Progress);
			}
		}
		// identifing weather for specific place
//		driver.get("https://www.timeanddate.com/weather/india");
//		List<WebElement> row1=driver.findElements(By.xpath("//table[@class='zebra fw tb-wt zebra va-m']//tbody/tr"));
//		List<WebElement> column1=driver.findElements(By.xpath("//table[@class='zebra fw tb-wt zebra va-m']//tbody/tr[1]/td"));
//		for(int i=1;i<=row1.size();i++)
//		{
//				String place=driver.findElement(By.xpath("//table[@class='zebra fw tb-wt zebra va-m']//tbody/tr["+i+"]/td[1]")).getText();
//				if(place.equalsIgnoreCase("Aizawl"))
//				{
//					System.out.println(driver.findElement(By.xpath("//table[@class='zebra fw tb-wt zebra va-m']//tbody/tr["+i+"]/td[2]")).getText());
//				}
//		}
	}

}
