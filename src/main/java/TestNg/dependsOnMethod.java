package TestNg;

import org.openqa.selenium.NoSuchFrameException;
import org.testng.annotations.Test;

public class dependsOnMethod {
//	@Test(priority =1)
//	public void signup()
//	{
//		System.out.println("Sign-up");
//	}
//	@Test(priority =2, dependsOnMethods ="Address")
//	public void Name()
//	{
//		System.out.println("Name");
//	}
//	@Test(priority=3,dependsOnMethods="signup")
//	public void Address()
//	{
//		System.out.println("Address");
//		throw new RuntimeException();
//	}
	
	@Test(priority =1)
	public void signup()
	{
		System.out.println("Sign-up");
	}
	@Test(priority =2)
	public void Name()
	{
		System.out.println("Name");
		throw new RuntimeException();
	}
	@Test(priority=3)
	public void Address()
	{
		System.out.println("Address");
		
	}
}
