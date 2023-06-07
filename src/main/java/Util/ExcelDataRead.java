package Util;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {
	
	public static void main(String[] args) throws IOException {
		String fileName="./DataExcel/DataForDataDriven.xlsx";
		XSSFWorkbook wbook=new XSSFWorkbook(fileName);
		XSSFSheet sheet=wbook.getSheetAt(0); //0 refer excel sheet index
		int lastrow=sheet.getLastRowNum();
		System.out.println("No.of Row " +lastrow);
		int incluHead=sheet.getPhysicalNumberOfRows();
		System.out.println("No.of row inclusive of heading "+ incluHead);
		int lastcell=sheet.getRow(0).getLastCellNum();
		System.out.println("No.of column "+lastcell);
		for(int i=1;i<=lastrow;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<lastcell;j++)
			{
				XSSFCell cell=row.getCell(j);
				DataFormatter diff=new DataFormatter();
				String value=diff.formatCellValue(cell);
				System.out.println(value);
			}
		}
		wbook.close();
	}

}
