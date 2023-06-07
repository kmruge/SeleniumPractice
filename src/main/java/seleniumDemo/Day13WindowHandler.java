package seleniumDemo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day13WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String st=driver.getWindowHandle();// Single window Id
		Thread.sleep(3000);
		System.out.println("Single Window ID " +st);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		Set<String> windowIds=driver.getWindowHandles();
		System.out.println("Multiple window Id");   
		ArrayList<String> winId=new ArrayList<String>(windowIds);
		for(int i=0;i<winId.size();i++)
		{
			System.out.println(winId.get(i));
			if(i==1)
			{
				driver.switchTo().window(winId.get(i));
				System.out.println(driver.getTitle());
			}
		}
//		driver.close();
		driver.quit();
	}
}
