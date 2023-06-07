package seleniumDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebCookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Handling cookies
		driver.get("https://demo.nopcommerce.com/");
		Set<Cookie> allCookies=driver.manage().getCookies();
		System.out.println("Size of cookies " + allCookies.size());
		for(Cookie cookie:allCookies)
		{
			System.out.println(cookie.getName()+" : "+ cookie.getValue());
		}
		//How to add cookie
		System.out.println("Before adding cookie internally "+allCookies.size());
		Cookie addcookie1=new Cookie("MyCookies1","37904");
		Cookie addcookie2=new Cookie("MyCookies2","37904");
		driver.manage().addCookie(addcookie1);
		driver.manage().addCookie(addcookie2);
		allCookies=driver.manage().getCookies();
		System.out.println("After Adding Cookies "+ allCookies.size());
		
		//How to delete Cookie based on object
		System.out.println("Before Deleting cookie "+allCookies.size());
		driver.manage().deleteCookie(addcookie1);
		allCookies=driver.manage().getCookies();
		System.out.println("After Deleting Cookies by obj_of_cookie"+ allCookies.size());
		
		//How to delete Cookie based on cookie name
		System.out.println("Before Deleting cookie "+allCookies.size());
		driver.manage().deleteCookieNamed("MyCookies2");
		allCookies=driver.manage().getCookies();
		System.out.println("After Deleting Cookies by cookie_name"+ allCookies.size());
		
		//How to delete all cookie
		System.out.println("Before Deleting cookie "+allCookies.size());
		driver.manage().deleteAllCookies();
		allCookies=driver.manage().getCookies();
		System.out.println("After Deleting all Cookies "+ allCookies.size());
		
	}

}
