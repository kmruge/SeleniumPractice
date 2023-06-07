package seleniumDemo;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day30Download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("out");
			String location="C:\\Users\\kmruge\\Desktop\\Selenium Automation\\Download";
			HashMap preference=new HashMap();
			preference.put("download.default_directory", location);
			ChromeOptions options=new ChromeOptions();
			options.setExperimentalOption("prefs", preference);
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver(options);
			driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
			driver.findElement(By.xpath("//td[@class='text-right file-link']")).click();
		}

	}

}
