package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Login {

	public static void main(String[] args) {
		// To set Up browser
		WebDriverManager.chromedriver().setup();
		//To open the browser
		ChromeDriver driver=new ChromeDriver();
		//To open the QRL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//To maximize the window
		
		driver.manage().window().maximize();
		
		//To maximize the window
		
//		driver.manage().window().minimize();
		
		//to open full window
		
//		driver.manage().window().fullscreen();
		
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.id("ext-gen473")).sendKeys("Murugesh");
		driver.findElement(By.id("ext-gen574")).click();
		driver.findElement(By.id("ext-gen625")).click();
		driver.findElement(By.id("ext-gen473")).clear();
		
		
	}

}
