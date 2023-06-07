package seleniumDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day29ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/");
		File scr=driver.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\target\\ScreenShot\\homepage.png");
		FileUtils.copyFile(scr, trg);
		
		// Screen shot of particular portion
		WebElement portion=driver.findElement(By.xpath("//img[@class='learner']"));
		File scr1=portion.getScreenshotAs(OutputType.FILE);
		File trg1=new File("C:\\Users\\kmruge\\Desktop\\Selenium Automation\\ScreenShot\\portion.png");
		FileUtils.copyFile(scr1, trg1);
		
		//Screen shot of Element
		WebElement ele=driver.findElement(By.xpath("//a[@class='navbar__brand col-auto order-0']/img"));
		File scr2=ele.getScreenshotAs(OutputType.FILE);
		File trg2=new File("C:\\\\Users\\\\kmruge\\\\Desktop\\\\Selenium Automation\\\\ScreenShot\\\\Element.png");
		FileUtils.copyFile(scr2, trg2);
	}

}
