package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Login2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon Delopment Center");
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Murugesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		WebElement element1=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select se1=new Select(element1);
		se1.selectByValue("LEAD_CONFERENCE");
		Thread.sleep(3000);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
	}

}
