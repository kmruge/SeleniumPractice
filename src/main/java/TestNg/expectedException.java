package TestNg;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class expectedException {
	@Test(expectedExceptions= {NoSuchElementException.class,RuntimeException.class})
	public void exception()
	{
		System.out.println("Running");
		throw new RuntimeException("j");
	}
}
