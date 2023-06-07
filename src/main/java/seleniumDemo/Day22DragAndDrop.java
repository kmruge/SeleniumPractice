package seleniumDemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day22DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		System.out.println("nicwiw");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/droppable/");
		Actions act=new Actions(driver);
		WebElement target=driver.findElement(By.xpath("//div[@id='draggable']/following-sibling::div"));
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		act.dragAndDrop(source, target);
		act.build().perform();
		driver.findElement(By.xpath("//a[text()='Accept']")).click();
		source=driver.findElement(By.xpath("//div[text()='Acceptable']"));
		target=driver.findElement(By.xpath("//*[text()='Not  Acceptable']/parent::div/following-sibling::div"));
		act.dragAndDrop(source, target);
		act.build().perform();
		driver.findElement(By.xpath("//*[text()='Prevent Propogation']")).click();
		source=driver.findElement(By.xpath("//*[text()='Drag Me']"));
		target=driver.findElement(By.xpath("//*[text()='Inner droppable (not greedy)']/parent::div"));
		act.dragAndDrop(source, target);
		act.build().perform();
		target=driver.findElement(By.xpath("//*[text()='Inner droppable (not greedy)']/parent::div/parent::div"));
		act.dragAndDrop(source, target);
		act.build().perform();
		//Drag and Drop OffSet
		List iu=new ArrayList();
		iu.re
		
	}

}
