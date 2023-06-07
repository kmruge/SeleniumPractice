package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day19InnerIframe {

	public static void main(String[] args) {
		System.out.println("nvw");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		WebElement ele1=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(ele1); // switching to first ifrasme using WebElement
		WebElement eled2=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(0); // switching to inner iframe using index
		driver.findElement(By.xpath("//div/input")).sendKeys("Replicate");
		//Inner Iframe to parent Iframe:
		System.out.println("Inner Iframe Text "+ driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText());
		driver.switchTo().parentFrame();
		System.out.println("Outer Iframe Text"+ driver.findElement(By.xpath("//h5")).getText());
	}

}
