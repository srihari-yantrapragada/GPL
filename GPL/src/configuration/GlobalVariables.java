package configuration;

import org.openqa.selenium.WebDriver;

public class GlobalVariables {

	
	public static String GVariable="";

	public static WebDriver driver;
   // public Selenium selenium;
   
	public static String EXCEL="D:\\Workspace\\IPORTMAN\\Test_Data\\Data_Source_Driver.xls";
//	static WebDriverWait wait = new WebDriverWait(driver, 10);
	 
	/*public static String FIRNo="";
	public static String FRDNo="";*/
	public static String runtimevalue="";
	
    public static double EOTotalQty=0;
    public static double EOOpenQty=0;
    
    public static double PSP_TotalQty=0;
    public static double PSP_PortReceiptQty=0;
    public static double PSP_ShippingBillOpenQty=0;
    public static String PSP_TransportationType="";
    
    public static double SBE_TotalQty=0;
    public static double SBE_OpenQty=0;
    public static double SBP_TotalQty=0;
    public static double SBP_OpenQty =0;
    
    public static double FIR_TotalQty=0;
    public static double FIR_AccumulateREceiptQty=0;
    public static  double FIR_BalanceQty=0;
    public static double FIR_ReceiptQty=0;
    
  //declare variable names formName_variableName
    public static String InGateTruckNo="";
    
    
    //----------------------------------------form for road dispatch-----------------------------------------//
    public static int iTimeOutms = 3000;
    public static double DO_TotalQty=0;
    public static double DO_OpenQty=0;
    public static double DO_DispatchedQty=0;
    
    
}
