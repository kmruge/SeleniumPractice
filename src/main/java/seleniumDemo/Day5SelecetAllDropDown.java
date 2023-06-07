package seleniumDemo;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5SelecetAllDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		List<WebElement> dropDown=driver.findElements(By.tagName("select"));// getting all dropdown name select and store in list
		WebElement singleDrop=dropDown.get(0);
		Select select=new Select(singleDrop);
		List<WebElement> option=select.getOptions();
		for(int i=0;i<option.size();i++) {
			WebElement element=option.get(i);
			System.out.println(element.getText());
		}
	}
}
