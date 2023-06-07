package seleniumDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day14BrokenList {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		for(WebElement link:allLinks)
		{
			String StLink=link.getAttribute("href");
			if(StLink==null||StLink.isEmpty())
			{
				System.out.println("In valide URl");
				continue;
			}
			URL url=new URL(StLink);
			HttpURLConnection httpcon=(HttpURLConnection) url.openConnection();
			httpcon.connect();
			if(httpcon.getResponseCode()>=400)
			
			{
				System.out.println(httpcon.getResponseCode()+" "+url+" is broken");
			}
			else {
				System.out.println(httpcon.getResponseCode()+" "+url+" is valide");
			}
		}
	}
}