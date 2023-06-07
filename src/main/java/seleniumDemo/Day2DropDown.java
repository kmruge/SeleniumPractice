package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		WebElement element1=driver.findElement(By.id("dropdown1")); //Identify dropDown 
		Select se=new Select(element1); //Create Object
		se.selectByValue("2"); //choose by value
		WebElement element2=driver.findElement(By.name("dropdown2"));
		Select se1=new Select(element2);
		se1.selectByIndex(3); //choose by index
		WebElement element3=driver.findElement(By.id("dropdown3"));
		Select se2=new Select(element3); ////choose by visible name
		se2.selectByVisibleText("Loadrunner");
		List<WebElement> option=se2.getOptions();
		for(int i=0;i<option.size();i++)
		{
//			WebElement ele=option.get(i);
//			System.out.println(ele.getText());
			String ele=option.get(i).getText();
			System.out.println(ele);
			
		}
		int size=se2.getOptions().size();
		
		
	}

}
