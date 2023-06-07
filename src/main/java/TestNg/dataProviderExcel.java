package TestNg;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataProviderExcel {

	public static String[][] readExcel() throws IOException
	{
		System.out.println("out");
		String excelLocation="C:\\Users\\kmruge\\Desktop\\Java\\SeleniumPractice\\DataExcel\\DataForDataDriven.xlsx";
		XSSFWorkbook work=new XSSFWorkbook(excelLocation);
		XSSFSheet sheet=work.getSheetAt(0);
		int lastRow=sheet.getLastRowNum();
		System.out.println(lastRow);
		int lastCell=sheet.getRow(0).getLastCellNum();
		System.out.println(lastRow+ " "+lastCell);
		String[][] data= new String[lastRow][lastCell];
		for(int i=1;i<=lastRow;i++)
		{
			for(int j=0;j<lastCell;j++)
			{
				XSSFRow row=sheet.getRow(i);
				XSSFCell cell=row.getCell(j);
				DataFormatter hi=new DataFormatter();
				String value=hi.formatCellValue(cell);
				data[i-1][j]=value;
			}
		}
		
		return data;
	}
}
