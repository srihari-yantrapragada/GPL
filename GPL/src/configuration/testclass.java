package configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class testclass {
	static FileInputStream file=null;
	static HSSFCell scenario_Id;
	static HSSFCell execute;
	static HSSFCell userName;
	static	HSSFCell url;
	
	@Test
	public void readwriteexcel() throws IOException, InterruptedException, ClassNotFoundException
	{
		String package_name="";
		String class_name="";
		Class c=Class.forName(package_name+"."+class_name);
		
		FileInputStream file = new FileInputStream("D:\\Workspace\\IPORTMAN\\Test_Data\\GATEMANAGEMENTtest.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		System.out.println("Number of sheets in this workbook : " + workbook.getNumberOfSheets());
		//HSSFSheet sheet=workbook.getSheet("FormForRoadDispatch");
		HSSFSheet sheet=workbook.getSheetAt(0);
		HSSFRow row;
		int numOfPhysRows = sheet.getPhysicalNumberOfRows();
		for(int j=0; j<10; j++) 
		{
			row = sheet.getRow(j);
			
			String cell_S_ID="",cell_excecute="",cell_userName="";
			String cell_url =null;
			
			scenario_Id=row.getCell(1);
			cell_S_ID = scenario_Id.getStringCellValue();
			System.out.println(cell_S_ID);
			
			userName=row.getCell(5);
			cell_userName = userName.getStringCellValue();
			System.out.println(cell_userName);
			
			url=row.getCell(6);
				try{
					cell_url = url.getStringCellValue();
					}catch(java.lang.IllegalStateException e1){	
						cell_url = String.valueOf((int)url.getNumericCellValue());	
					}
				System.out.println(cell_url);
			
			execute=row.getCell(7);
			cell_excecute = execute.getStringCellValue();
			System.out.println(cell_excecute);
			
			
			
			
			
			
			
			
		Thread.sleep(100);
		file.close();
		Thread.sleep(100);
		FileOutputStream out = new FileOutputStream("D:\\Workspace\\IPORTMAN\\Test_Data\\GATEMANAGEMENTwriteread.xls");
		workbook.write(out);
		out.close();
		}
	}

}
