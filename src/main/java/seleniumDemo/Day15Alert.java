package seleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day15Alert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//Alert with ok
		driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
		Alert alertvariable=driver.switchTo().alert();
		alertvariable.accept();
		
		//alert with ok and cancel
//		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
//		driver.switchTo().alert().dismiss();
		
		//alert with input along with ok and cancel
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Be who you are"); // pass value to input box
		System.out.println(alert.getText()); // get text from alert window
		alert.accept();
	}

}
