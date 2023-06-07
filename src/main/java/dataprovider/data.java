package dataprovider;

import org.testng.annotations.DataProvider;

public class data {
	@DataProvider(name="login", indices= {1,2}, parallel=true)
	 public String[][] getdate()
	{
		String[][] data=new String[3][2];
		data[0][0]="FirstRow";
		data[0][1]="nviei";
		data[1][0]="SecondRow";
		data[1][1]="oefjc";
		data[2][0]="ThirdRow";
		data[2][1]="voein";
		return data;
	}
}
