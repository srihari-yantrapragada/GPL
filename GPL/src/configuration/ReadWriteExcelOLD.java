
package configuration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Colour;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;




import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.VerticalAlignment;


public class ReadWriteExcelOLD {
	
	static FileInputStream file=null;
	static String testCaseStatus="";
	static String scenario_Id="Default";
	static String execute="Default";
	static String userName;
	static	String url;
	static String onlyClasName;
	
	public static String sendFormName(String formName,List<String> scernarioIds ) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InterruptedException, BiffException, RowsExceededException, WriteException
	{
		
	String a=formName.trim().split("\\.")[0];
	String b=formName.trim().split("\\.")[1];
	//coded on 19th august
	String d=formName.trim().split("\\.")[2];
	String e=formName.trim().split("\\.")[3];
	
	
	 Class c=Class.forName(d+"."+e);
	 String Ofile="D:\\Workspace\\IPORTMAN\\Test_Output\\"+a+"\\"+b+"\\"+d+"\\"+e+" "+ Reusable.now()+".xls";
	 
	 Workbook workbook = Workbook.getWorkbook(new File("D:\\Workspace\\IPORTMAN\\Test_Data\\GATEMANAGEMENT.xls"));
	 System.out.println("Number of sheets in this workbook : " + workbook.getNumberOfSheets());
	 String [] sheetNames = workbook.getSheetNames();
	 Sheet sheet=null;
	 
	 FileOutputStream fo=new FileOutputStream(Ofile);
	 WritableWorkbook wb=Workbook.createWorkbook(fo);
	 
	    for (int i = 0 ; i < sheetNames.length ; i ++ ) {
	    	
/*WritableSheet forname;
formName=Integer.toString(i);*/

	    	 WritableSheet ws = wb.createSheet(e,0);
	    	
	    	 if(sheetNames[i].equalsIgnoreCase(e)){
	    		 sheet=workbook.getSheet(sheetNames[i]);
	    		 for(int j=0; j<sheet.getRows(); j++)
	    		 {
	    			 scenario_Id=sheet.getCell(1,j).getContents();
	    			 userName=sheet.getCell(5,j).getContents();
	    			 url=sheet.getCell(6,j).getContents();
	    			 execute=sheet.getCell(7,j).getContents();
            			 //  for(int j =0; j < temp.length ; j++)
            			   
        			   /*Iterator<String> iterateScenarioIds = scernarioIds.iterator();		
        				
        				while(iterateScenarioIds.hasNext())*/
	    				 for (String string : scernarioIds)
        				
        			   {
        			 
        					//String string=iterateScenarioIds.next();
        					System.out.println(string);
        					
        					if ( scenario_Id.equalsIgnoreCase(string) && execute.equalsIgnoreCase("Yes")) {

        				  // testCaseStatus=ExportOrder.S_01(userName,url);
        				   string="Default".trim();
        				   execute="Default".trim();
        				  
        				   
        				   Method m = c.getDeclaredMethod(scenario_Id.trim(), new Class[] { String[].class, String[].class });
        				      Object object = c.newInstance();
        				      String arr1[]=new String[10];
        				      String arr2[]=new String[10];
        				       arr1[0]= userName;
        				       arr2[0]=url;
        				       testCaseStatus =m.invoke(object, new Object[] { arr1,arr2}).toString();
        				       System.out.println("STATUS IS::::"+testCaseStatus);
        				       System.out.println("========="+scenario_Id +" method Execution completed===========");
        				   //return  testCaseStatus;
        			   }
        			
        			   
        			
        			   }
	    				 WritableFont cellFont= new WritableFont(WritableFont.TIMES, 12);
	    					WritableCellFormat cellFormat_pass = new WritableCellFormat(cellFont);
	    					cellFormat_pass.setBackground(Colour.BRIGHT_GREEN);
	    					cellFormat_pass.setBorder(Border.ALL, BorderLineStyle.THIN);
	    					cellFormat_pass.setAlignment(Alignment.CENTRE);
	    					
	    					WritableCellFormat cellFormat_fail = new WritableCellFormat(cellFont);
	    					cellFormat_fail.setBackground(Colour.RED);
	    					cellFormat_fail.setBorder(Border.ALL, BorderLineStyle.THIN);
	    					cellFormat_fail.setAlignment(Alignment.CENTRE);
	    					
	    					WritableCellFormat cellFormat_null = new WritableCellFormat(cellFont);
	    					cellFormat_null.setBackground(Colour.WHITE);
	    					
	    					
	    					 int row = 0;
	    					    int heightInPoints = 26*20;
	    					    ws.setRowView(row, heightInPoints);
	    					   // ws.addCell(new Label(1, row, "A", cellFormat)); 
	    				 
	    					WritableCellFormat cellFormat1 = new WritableCellFormat(cellFont);
	    				    cellFormat1.setBackground(Colour.AQUA);
	    				    cellFormat1.setBorder(Border.ALL, BorderLineStyle.THIN);
	    				    cellFormat1.setAlignment(Alignment.CENTRE);
	    				    cellFormat1.setVerticalAlignment(VerticalAlignment.CENTRE);
	    				      
	    				    
	    				     
	    				    
	    					//int col = 2;
	    				  //  int widthInChars = 30;
	    				    ws.setColumnView(0, 5);
	    				    ws.addCell(new Label(0, 0, "S.N0",cellFormat1));  
	    				    
	    				    ws.setColumnView(1, 6);
	    				    ws.addCell(new Label(1, 0, "S_ID",cellFormat1)); 
	    					
	    				    ws.setColumnView(2, 30);
	    				    ws.addCell(new Label(2, 0, "Scenario_Name",cellFormat1));  
	    				    
	    				    ws.setColumnView(3, 8);
	    				    ws.addCell(new Label(3, 0, "Steps",cellFormat1)); 
	    				    
	    				    ws.setColumnView(4, 37);
	    				    ws.addCell(new Label(4, 0, "Action",cellFormat1));  
	    				   
	    				    
	    				    ws.setColumnView(5, 35);
	    				    ws.addCell(new Label(5, 0, "Object_Repository",cellFormat1)); 
	    					
	    				    ws.setColumnView(6, 35);
	    				    ws.addCell(new Label(6, 0, "Test_Data",cellFormat1));  
	    				    
	    				    ws.setColumnView(7, 9);
	    				    ws.addCell(new Label(7, 0, "YES/NO",cellFormat1)); 
	    				    
	    				    ws.setColumnView(8, 23);
	    				    ws.addCell(new Label(8, 0, "PASS/FAIL",cellFormat1)); 
	    				    
	    				 for (int k = 0; k < sheet.getColumns(); k++) {
	    					 String dummy=sheet.getCell(k, j).getContents();
	    					 System.out.println(dummy);
	    				  		Label un=new Label(k, j, sheet.getCell(k, j).getContents());
	    				  		ws.addCell(un);
	    				  	//	System.out.println(un);
	    				  	}
	    				if(testCaseStatus == "pass")
	    				{
	    				 Label result=new Label(8, j, testCaseStatus,cellFormat_pass);
	    				 System.out.println(testCaseStatus);
	    					ws.addCell(result);
	    				}
	    				else if(testCaseStatus == "fail"){
	    					 Label result=new Label(8, j, testCaseStatus,cellFormat_fail);
		    				 System.out.println(testCaseStatus);
		    					ws.addCell(result);
	    				}
	    				
	    					testCaseStatus="";
	    					Label result=new Label(8, j, testCaseStatus,cellFormat_null);
	    					
	    			
	    					
	    		 }//for loop for rows
	    		 
	    		 
	    		 wb.write();
	    		 wb.close();
	    		 
	    		 
	    	 }//if sheet equals
	    	 
	      }//for loop for no of sheets
			         			  
	    return testCaseStatus;             				
                        			   
                        			
                        			   
		
	}
	
	public static String GetSysDate() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String date= sdf.format(cal.getTime());
		date=date.replace("/","_");
		date = date.replace(":","_");
		date = date.replace(" ","_");
		return date;
	}
}
