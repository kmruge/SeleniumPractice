package TestNg;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataReceiveFromExcell {
	
	@DataProvider()
	static String[][] send() throws IOException
	{
		String[][] value=dataProviderExcel.readExcel();
		return value;
	}
	@Test(dataProvider="send")
	public void Final(String a, String b)
	{
		System.out.println(a+"  "+"  "+b);
	}
}
