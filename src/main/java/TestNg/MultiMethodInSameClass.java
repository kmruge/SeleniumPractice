package TestNg;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiMethodInSameClass {
	@Test
	public void googleAutoDrop() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("vijay");
		List<WebElement> alldrop=driver.findElements(By.xpath("//ul[@class='G43f7e']/li//span"));
		System.out.println(alldrop.size());
		for(WebElement sin:alldrop)
		{
			if(sin.getText().contains("Sethupathi"))
			{
				sin.click();
				break;
			}
		}
	}
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
