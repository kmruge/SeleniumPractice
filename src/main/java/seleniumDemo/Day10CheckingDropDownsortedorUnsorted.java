package seleniumDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day10CheckingDropDownsortedorUnsorted {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='ComboTreeItemChlid']"));
		ArrayList<String> original=new ArrayList<String>();
		ArrayList<String> temp=new ArrayList<String>();
		for(WebElement di:list)
		{
			original.add(di.getText());
			temp.add(di.getText());
		}
		System.out.println(original);
		Collections.sort(temp);
		System.out.println(temp);
		if(original.equals(temp))
		{
			System.out.println("Sort");
		}
		else
		{
			System.out.println("Unsorted");
		}
			
	}

}
