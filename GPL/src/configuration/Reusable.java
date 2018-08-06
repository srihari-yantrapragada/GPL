package configuration;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Reusable {
	
	public static String str;
	public static double value1 ;
	public static WebDriver driver;
	//public static Selenium selenium;
	public static boolean bStatus;
	
	
	public static String now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");
		return sdf.format(cal.getTime());
	}
	  
//------------------->LAUNCH APP<------------------------------------------------------------------------------------------------------------------------------------------------
	public static String launchapp(String[] username, String[] url)
	   {
		System.setProperty("webdriver.gecko.driver", "D:\\Workspace\\library\\geckodriver.exe");
		driver = new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\library\\chromedriver.exe"); 
		 driver = new ChromeDriver();
		*/
		    driver.manage().window().maximize();
		    // String str1= driver.getTitle();
		    // if(str1=="iPortman : LoginPage")
		     //System.out.println(str1);
		     if(driver.findElement(By.name(username[0])).isDisplayed())//checking wheter user name is displayed or not
		   {   
			   str="pass";
		  //Assert.assertEquals(str, "iPortman : LoginPage");
		   }
			   else{
				   str="fail";
			   }
			return str;    
		}
	
	public static String closebrowser(String[] username, String[] url)
	{
		driver.close();
		return str="pass";
		
	}
