package TestNg;

import org.testng.annotations.Test;

public class group {
	@Test(groups= {"1","2"})
	public void signup()
	{
		System.out.println("signup");
	}
	@Test(groups= {"2"})
	public void delete()
	{
		System.out.println("delete");
	}
	@Test(groups= {"3"})
	public void added()
	{
		System.out.println("added");
	}
}
