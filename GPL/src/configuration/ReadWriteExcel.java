package configuration;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;


public class ReadWriteExcel {

	static FileInputStream file=null;
	static String testCaseStatus="";
	static String scenario_Id="Default";
	static String execute="Default";
	static String userName;
	static	String url;
	static String onlyClasName;

	public static String sendFormName(String formName,List<String> scernarioIds ) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InterruptedException, BiffException, RowsExceededException, WriteException
	{
		//String a=formName.trim().split("\\.")[0];
		//String b=formName.trim().split("\\.")[1];
		//coded on 19th august
		String d=formName.trim().split("\\.")[2];
		String e=formName.trim().split("\\.")[3];
		
		Class c=Class.forName(d+"."+e);
		FileInputStream file = new FileInputStream("D:\\Workspace\\IPORTMAN\\Test_Data\\GATEMANAGEMENT.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(file);

		System.out.println("Number of sheets in this workbook : " + workbook.getNumberOfSheets());
		HSSFSheet sheet=null;
		HSSFRow row;
		HSSFCell scenario_Id, userName, url, execute, cell, cell_start_time;
		//String cell_S_ID,cell_userName,cell_url,cell_excecute;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
		String date=simpleDateFormat.format(new Date());

		for (int i = 0; i < workbook.getNumberOfSheets(); i++)
		{
			if(	workbook.getSheetName(i).equalsIgnoreCase(e))
			{
				
				
				
				sheet=workbook.getSheetAt(i);
				int numOfPhysRows = sheet.getPhysicalNumberOfRows();
				for(int j=0; j<numOfPhysRows; j++)
				{
					row = sheet.getRow(j);
					
					String cell_S_ID="",cell_excecute="",cell_userName="";
					String cell_url =null;
					
					scenario_Id=row.getCell(1);
					cell_S_ID = scenario_Id.getStringCellValue();
					
					userName=row.getCell(5);
					cell_userName = userName.getStringCellValue();
					
					url=row.getCell(6);
						try{
							cell_url = url.getStringCellValue();
							}catch(java.lang.IllegalStateException e1){	
								cell_url = String.valueOf((int)url.getNumericCellValue());	
							}
					
					execute=row.getCell(7);
					cell_excecute = execute.getStringCellValue();
					
					for (String string : scernarioIds)

					{

						System.out.println(string);

						if ( cell_S_ID.equalsIgnoreCase(string) && cell_excecute.equalsIgnoreCase("Yes"))
						{
							string="Default".trim();
							cell_excecute="Default".trim();
                                                       //method name     method parameters 
						Method m = c.getDeclaredMethod(cell_S_ID.trim(), new Class[] { String[].class, String[].class });/////////////////
						System.out.println(m);
							//Method m = c.getDeclaredMethod(cell_S_ID.trim());
							Object object = c.newInstance();//new object instance for class
							
							
							System.out.println(object);
							String arr1[]=new String[10];
							String arr2[]=new String[10];
							arr1[0]= cell_userName;
							arr2[0]=cell_url;
							//for placing start time in excel//
							System.out.println("=====================j value rownum==========="+j);
							System.out.println("==================row "+ sheet.getRow(j));
							cell_start_time = sheet.getRow(j).getCell(9);
							
							if(cell_start_time == null)
								cell_start_time= sheet.getRow(j).createCell(9);
							
							System.out.println("=================cell start===="+cell_start_time);
							cell_start_time.setCellValue(date);
							//---------------------------------//
							testCaseStatus =m.invoke(object, new Object[] { arr1,arr2}).toString();///////////////////
							System.out.println("STATUS IS::::"+testCaseStatus);
							System.out.println("========="+cell_S_ID +" method Execution completed===========");
							//return  testCaseStatus;
						}
					}

					HSSFCellStyle cellStylepass = workbook.createCellStyle();
					//cellStylepass = workbook.createCellStyle();
					cellStylepass.setFillForegroundColor(HSSFColor.GREEN.index);
					cellStylepass.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);


					HSSFCellStyle cellStylefail = workbook.createCellStyle();
					//cellStylefail = workbook.createCellStyle();
					cellStylefail.setFillForegroundColor(HSSFColor.RED.index);
					cellStylefail.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

					if (testCaseStatus == "pass") {
						cell = sheet.getRow(j).getCell(8);
						cell.setCellValue("PASS");
						cell.setCellStyle(cellStylepass);
						//for placing end time in excel//
						cell_start_time = sheet.getRow(j).getCell(10);
						
						if(cell_start_time == null)
							cell_start_time= sheet.getRow(j).createCell(10);
						
						cell_start_time.setCellValue(date);
						//---------------------------------//

					} else if (testCaseStatus == "fail") {
						cell = sheet.getRow(j).getCell(8);
						cell.setCellValue("FAIL");
						cell.setCellStyle(cellStylefail);
						//for placing end time in excel//
						cell_start_time = sheet.getRow(j).getCell(10);
						
						if(cell_start_time == null)
							cell_start_time= sheet.getRow(j).createCell(10);
						
						cell_start_time.setCellValue(date);
						//---------------------------------//
					}
					testCaseStatus="";
					Thread.sleep(100);
					file.close();
					Thread.sleep(100);
					FileOutputStream out = new FileOutputStream("D:\\Workspace\\IPORTMAN\\Test_Data\\GATEMANAGEMENT.xls");
					workbook.write(out);
					out.close();		
				}//for loop for rows

			}//if sheet equals

		}//for loop for no of sheets

		return testCaseStatus;             				
	}

	}












