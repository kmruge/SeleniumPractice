package ListenerPackage;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerPackage.Listener.class)
public class TestClass {
	
	@Test(priority=1)
	public void passTest()
	{
		Assert.assertEquals(true, true);
	}
	@Test(priority=2)
	public void failTest()
	{
		Assert.assertEquals(true, false);
	}
}
