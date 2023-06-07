package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Wait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// WHenever selenium unable to locate the element it was 30 second to searching for that element before throw an error.
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		WebElement ele=driver.findElement(By.id("dropdown1"));
		Select select=new Select(ele);
		select.selectByValue("1");
		String hi=driver.getTitle();
		System.out.println(hi);
	}

}
