package TestNg;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=-2)
	public void open()
	{
		System.out.println("Open amazon");
	}
	@Test(priority=1)
	public void searchProduct()
	{
		System.out.println("Search ");
	}
	@Test(priority=-3)
	public void addToCart()
	{
		System.out.println("AddToCart");
	}
}
