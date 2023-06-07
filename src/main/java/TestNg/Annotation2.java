package TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation2 {
	@BeforeSuite
	void beforesuite()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	void aftersuite()
	{
		System.out.println("After suite");
	}
	@Test
	void ano2()
	{
		System.out.println("ano2");
	}
	
}
