package configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;

public class DriverOLD { 
	public static WebDriver driver;
    public Selenium selenium;
public static String bStatus,str;
public String mainModuleSTATUS,mainmoduleID,submoduleSTATUS,submoduleID, formmoduleSTATUS,formID,portID,portmoduleSTATUS ;
public String formname,PModuleName,Scenario_Ids,ScenarioStatus,formID1,temp;
public String Task_name,SubTask_Name;
public static String finalTesCaseStatus="";
//public static String excel="C:\\Users\\envision\\Desktop\\iportman_selenium\\Test_Data\\Data_Source_Driver.xls";
@Test
public void navigateToForm() throws BiffException, IOException, WriteException, InterruptedException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
{
	//---------code for port module-----------------------------------------------------------------------------------------------------------------------------------------
	FileInputStream FI=new FileInputStream(GlobalVariables.EXCEL);
	Workbook WB=Workbook.getWorkbook(FI);//port
	Sheet sportmodule=WB.getSheet("Port_Selection");//port
	
	//-------------port loop starts---------------------------------------------------------------------------------------------------------------------------------------
	for (int p = 1; p < sportmodule.getRows(); p++) 
	{
		//System.out.println("----------------port loop starts-----------------");
	// if condition satisfies enter into port module
		if(sportmodule.getCell(3, p).getContents().equalsIgnoreCase("yes"))//port
			{
			portID=sportmodule.getCell(1, p).getContents();
			System.out.println("PORT NAME IS:  "+sportmodule.getCell(2, p).getContents());
	
//---------code for Main module ----------------------------------------------------------------------------------------------------------------------------------------------------------	

Sheet smainmodule=WB.getSheet(" Main_Tasks");// Main_Tasks
//----------------MainModule Loop starts-----------------------------------------------------------------------------------------------------------------------------------
for (int a = 1; a < smainmodule.getRows(); a++) 
{
	//System.out.println("----------------Main loop starts-----------------");
//--- if condition satisfies  enter into main module----------------------------------------------------------------------------------------------------------------------
if(smainmodule.getCell(1, a).getContents().equalsIgnoreCase(portID) 
		&&smainmodule.getCell(5, a).getContents().equalsIgnoreCase("yes"))//mm
	{
	 mainmoduleID=smainmodule.getCell(3, a).getContents();
	 System.out.println("MAIN MODULE NAME IS:  "+smainmodule.getCell(4,a).getContents());
 //------code for sub module ----------------------------------------------------------------------------------------------------------------------------------------------
	
	Sheet ssub=WB.getSheet(" Sub_Tasks");// Sub_Tasks
	
//----subModule Loop starts ---------------------------------------------------------------------------------------------------------------------------------------------
	for (int b = 1; b < ssub.getRows(); b++) 
	{
		//System.out.println("----------------sub loop starts-----------------");
//---if condition satisfies enter into sub module-------------------------------------------------------------------------------------------------------------------------
		if(ssub.getCell(1, b).getContents().equalsIgnoreCase(portID) 
				&&ssub.getCell(3, b).getContents().equalsIgnoreCase(mainmoduleID) 
				&& ssub.getCell(7, b).getContents().equalsIgnoreCase("yes")) //sm
		{
			 submoduleID=ssub.getCell(5, b).getContents();
		 System.out.println("SUB MODULE NAME IS:  "+ssub.getCell(6, b).getContents());
//-----code for form module------------------------------------------------------------------------------------------------------------------------------------------------
		
			Sheet sform=WB.getSheet(" Respective_Forms");// Respective_Forms
			
//----------------forms loop starts----------------------------------------------------------------------------------------------------------------------------------------
	 		for (int c = 1; c < sform.getRows(); c++) 
	 		{
	 		//System.out.println("----------------form loop starts--"+c);
//--if condition satisfies enter into form module-------------------------------------------------------------------------------------------------------------------------- 			
	 			if(sform.getCell(1, c).getContents().equalsIgnoreCase(portID)
	 					&&sform.getCell(3, c).getContents().equalsIgnoreCase(mainmoduleID) 
	 					&&sform.getCell(5, c).getContents().equalsIgnoreCase(submoduleID) 
	 					&& sform.getCell(10, c).getContents().equalsIgnoreCase("yes"))
	 			{
	 				/*coded on 19th august for getting Task name and sub task name*/
	 				Task_name=sform.getCell(4, c).getContents();	
	 				SubTask_Name=sform.getCell(6, c).getContents();	
	 				/*end*/
	 				
	 			  formID=sform.getCell(7, c).getContents();	
	 			 PModuleName=sform.getCell(8, c).getContents();//2
	 			 formname=sform.getCell(9, c).getContents();//1
	 			//System.out.println(c);
	 			 System.out.println("form MODULE NAME IS:  "+sform.getCell(9, c).getContents());
//--------------CODE FOR sCENARIOS--------------------------------------//	
	 			
				Sheet sScenario=WB.getSheet(" Scenarios");// Scenarios
				//----------------scenario loop starts----------------------------------------------------------------------------------------------------------------------------------------
		 		if(sform.getCell(9, c).getContents().equalsIgnoreCase(formname))
		 		{
		 		
		 		
				String oldFormId = null;
				String requiredFormId = null;
				 List<String> scenarios = new ArrayList<String>();	

				for (int d = 3; d < sScenario.getRows(); d++) 
		 		{
					//System.out.println(d);
		
					String getformname=sScenario.getCell(9, d).getContents(); 
					//System.out.println("getformname="+getformname);
					  formID1=sScenario.getCell(7, d).getContents(); 
					  
					//  System.out.println("preformID1="+formID1);
					  String executeName = sScenario.getCell(12,d).getContents();
					  
					  if(formID1!=null && formID==formID1&& getformname==formname &&  executeName.equals("YES")){
					 temp=formname;
					  scenarios.add(sScenario.getCell(10,d).getContents());
						  System.out.println(scenarios);
						  continue;
					  }
					  
					  if(oldFormId != null  && oldFormId != formID1 && executeName.equals("YES") && temp==formname ){
						  System.out.println("executed");
					 //finalTesCaseStatus=ReadExcelAndGetCellValues.sendFormName(PModuleName+"."+formname,scenarios);//6
				// finalTesCaseStatus=ReadWriteExcel.sendFormName(PModuleName+"."+formname,scenarios);//6
				//coded on 19 th august
				 finalTesCaseStatus=ReadWriteExcelOLD.sendFormName(Task_name+"."+SubTask_Name+"."+PModuleName+"."+formname,scenarios);//6
				 break;
					  }
					  
					  oldFormId=formID1;
				//	System.out.println("old="+oldFormId);	
		 		
		 		}//scenario for loop ends
	 		}
//---------CODE FOR sCENARIOS ENDS--------------------------------------//	  				
	 			//	System.out.println("form "+c	 +":"+ sform.getCell(9, c).getContents()  +" executed");
	 				formmoduleSTATUS="form executed";	
	 			}//inner if closed form
	 			else
	 			{
	 				//System.out.println("form "+c +":"+ sform.getCell(9, c).getContents()  +" not executed");
	 				formmoduleSTATUS="form not executed";
	 			}						
				//System.out.println("----------------form loop end--"+c);
	 		}//form loop ends
	 		
//-------	code for form module ends-----------------------------------------------------------------------------------------------------------------------------------		
			
			//System.out.println("sub module"+ b +":"+ ssub.getCell(6, b).getContents() +" executed");
			submoduleSTATUS="sub module executed";
		}//sub module if ends
		else
		{
			//System.out.println("sub module"+ b +":"+ ssub.getCell(6, b).getContents() +" not executed");
			submoduleSTATUS="sub module not executed";
		}//sub module else ends
		
		//System.out.println("----------------sub loop end--"+b);
	}//submodule loop ends
//-------- code for sub module ends------------------------------------------------------------------------------------------------------------------------------------
	
	 //System.out.println("Mainmodule executed");
	 
	 mainModuleSTATUS="main module executed";
	}//main module  if end
else//main module
{
	 //System.out.println("Mainmodule not executed");
	 mainModuleSTATUS="main module not executed";
}//main module else end

}//main module for loop end
//-----------------code for main module ends---------------------------------------------------------------------------------------------------------------------------------------------------------
//System.out.println("port module executed");
portmoduleSTATUS="port executed";

			}//port if ends
		else//port
		{
			// System.out.println("portmodule not executed");
			 portmoduleSTATUS="port module not executed";
		}//port else end

		}	//port for loop end
//---------code for port module ends------------------------------------------------------------------------------------------------------------------------------------

}

//--------------NAVIGATE TO FORM method ends-----------------------------------------------------------//


}



















































