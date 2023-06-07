package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProvider {
	@DataProvider(name="login")
	String[][] getdate()
	{
		String[][] data=new String[2][2];
		data[0][0]="oijiefe";
		data[0][1]="nviei";
		data[1][0]="veni";
		data[1][1]="oefjc";
		return data;
	}
	
	@Test(dataProvider="login")
	public void datatake(String userID, String password)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(userID);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
}
