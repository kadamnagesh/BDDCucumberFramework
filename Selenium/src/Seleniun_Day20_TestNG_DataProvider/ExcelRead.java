package Seleniun_Day20_TestNG_DataProvider;

import java.io.FileInputStream;

public class ExcelRead {
	
//	public static String [][] readExcel(String fileName, String sheetName)
//	{
//		String[][]data=null;
//		
//		try {
//			
//			FileInputStream fis=new FileInputStream(fileName);
//			XSSFWorkbook wb=new XSSFWorkbook(fis);
//			XSSFSheet sh=wb.getSheet(sheetName);
//			XSSFRow row=sh.getRow(0);
//			int noofcols=row.getLastCellNum();  give the column count in the row
//			
//			int noofrows=sh.getPhysicalNumberOfRow();    //get the total used row count (counting from 1)
//			Cell cell;
//			data=new String [noofrows-1][noofcols];
//			for (int i=1;i<noofrows;i++) {
//				for(int j=0; j<noofcols; j++) {
//					
//					row=sh.getRow(i);
//					cell=row.getCell(j)
//					data[i -1][j]=cell.getStringCellValue();		
//				}
//			}
//			catch(Exception e) {
//				System.out.println("the exception is :"+e.getMassage());
//			}
//			return data;
//		}
//	}
  
}
