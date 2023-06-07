package seleniumDemo;

import java.time.Duration;

import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day26DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		System.out.println("vbiws");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		driver.findElement(By.xpath("//i[@class='fas fa-user']/parent::a")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a")).click();
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//li[@class='page-item']/a[text()='2']")).click();
	}
}
