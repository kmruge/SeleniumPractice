package TestNg;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class AlwaysRunEnabledDescription {
	
	@Test(enabled=false)
	public void signup() {
		System.out.println("Sign-up");
	}

	@Test(description="Execution of Name")
	public void Name() {
		System.out.println("Name");
		throw new NoSuchElementException();
	}

	@Test(dependsOnMethods ="Name", alwaysRun = true)
	public void Address() {
		System.out.println("Address");
	}

}
