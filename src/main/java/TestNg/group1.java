package TestNg;

import org.testng.annotations.Test;

public class group1 {
	@Test(groups= {"2"})
	public void delete()
	{
		System.out.println("delete");
	}
	@Test(groups= {"3"})
	public void span()
	{
		System.out.println("span");
	}
}
