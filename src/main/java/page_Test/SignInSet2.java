package page_Test;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page_Object_Module.PageSignInSet2;
import page_Object_Module.PageSignInSet2Verification;
import page_Object_WebDriver.DriverClass;
public class SignInSet2 extends DriverClass {
	
	@Test(priority=1, description="verifing WebElement Displayed on WebPage")
	public void verify()
	{
		PageSignInSet2 verify=new PageSignInSet2(driver);
		boolean name=verify.name();
		Assert.assertEquals(name, true);
		boolean email=verify.email();
		Assert.assertTrue(email);
		boolean password=verify.password();
		Assert.assertTrue(password);
	}
	/**
	 * creating account and signIn( used concept DataProvider with Excel, POM, )
	 * @param data
	 */
	@Test(priority=2, dataProvider="dataPro1")
	public void signUpTest(String[] data)
	{
		new PageSignInSet2(driver).Name(data[0]).Email(data[1]).Password(data[2]).Click();
	}
	/**
	 * Data receiving from excel sheet
	 * @return
	 * @throws IOException
	 */
	@DataProvider()
	String[][] dataPro1() throws IOException
	{
		String[][] data=SignInSet2.dataFromExcel1();
		return data;
	}
	@DataProvider()
	String[][] dataPro2() throws IOException
	{
		String[][] data=SignInSet2.dataFromExcel2();
		return data;
	}
	/**
	 * Verifing whether the email successfully signin or not
	 */
	@Test(priority=3,dataProvider="dataPro2")
	void SigInVerification(String a, String b)
	{
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		PageSignInSet2Verification verify=new PageSignInSet2Verification(driver);
		verify.Email(a);
		verify.passWord(b);
		verify.click();
	}
	/**
	 * Data provider from excel sheet for signUp performance 
	 * @return
	 * @throws IOException
	 */
	private static String[][] dataFromExcel1() throws IOException {
		String file="C:\\Users\\kmruge\\Desktop\\Java\\SeleniumPractice\\DataExcel\\NameEmailPassword.xlsx";
		XSSFWorkbook wbook=new XSSFWorkbook(file);
		XSSFSheet sheet=wbook.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		int cellCount=sheet.getRow(0).getLastCellNum();
		String[][] wholeData=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				XSSFRow row=sheet.getRow(i);
				XSSFCell cell=row.getCell(j);
				DataFormatter gi=new DataFormatter();
				String data=gi.formatCellValue(cell);
				wholeData[i-1][j]=data;
				
			}
		}
		return wholeData;
		
	}
	/**
	 * Data provider from excel for signIn performance
	 * @return
	 * @throws IOException
	 */
	private static String[][] dataFromExcel2() throws IOException {
		String file="C:\\Users\\kmruge\\Desktop\\Java\\SeleniumPractice\\DataExcel\\NameEmailPassword.xlsx";
		XSSFWorkbook wbook=new XSSFWorkbook(file);
		XSSFSheet sheet=wbook.getSheetAt(1);
		int rowCount=sheet.getLastRowNum();
		int cellCount=sheet.getRow(0).getLastCellNum();
		String[][] wholeData=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				XSSFRow row=sheet.getRow(i);
				XSSFCell cell=row.getCell(j);
				DataFormatter gi=new DataFormatter();
				String data=gi.formatCellValue(cell);
				wholeData[i-1][j]=data;
				
			}
		}
		return wholeData;
		
	}
}
