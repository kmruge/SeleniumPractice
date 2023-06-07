package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day17PermissionNotification {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		
	}

}
