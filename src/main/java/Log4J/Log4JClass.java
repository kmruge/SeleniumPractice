package Log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4JClass {
	public static Logger log=Logger.getLogger(null)//creation object for Logger
	@Test
	void url()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		PropertyConfigurator.configure("log4j.properties");
		log.info("URL opening");  //logging the info
		log.info(log);
		driver.get("https://www.javatpoint.com/log4j-properties");
	}
}
