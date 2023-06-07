package TestNg;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*;
public class CookieManagement {
	
	    @Test
		public static void main()
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			Set<Cookie> cookies=driver.manage().getCookies();
			System.out.println(cookies.size());
			Cookie cook1=new Cookie("My Cookie","7923");
			driver.manage().addCookie(cook1);
			cookies=driver.manage().getCookies();
			System.out.println(cookies.size());
			driver.manage().deleteAllCookies();
			cookies=driver.manage().getCookies();
			System.out.println(cookies.size());
		}
}
