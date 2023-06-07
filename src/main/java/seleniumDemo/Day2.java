package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {
	@Test()
	public void test() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(" appended");
		System.out.println(driver.findElement(By.name("username")).getAttribute("style"));
		boolean check = driver.findElement(By.name("username")).isEnabled();
		System.out.println(check);
	}

}
