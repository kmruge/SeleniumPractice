package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day28SliderUsingActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement minSlider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		System.out.println("Mini Slider Location "+minSlider.getLocation());
		System.out.println(minSlider.getSize());
		Actions act=new Actions(driver);
		act.dragAndDropBy(minSlider, 50, 0).perform();
		WebElement maxSlider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Max Slider Location "+maxSlider.getLocation());
		maxSlider.click();
		Actions act1=new Actions(driver);
		act1.dragAndDropBy(maxSlider, -50, 0).perform();
	}

}
