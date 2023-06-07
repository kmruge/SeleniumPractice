package TestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations1 {
	
	@Test()
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test()
	public void test2()
	{
		System.out.println("Test2");
	}
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	void aftermethod()
	{
		System.out.println("After method");
	}
	@BeforeClass
	void beforeClass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	void afterclass()
	{
		System.out.println("After class");
	}
	@BeforeTest
	void beforetest()
	{
		System.out.println("before test");
	}
	@AfterTest
	void aftertest()
	{
		System.out.println("after test");
	}
}
