package seleniumDemo;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Day26AutoCompleteGooglePlace {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement ele=driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
		ele.sendKeys("Chenna");
		String st;
		do
		{
			ele.sendKeys(Keys.ARROW_DOWN);
			st=ele.getText();
			if(st.equalsIgnoreCase("CHENNAI EGMORE - MS"))
			{
				ele.click();
			}
		}while(!st.isEmpty());
	}
}