//------------------------------------>LOGIN<-----------------------------------------------------------------------------------------------------------------------------------
	//public static String login(String[] username, String[] password,String usergreet)
	public static String login(String[] loc, String[] values) throws InterruptedException
	{
		String a[]=loc[0].split(",");
		String b[]=values[0].split(",");
		driver.findElement(By.name(a[0])).sendKeys(b[0]);
		 // selenium.type(a[0], b[0]);//entering user name into textboc
		driver.findElement(By.name(a[1])).sendKeys(b[1]);
	     // selenium.type(a[1], b[1]);// entering password into textbox
		driver.findElement(By.name(a[2])).click();
	    //  selenium.click(a[2]);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     // selenium.waitForPageToLoad("3000");
	      if(driver.findElement(By.id(a[3])).isDisplayed())//checking welcome msg is displayed or not after login
	      {
	    	//  GlobalVariables.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[3]/div[3]/div[1]/div[1]/div")));  
	    	  driver.findElement(By.xpath("html/body/div[3]/div[3]/div[1]/div[1]/div")).click();
	    	  str="pass";
	      }
	      else
	      {
	    	  str="fail";
	      }
	      //Thread.sleep(2000);
		return str;
	      
		  
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//click on new button
	public static String clicknew(String[] elementloc, String[] noelement) throws InterruptedException
	{
		String[] a=elementloc[0].split(",");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//selenium.waitForPageToLoad("3000");
		 selenium.click(a[0]);//click on element
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#tabContainer_tablist_tabs_details > span.tabLabel")).click();
		// selenium.click("css=#tabContainer_tablist_tabs_details > span.tabLabel");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(driver.findElement(By.id(a[1] )).isDisplayed())
		{
			str="pass";
		}
		else
		{
			str="fail";
		}
		return str;
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	/*// Navigate to form method for 2 parameters
			public static String form2(String main, String form) {
				selenium.waitForPageToLoad("3000");
			
				 selenium.click(main);
				 selenium.waitForPageToLoad("30000");
				 selenium.click(form);
				return null;
				
			}		
			// Navigate to form method for 3 parameters
			public static String  form3(String main, String sub, String form) {
				selenium.waitForPageToLoad("3000");
				 selenium.click(main);
				 selenium.waitForPageToLoad("3000");
				 selenium.click(sub);
				 selenium.waitForPageToLoad("3000");
				 selenium.click(form);
				return null;
			
		    }
			// Navigate to form method for 4 parameters
			public static String form4(String main, String sub, String subsub,String form) {
				selenium.waitForPageToLoad("3000");
				 selenium.click(main);
				 selenium.waitForPageToLoad("3000");
				 selenium.click(sub);
				 selenium.waitForPageToLoad("3000");
				 selenium.click(subsub);
				 selenium.waitForPageToLoad("3000");
				 selenium.click(form);
				return null;
		   }*/
	// Navigate to form calling method
			public static String navigation(String[] noelement, String[] form) throws InterruptedException
			{
				String[] a=form[0].split(",");
				//selenium.click("xpath=html/body/div[3]/div[3]/div[1]/div[1]/div");
				Thread.sleep(2000);

				 driver.findElement(By.id("searchText")).clear();
                driver.findElement(By.id("searchText")).sendKeys(a[0]);
                Thread.sleep(2000);
				driver.findElement(By.id("searchText")).sendKeys(Keys.ARROW_DOWN);
		        driver.findElement(By.id("searchText")).sendKeys(Keys.ENTER);
		        Thread.sleep(2000);
				return str="pass";
			}
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
//verify mandatory fields
	public static String verifymanadatoryfiellds(String[] man)
	{
		String a[]=man[0].split(",");
		selenium.click(a[0]);//clicking on details tab to make active all fields
		selenium.waitForPageToLoad("30000");
		selenium.click(a[1]);//clicking on save button
		if((selenium.isTextPresent(a[2].trim())))//checking text fields Marked with * are mandatory
		//if(driver.findElement(By.id(man[2])).isDisplayed())
		{
			System.out.println(a[2]);
			str="pass";
			
		}
		else
		{
			System.out.println("not present this text"+a[2]);
			str="fail";
		}
		return str;
		
	}
	//----------enter truckno------------------------------------------------------------------------------------------------
	
	//------------------------------validatating data-------------------------------------------------------------------------------------------------------------------------
	private static String validatingdata(String str) throws MyExceptionClass 
	{
	for(int i = 0; i < str.length(); i++) {
		if(!Character.isLetterOrDigit(str.charAt(i)))
		{
		System.out.println("error");
		throw new MyExceptionClass("INVALID CHARACTER" );
		
		}
	}
	return str;
			
		}
//--------------------------------------------------------------------------------------------------------------
	
	
	
	public static String entertrucknovalidation(String[] loc, String[] text) throws InterruptedException
	{
		
		Thread.sleep(2000);
		String a[]=loc[0].split(",");
		String b[]=text[0].split(",");
		driver.findElement(By.id(a[0])).click();
		driver.findElement(By.id(a[1])).sendKeys(b[0]);
		driver.findElement(By.id(a[1])).sendKeys(Keys.TAB);
		if(driver.findElement(By.id(a[2])).isDisplayed())//checking wheter user name is displayed or not
{
	   
	   str="pass";

}
	   else{
		   str="fail";
	   }
		return str;
		
	}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		//entering data into text fields
	public static String entertext(String[] loc, String[] text) throws InterruptedException
	
	
	{
		
		String a[]=loc[0].split(",");
		String b[]=text[0].split(",");
		String data=b[0];
		//try{
			//validatingdata(data);
			selenium.type(a[0], b[0]);
			//driver.findElement(By.id(a[0])).sendKeys(Keys.TAB);
			str="pass";
		//}catch (MyExceptionClass myexp) {
			//System.out.println(myexp);
			//str="fail";
		//}
		Thread.sleep(2000);
		return str;
		
	}
	
	public static String entertextclick(String[] loc, String[] noelement) throws InterruptedException
	{
		String a[]=loc[0].split(",");
		//String b[]=text[0].split(",");
		//selenium.type(a[0], b[0]);
		driver.findElement(By.id(a[0])).sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		return str="pass";
		
	}
	
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//for saving the record
public static String save(String[] save, String[] noelenent) throws InterruptedException
{
	String a[]=save[0].split(",");
	Thread.sleep(2000);
	selenium.click(a[0]);
	IsAlertPresent();
//	selenium.waitForPageToLoad("30000");
//	selenium.click(save[1]);
	if((selenium.isTextPresent(a[1].trim())))//checking text fields Marked with * are mandatory
	{
		str="pass";
	}else
		{
			str="fail";
		}
		return str;
}

public static void IsAlertPresent()
{
	
	String Alert_Type=null;
	forwardToClick:{
	try {
		Thread.sleep(2000);
		
		if(driver.findElement(By.id("alertBut")).isDisplayed()){
		   Alert_Type="save";
		   break forwardToClick;
		}
		else if(driver.findElement(By.id("alertButForUpdate")).isDisplayed()){
			   Alert_Type="update";	
			   break forwardToClick;
		}
		else if(driver.findElement(By.id("alertButForApproved")).isDisplayed())//added else block on 14-09-2015 
		{
			Alert_Type="approve";
			 break forwardToClick;
		}
		
		else if(Alert_Type==null){
			Thread.sleep(2000);
			/*WebElement element = driver.findElement(By.id("alertButForApproved"));
			//element.isDisplayed();
			Actions builder = new Actions(driver);
	    	builder.moveToElement(element).click().perform();
			*/
			driver.findElement(By.id("alertButForApproved")).isDisplayed();
			Alert_Type="approve";	
		}
    }
    catch (InterruptedException e) {
		e.printStackTrace();
		
	}
	}
    switch(Alert_Type){
    case "save":
    	driver.findElement(By.id("alertBut")).click();
    	break;
    case "update":
       	driver.findElement(By.id("alertButForUpdate")).click();
    	break;
    case "approve":
       	driver.findElement(By.id("alertButForApproved")).click();
    	break;
    default:
    	
    	break;
    }
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//for clicking the poup and selecting the data from opened poup
public static String popup(String[] loc, String[] PData) throws InterruptedException{	
		String a[]=loc[0].split(",");
		String b[]=PData[0].split(",");
	
	String parentHandle = driver.getWindowHandle();// get the current window handle
	String data=b[0];// data that should clicked in opened popupwindow
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(Bylocator(a[0], a[1])).click();
	
	for (String winHandle : driver.getWindowHandles()) {
	    driver.switchTo().window(winHandle); 
	}
         Thread.sleep(5000);
       //code to enter into webtable*********
         List<WebElement> str1=driver.findElements(By.tagName("td"));
       for(int j=0; j<str1.size(); j++) {
             if(str1.get(j).getText().equalsIgnoreCase(data)) {
            str1.get(j).click();
            str="pass";
            break;
             }else {
            	str="fail";
            }
         }
   
      driver.switchTo().window(parentHandle);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      return str;
}
//for clicking the sedcond poup and selecting the data from opened poup
public static String popup1(String[] loc, String[] PData) throws InterruptedException
{
	String a[]=loc[0].split(",");
	//String b[]=PData[0].split(",");
	
	
	String parentHandle = driver.getWindowHandle();// get the current window handle
	
	String data=GlobalVariables.runtimevalue;//GlobalVariables.FIRNo;// data that should clicked in opened popupwindow
	selenium.click(a[0]); // click some link that opens a new window
	for (String winHandle : driver.getWindowHandles()) 
	{
	    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
	    //System.out.println("name1"+winHandle);
	}
       Thread.sleep(5000);
     //code to enter into webtable*********
       List<WebElement> str1=driver.findElements(By.tagName("td"));
       // System.out.println(str.size());
     for(int j=0; j<str1.size(); j++)
  {
         // System.out.println(str.get(j).getText()); //str[i]
          if(str1.get(j).getText().equalsIgnoreCase(data))
          {
          str1.get(j).click();
          str="pass";
          break;
           }
         
   }
    driver.switchTo().window(parentHandle);
    Thread.sleep(5000);
    return str;
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//copy exportorder from prestacking permission through action items
public static String CopyFromActionitems(String[] copy, String[] noelement) throws InterruptedException
{
	String a[]=copy[0].split(",");
	
	String parentHandle = driver.getWindowHandle();
	Thread.sleep(3000);
	try{//added try statement on 14-09-2015 to hjandle copfrom action failed
	driver.findElement(Bylocator(a[0], a[1])).click();//action items
	Thread.sleep(2000);
	driver.findElement(Bylocator(a[2], a[3])).click();//copy from
	Thread.sleep(2000);
	driver.findElement(Bylocator(a[4], a[5])).click();//pre stacking
	
	
	for (String winHandle : driver.getWindowHandles()) {
	    driver.switchTo().window(winHandle); 
	}
	
	driver.manage().window().maximize() ;
	Thread.sleep(2000);
	driver.findElement(Bylocator(a[6], a[7])).click();
	Thread.sleep(2000);
	driver.findElement(Bylocator(a[8], a[9])).click();

	driver.switchTo().window(parentHandle);
	IsAlertPresent();
		return str="pass";
	}
		 catch (NoSuchElementException e) {
			 e.printStackTrace();
		        return str="fail"+e;
		    }
		
}
//copy exportorder from prestacking permission through action items for break bulk
public static String CopyFromActionitemsforBreakBulk(String[] copy, String[] element) throws InterruptedException
{
	Thread.sleep(3000);
	String a[]=copy[0].split(",");
	String b[]=element[0].split(",");
	 String parentHandle = driver.getWindowHandle();
		selenium.click(a[0]);
	//	Thread.sleep(2000);
		selenium.click(a[1]);
		Thread.sleep(2000);
		selenium.click(a[2]);
		Thread.sleep(3000);
		
		 for (String winHandle : driver.getWindowHandles()) 
		 {
		    driver.switchTo().window(winHandle); 
		    driver.manage().window().maximize();
		 }
		 Thread.sleep(3000); 
		 selenium.click(a[3]);
		 Thread.sleep(2000);
		 selenium.type(a[4],b[0]);
		 Thread.sleep(1000);
		 selenium.click(a[5]);
		 
		 driver.switchTo().window(parentHandle);
		 Thread.sleep(3000);
	 			 IsAlertPresent();
	 			Thread.sleep(2000);
		return str="pass";

}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//method for approval
public static String Approval(String[] approve, String[] noelement) throws InterruptedException
{
	String a[]=approve[0].split(",");
	selenium.click(a[0]);
	Thread.sleep(3000);
	selenium.click(a[1]);
	Thread.sleep(2000);
	IsAlertPresent();
		Thread.sleep(2000);
	
	return str="pass";
	
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public static String Selectfromlist(String[] listloc, String[] listvalue) throws InterruptedException
{
	//String a[]=listloc[0].split(",");
	//String b[]=listvalue[0].split(",");
	Thread.sleep(3000);
    selenium.type(listloc[0], listvalue[0]);
    driver.findElement(By.id(listloc[0])).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    driver.findElement(By.className("odd")).click();
    Thread.sleep(2000);
	return str="pass";
}
//2nd version
public static String Selectfromlist1(String[] listloc, String[] listvalue) throws InterruptedException
{
	//String a[]=listloc[0].split(",");
	//String b[]=listvalue[0].split(",");
	Thread.sleep(3000);
	selenium.type(listloc[0], GlobalVariables.runtimevalue);	//    selenium.type(listloc[0], GlobalVariables.FIRNo);
    driver.findElement(By.id(listloc[0])).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
   // driver.findElement(By.className("odd")).click();
    driver.findElement(By.xpath("//*[@id='tableFilter']/tbody[2]/tr")).click();
    Thread.sleep(2000);
	return str="pass";
}
//-----------------------------------------capture---------------------------------------------------------------------------------------------------------------------------------------
public static String capture(String[] capture, String[] noelement) {
	
	GlobalVariables.runtimevalue=driver.findElement(By.id(capture[0])).getAttribute("value");//GlobalVariables.FIRNo=driver.findElement(By.id(capture[0])).getAttribute("value");
	//System.out.println(GlobalVariables.FIRNo);
	
	return str="pass";
}

public static String captureTruckNo(String[] capture, String[] noelement) {
	
	GlobalVariables.InGateTruckNo=driver.findElement(By.id(capture[0])).getAttribute("value");
	
	
	return str="pass";
}
//------------------------------------------to enter valid data alert--------------------------------------------------------------------------------------------



//now this functionality is not used.as copy paste is not developed in our application//

  private static void Isvaliddata() {
	
	try{
		Alert alert=driver.switchTo().alert();
	 String a= alert.getText();
		alert.dismiss();
		
		}
		catch(NoAlertPresentException Ex)
		{
			System.out.println("ABC");
		}


}


public static String capture_EO_Values(String[] capture, String[] noelement) throws InterruptedException {
	String a[]=capture[0].split(",");
	String b[]=noelement[0].split(",");
	String EOTotalQty1= driver.findElement(By.id(a[0])).getText();
	GlobalVariables.EOTotalQty = Double.parseDouble(EOTotalQty1);
    System.out.println("Export order Total Quantity : "+GlobalVariables.EOTotalQty);
    Thread.sleep(2000);
    String EOOpenQty1= driver.findElement(By.id(a[1])).getText();
    GlobalVariables.EOOpenQty = Double.parseDouble(EOOpenQty1);
    System.out.println("Export Order Open Quantity : "+ GlobalVariables.EOOpenQty);
    Thread.sleep(2000);
	return str="pass";
}
public static String capture_PSP_Values(String[] capture, String[] noelement) throws InterruptedException {
	String a[]=capture[0].split(",");
	String b[]=noelement[0].split(",");
	String PSP_TotalQty1= driver.findElement(By.id(a[0])).getText();
	GlobalVariables.PSP_TotalQty = Double.parseDouble(PSP_TotalQty1);
    System.out.println("Pre stacking permission Total Quantity : "+GlobalVariables.PSP_TotalQty);
    Thread.sleep(2000);
    String PSP_PortReceiptQty1= driver.findElement(By.id(a[1])).getText();
    GlobalVariables.PSP_PortReceiptQty = Double.parseDouble(PSP_PortReceiptQty1);
    System.out.println("Pre stacking permission Port Receiupt  Quantity : "+GlobalVariables.PSP_PortReceiptQty);
    Thread.sleep(2000);
    String PSP_ShippingBillOpenQty1= driver.findElement(By.xpath(a[2])).getText();
    GlobalVariables.PSP_ShippingBillOpenQty = Double.parseDouble(PSP_ShippingBillOpenQty1);
    System.out.println("Pre stacking permission Shipping Bill Open Quantity : "+GlobalVariables.PSP_ShippingBillOpenQty);
    Thread.sleep(2000);
    GlobalVariables.PSP_TransportationType= driver.findElement(By.id(a[3])).getText();
    System.out.println("Pre stacking permission Transportation Type  : "+GlobalVariables.PSP_TransportationType);
    Thread.sleep(2000);
	return str="pass";
	 
}
public static String capture_SB_EO_Values(String[] capture, String[] noelement) throws InterruptedException {
	String a[]=capture[0].split(",");
	String b[]=noelement[0].split(",");
    Thread.sleep(2000);
    String SBE_TotalQty1= driver.findElement(By.id(a[0])).getText();
    GlobalVariables.SBE_TotalQty = Double.parseDouble(SBE_TotalQty1);
    System.out.println("Shipping bill  Total Quantity : "+GlobalVariables.SBE_TotalQty);
    Thread.sleep(2000);
    String SBE_OpenQty1= driver.findElement(By.id(a[1])).getText();
    GlobalVariables.SBE_OpenQty = Double.parseDouble(SBE_OpenQty1);
    System.out.println("Shipping Bill Open Quantity : "+GlobalVariables.SBE_OpenQty);
    driver.findElement(By.id("searchText")).clear();
    Thread.sleep(2000);
    
	return str="pass";
}
public static String capture_SB_PSP_Values(String[] capture, String[] noelement) throws InterruptedException {
	String a[]=capture[0].split(",");
	String b[]=noelement[0].split(",");
    String SBP_TotalQty1= driver.findElement(By.id(a[0])).getText();
    GlobalVariables.SBP_TotalQty = Double.parseDouble(SBP_TotalQty1);
    System.out.println("Shipping bill  Total Quantity : "+GlobalVariables.SBP_TotalQty);
    Thread.sleep(2000);
    String SBP_OpenQty1= driver.findElement(By.id(a[1])).getText();
    GlobalVariables.SBP_OpenQty = Double.parseDouble(SBP_OpenQty1);
    System.out.println("Shipping Bill Open Quantity : "+GlobalVariables.SBP_OpenQty);
    Thread.sleep(2000);
    
	return str="pass";
}
public static String capture_FIR_Values(String[] capture, String[] noelement) throws InterruptedException {
	String a[]=capture[0].split(",");
	String b[]=noelement[0].split(",");
	String FIR_TotalQty1= driver.findElement(By.id(a[0])).getText();
	GlobalVariables.FIR_TotalQty = Double.parseDouble(FIR_TotalQty1);
    System.out.println("FIR Total Quantity : "+GlobalVariables.FIR_TotalQty);
    String FIR_AccumulateREceiptQty1= driver.findElement(By.id(a[1])).getText();
    GlobalVariables.FIR_AccumulateREceiptQty = Double.parseDouble(FIR_AccumulateREceiptQty1);
    System.out.println("FIR Accumulate Receipt Quantity : "+GlobalVariables.FIR_AccumulateREceiptQty);
    String FIR_BalanceQty1= driver.findElement(By.id(a[2])).getText();
    GlobalVariables.FIR_BalanceQty = Double.parseDouble(FIR_BalanceQty1);
    System.out.println("FIR Balance Quantity : "+GlobalVariables.FIR_BalanceQty);
    String FIR_ReceiptQty1= driver.findElement(By.id(a[3])).getText();
    GlobalVariables.FIR_ReceiptQty = Double.parseDouble(FIR_ReceiptQty1);
    System.out.println("FIR Receipt Quantity : "+GlobalVariables.FIR_ReceiptQty);
    Thread.sleep(2000);
    
	return str="pass";
}

public static String compareQty(String[] a, String[] data) {

 			System.out.println("qty1  "+	(GlobalVariables.EOOpenQty==GlobalVariables.EOTotalQty - GlobalVariables.PSP_TotalQty+ GlobalVariables.SBE_TotalQty));
	  		System.out.println("qty2 "+	(GlobalVariables.SBP_OpenQty==GlobalVariables.PSP_TotalQty - GlobalVariables.PSP_ShippingBillOpenQty));
	  		System.out.println("qty3 "+	( GlobalVariables.FIR_BalanceQty ==GlobalVariables.FIR_TotalQty-GlobalVariables.FIR_AccumulateREceiptQty));
		
		//		FIR_Accum_R_Qty=FIR_Current_R_Qty + previous Qty
	  			  
	  		System.out.println("qty4"+	(GlobalVariables.FIR_TotalQty==GlobalVariables.PSP_TotalQty)) ;
	  			//GlobalVariables.FIR_TotalQty= GlobalVariables.SBE_TotalQty	;
		
if(GlobalVariables.EOOpenQty==GlobalVariables.EOTotalQty - GlobalVariables.PSP_TotalQty+ GlobalVariables.SBE_TotalQty &&
GlobalVariables.SBP_OpenQty==GlobalVariables.PSP_TotalQty - GlobalVariables.PSP_ShippingBillOpenQty &&  
GlobalVariables.FIR_BalanceQty ==GlobalVariables.FIR_TotalQty-GlobalVariables.FIR_AccumulateREceiptQty &&
GlobalVariables.FIR_TotalQty==GlobalVariables.PSP_TotalQty)
{
	str="pass";
}else
{
	str="fail";
}
	return str;
}


public static String capture2(String[] capture, String[] noelement) {
	 WebElement myDynamicElement2 = (WebElement)new WebDriverWait(driver, 60L).until(ExpectedConditions.presenceOfElementLocated(By.id("tableFilter"))); 
		List<WebElement> allListPageRowsUpdated = myDynamicElement2.findElements(By.tagName("tbody")).get(1).findElements(By.tagName("tr"));
			
			String temp;
			double str1=0;
      if(allListPageRowsUpdated.size()>0){
				System.out.println("No of rows is "+ allListPageRowsUpdated.size());
				for(int i=1;i<=allListPageRowsUpdated.size();i++){
					System.out.println("weigh Qty is "+driver.findElement(By.xpath(".//*[@id='tableFilter']/tbody[2]/tr["+i+"]/td[8]/../tr[@ validrow='true']/")).getText());
					//=//*[@id='table6']/tbody/tr[@class='odd']/../tr[@ validrow='true']/td[1]-
				temp=driver.findElement(By.xpath(".//*[@id='tableFilter']/tbody[2]/tr["+i+"]/td[8]")).getText();
				double values = Double.parseDouble(temp);
				
				str1+=values;
				System.out.println(str1);
				}
			}
      if (value1 == str1)
      {
   	   System.out.println("equal amounts");
   	   str="pass";
      }
      else 
      	str="fail";
		return str;
}
public static String navigate2Sb_list_filter(String[] loc, String[] text) throws InterruptedException {
	
	return str="pass";
	
}
//------------------------cod for change action-------------------------------------------------------------------------------------------------------------------------------------------

public static String changeaction(String[] loc, String[] text) throws InterruptedException {
	String a[]=loc[0].split(",");
	String b[]=text[0].split(",");
	selenium.click(a[0]);
	//	Thread.sleep(2000);
		selenium.click(a[1]);
		Thread.sleep(2000);
		selenium.type(a[2],b[0]);
		Thread.sleep(2000);
		selenium.click(a[3]);
		Thread.sleep(2000);
		IsAlertPresent();
			Thread.sleep(2000);
	
	return str="pass";
	
}
//
public static String cancelation(String[] loc, String[] text) throws InterruptedException {
	String a[]=loc[0].split(",");
	String b[]=text[0].split(",");
	driver.findElement(By.id(a[0])).click();
	driver.findElement(By.xpath(a[1])).click();
	//selenium.click("action_item");
	//selenium.click("//tr[@id='cancelservice']/td[2]");
//	assertTrue(selenium.getConfirmation().matches("^Are you sure you want to Cancel the document[\\s\\S]$"));
	//assertTrue(selenium.getConfirmation().matches("^Are you sure you want to Cancel the document[\\s\\S]$"));


		        /*Actions action = new Actions(driver);
		action.moveToElement(element).moveToElement(driver.findElement(By.xpath(a[4]))).click().build().perform();
		driver.switchTo().alert().accept();*/
	return str="pass";
		
	
}
private static void assertTrue(boolean matches) {
	// TODO Auto-generated method stub
	
}
//---------code for searching record fromNo to toNo with Approved Staus--------------------------------------------------
public static String SearchRecord_from2to(String[] loc, String[] text) throws InterruptedException
{
	String a[]=loc[0].split(",");
	String b[]=text[0].split(",");
driver.findElement(By.id(a[0])).sendKeys(b[0]);
driver.findElement(By.id(a[0])).sendKeys(Keys.TAB);
driver.findElement(By.id(a[1])).sendKeys(b[0]);
driver.findElement(By.id(a[1])).sendKeys(Keys.ENTER);
Thread.sleep(2000);
driver.findElement(By.id(a[2])).sendKeys(b[1]);
driver.findElement(By.id(a[2])).sendKeys(Keys.ENTER);
Thread.sleep(3000);
				String no=driver.findElement(By.xpath("//*[@id='tableFilter']/tbody[2]/tr[1]/td[1]")).getText();//.//*[@id='findAll_']
				int docNo = Integer.parseInt(no);
				int runtimeNo= Integer.parseInt(b[0]);
				String status=driver.findElement(By.xpath("//*[@id='tableFilter']/tbody[2]/tr[1]/td[2]")).getText();
				
				if(docNo == runtimeNo && status.equalsIgnoreCase(b[1])){
					// driver.findElement(By.className("odd")).click();
				driver.findElement(By.xpath("//*[@id='tableFilter']/tbody[2]/tr/td[1]")).click();
					 Thread.sleep(2000);
					 str="pass";
				}else{
					str="fail";
				}
return str;
}
public static String SearchRecord_from2to_gvariable(String[] loc, String[] novalue) throws InterruptedException
{
	String a[]=loc[0].split(",");
	String value=GlobalVariables.runtimevalue;//GlobalVariables.FIRNo;
driver.findElement(By.id(a[0])).sendKeys(value);
driver.findElement(By.id(a[0])).sendKeys(Keys.TAB);
driver.findElement(By.id(a[1])).sendKeys(value);
driver.findElement(By.id(a[1])).sendKeys(Keys.ENTER);
Thread.sleep(2000);

	// driver.findElement(By.className("odd")).click();
driver.findElement(By.xpath("//*[@id='tableFilter']/tbody[2]/tr")).click();
	 Thread.sleep(2000);
	return str="pass";

}
//saerch record with no and status
public static String searchRecord(String[] loc, String[] text) throws InterruptedException
{
	String a[]=loc[0].split(",");
	String b[]=text[0].split(",");
driver.findElement(By.id(a[0])).sendKeys(b[0]);
//driver.findElement(By.id(a[0])).sendKeys(Keys.ENTER);
Thread.sleep(2000);
driver.findElement(By.id(a[1])).sendKeys(b[1]);
driver.findElement(By.id(a[1])).sendKeys(Keys.ENTER);
Thread.sleep(3000);
//driver.findElement(By.className("odd")).click();
//String docstatus=driver.findElement(By.xpath("//*[@id='tableFilter']/tbody[2]/tr[1]/td[2]")).getText();
//String docno=driver.findElement(By.xpath("//table[@id='tableFilter']/tbody[2]/tr[1]/td[6]")).getText();
//if(docstatus.equalsIgnoreCase(b[0])&& docno.equalsIgnoreCase(b[1]))
//{
driver.findElement(By.xpath("//*[@id='tableFilter']/tbody[2]/tr")).click();
Thread.sleep(2000);
str="pass";
//}else{
//	str="fail";
//}
	return str;

}
public static String Searchgvariable(String[] loc, String[] novalue) throws InterruptedException {
	String a[]=loc[0].split(",");
	String b[]=novalue[0].split(",");
	driver.findElement(By.id(a[0])).sendKeys(GlobalVariables.runtimevalue);//driver.findElement(By.id(a[0])).sendKeys(GlobalVariables.FIRNo);
	driver.findElement(By.id(a[0])).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='tableFilter']/tbody[2]/tr")).click();
	Thread.sleep(2000);
	return str="pass";
}
public static String compareTruckNo(String[] loc, String[] novalue) {
	String a[]=loc[0].split(",");
	String b[]=novalue[0].split(",");
	String truckno=driver.findElement(By.id(a[0])).getAttribute("value");
	if(truckno==GlobalVariables.InGateTruckNo){
		str="pass";
	}else{
		str="fail";
	}
	return str;
}
public static String compareStatus(String[] loc, String[] novalue) {
	String a[]=loc[0].split(",");
	String b[]=novalue[0].split(",");
	String status=driver.findElement(By.id(a[0])).getAttribute("value");
	if(status=="Cancelled")
	{
		str="pass";
	}else{
		str="fail";
	}
	return str;
}
//--------------------------------------form for road dispatch-----------------------------------------------//
public static By Bylocator(String locatortype, String locatorvalue) {
	
	switch(locatortype){
	
	case "id":
		return By.id(locatorvalue);
	case "xpath":
		return By.xpath(locatorvalue);
	case "linktext":
		return By.linkText(locatorvalue);
	case "class":
		return By.className(locatorvalue);
	case "tagename":
		return By.tagName(locatorvalue);
	case "name":
		return By.name(locatorvalue);
	default:
		return By.cssSelector(locatorvalue);
	
	}
}
//-------------------------------------------------------------------------------------------------------------//
//-----------------------------------------------------------------------------------------------------------//
public static boolean WaitforElement(String[] loc) {
	String a[]=loc[0].split(",");
	
	try
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Bylocator(a[0],a[1])));
		return true;
	}catch(Throwable e)
	{
		return false;
	}
}
public static boolean waitForElementPresent(String[] loc,int iTimeOut) {
	String a[]=loc[0].split(",");
	try
	{
		int iTime = (int)(iTimeOut / 1000);
		WebDriverWait wait = new WebDriverWait(driver,iTime);
		wait.until(ExpectedConditions.presenceOfElementLocated(Bylocator(a[0],a[1])));
		return true;
	}catch(Throwable e)
	{
		return false;
	}
}
public static boolean verifyElementVisible(String[] loc) {
	
	
	
	bStatus = waitForElementPresent(loc,GlobalVariables.iTimeOutms);
	if(!bStatus)
		return false;
	else
	{
		bStatus = WaitforElement(loc);
		return bStatus;
	}
}
//-------------------------------------------------------------------------------------------------------------//
//-----------------------------------------------------------------------//
public static String ClickOnElement(String[] loc, String[] novalue) throws InterruptedException{
	String a[]=loc[0].split(",");
	bStatus=verifyElementVisible(loc);
	try{
	if(bStatus)
	{
		driver.findElement(Bylocator(a[0], a[1])).click();
		Thread.sleep(2000);
		return str="pass";
	}else
	{
		return str="fail";
	}
	}
	catch (NoSuchElementException e) {
		 e.printStackTrace();
	        return str="fail"+e;
	    }
}
//------------------------------------------------------------------------//
//-----------------------------------------------------------------------//
public static String Entertext(String[] loc, String[] value)
{
	String a[]=loc[0].split(",");
	String b[]=value[0].split(",");
	bStatus=verifyElementVisible(loc);
	try{

if(!bStatus){
		
		return str="fail";
	}
	driver.findElement(Bylocator(a[0], a[1])).clear();
	
	driver.findElement(Bylocator(a[0], a[1])).sendKeys(b[0]);
	//driver.findElement(Bylocator(a[0], a[1])).sendKeys(Keys.TAB);
	 Thread.sleep(2000);//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return str="pass";
	}
catch(Throwable UnhandledAlertException){
	driver.switchTo().alert().accept();
	}
	return str;
	
}
public static String Enter_Runtime_Text(String[] loc, String[] novalue)
{
	String a[]=loc[0].split(",");
	String data=GlobalVariables.runtimevalue;
	bStatus=verifyElementVisible(loc);
if(!bStatus){
		
		return str="fail";
	}
	driver.findElement(Bylocator(a[0], a[1])).clear();
	driver.findElement(Bylocator(a[0], a[1])).sendKeys(data);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return str="pass";
	
}



//-----------------------------------------------------------------------//
//-----------------------------------------------------------------------//
public static String EnterKeyword(String[] loc, String[] novalue) throws InterruptedException
{
	String a[]=loc[0].split(",");
	bStatus=verifyElementVisible(loc);
	if(!bStatus){
		return str="fail";
	}else{
		driver.findElement(Bylocator(a[0], a[1])).sendKeys(Keys.ENTER);
		Thread.sleep(2000);// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return str="pass";
	}
	
}
public static String EnterTab(String[] loc, String[] novalue)
{
	String a[]=loc[0].split(",");
	bStatus=verifyElementVisible(loc);
	if(!bStatus){
		return str="fail";
	}else{
		driver.findElement(Bylocator(a[0], a[1])).sendKeys(Keys.TAB);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return str="pass";
	}
}
//---------------------------------------------------------------------------//
//-------------------------------------------------------------------------//
public static String ClickFilteredRecord() throws InterruptedException
{
	// driver.findElement(By.className("odd")).click();
	driver.findElement(By.xpath("//*[@id='tableFilter']/tbody[2]/tr")).click();
	Thread.sleep(2000);
	return str="pass";
}
//-------------------------------------------------------------------------//
//------------------------------------------------------------------------//
public static String capture_new(String[] loc, String[] novalue)
{

	String a[]=loc[0].split(",");
	String b[]=novalue[0].split(",");
	bStatus=verifyElementVisible(loc);
	if(!bStatus){
		return str="fail";
	}else{
		str=driver.findElement(Bylocator(a[0], a[1])).getText();//.getAttribute("value");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return str;
	}
	
}
public static String capture_runtimevalue(String[] loc, String[] novalue)
{

	String a[]=loc[0].split(",");
	
	bStatus=verifyElementVisible(loc);
	if(!bStatus){
		return str="fail";
	}else{
		str=driver.findElement(Bylocator(a[0], a[1])).getAttribute("value");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return str;
	}
	
}
//------------------------------------------------------------------------------//
//------------------------------------------------------------------------------//
public static String Dropdown(String[] loc, String[] value) 
{
	String a[]=loc[0].split(",");
	String b[]=value[0].split(",");
	bStatus=verifyElementVisible(loc);
	if(!bStatus){
		str="fail";
	}else{
		//new Select(driver.findElement(Bylocator(a[0], a[1])).selectByVisibleText("DO");
		WebElement element=driver.findElement(Bylocator(a[0], a[1]));
		Select se=new Select(element);
		se.selectByVisibleText(b[0]);
		str="Pass";
	}
	return str;
}
//----------------------------------------------------------------------------------//
//----------------------------------------------------------------------------------//
//chek the check box
public static String checkbox(String[] check, String[] noelement)
{
	String a[]=check[0].split(",");
	bStatus=verifyElementVisible(check);
	if(!bStatus){
		return str="fail";
	}else{
		driver.findElement(Bylocator(a[0], a[1])).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return str="pass";
	}	
}
//------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------//
public static String popup2(String[] loc, String[] PData) throws InterruptedException
{	
	String a[]=loc[0].split(",");
	String b[]=PData[0].split(",");
	int len=a.length;
	String parentHandle = driver.getWindowHandle();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(Bylocator(a[0], a[1])).click();

for (String winHandle : driver.getWindowHandles()) {
    driver.switchTo().window(winHandle); 
}
if(len==4)
{
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(Bylocator(a[2], a[3])).sendKeys(b[0]);
     driver.findElement(Bylocator(a[2], a[3])).sendKeys(Keys.ENTER);
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     List<WebElement> str1=driver.findElements(By.tagName("td"));
 	for(int j=0; j<str1.size(); j++) {
 	      if(str1.get(j).getText().equalsIgnoreCase(b[0])) {
 	     str1.get(j).click();
 	     str="pass";
 	     break;
 	      }else {
 	     	str="fail";
 	     }
 	  }
}else{//(len==9)
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(Bylocator(a[2], a[3])).sendKeys(b[0]);
     driver.findElement(Bylocator(a[2], a[3])).sendKeys(Keys.ENTER);
     driver.findElement(Bylocator(a[4], a[5])).click();
     
     driver.findElement(Bylocator(a[2], a[3])).clear();
     
     driver.findElement(Bylocator(a[2], a[3])).sendKeys(b[1]);
     driver.findElement(Bylocator(a[2], a[3])).sendKeys(Keys.ENTER);
     driver.findElement(Bylocator(a[6], a[7])).click();
     
     driver.findElement(Bylocator(a[8], a[9])).click();
     str="pass";
}

driver.switchTo().window(parentHandle);
Thread.sleep(2000);//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  return str;
}
																	//-----------------------------------------------------//

public static String popup3(String[] loc, String[] novalue) throws InterruptedException
{
	String a[]=loc[0].split(",");
	String data=GlobalVariables.runtimevalue;// data that should clicked in opened popupwindow
	String parentHandle = driver.getWindowHandle();// get the current window handle
	
	driver.findElement(Bylocator(a[0], a[1])).click();// click some link that opens a new window
	for (String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);   
	}
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     List<WebElement> str1=driver.findElements(By.tagName("td")); 
     for(int j=0; j<str1.size(); j++){
          if(str1.get(j).getText().equalsIgnoreCase(data)) {
          str1.get(j).click();
          str="pass";
          break;
           } else{
        	   str="fail";
           }
   }
    driver.switchTo().window(parentHandle);
   Thread.sleep(4000);// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return str;
}
public static String entertruckno(String[] loc, String[] value) throws InterruptedException
{
	String a[]=loc[0].split(",");
	String b[]=value[0].split(",");
	
//validatingdata(data);
	Thread.sleep(2000);
	driver.findElement(Bylocator(a[0], a[1])).clear();
	Thread.sleep(2000);
driver.findElement(Bylocator(a[0], a[1])).sendKeys(b[0]);
Thread.sleep(2000);
driver.findElement(Bylocator(a[0], a[1])).sendKeys(Keys.TAB);
driver.switchTo().alert().accept();
	return str="pass";		
}



}

//----------------------------------------------------------------------------------------------------------//
