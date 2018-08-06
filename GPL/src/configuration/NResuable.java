package configuration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NResuable {
	
	public static String str;
	public static WebDriver driver;
	
	public static boolean bStatus;
	//------------------->LAUNCH APP<------------------------------------------------------------------------------------------------------------------------------------------------
		public static String launchapp(String[] loc, String[] url)
		   {			
						String a[]=loc[0].split(",");
						String b[]=url[0].split(",");
			
				driver= new FirefoxDriver();
				driver.get(b[0]);
			    driver.manage().window().maximize();
			    bStatus=verifyElementVisible(loc);
			    if(!bStatus){
					return str="fail";
				}else{
					str="pass";
				}
				return str;    
			}
		// Navigate to form calling method
					public static String navigation(String[] noelement, String[] form) throws InterruptedException
					{
						String[] a=form[0].split(",");
						Thread.sleep(2000);
						driver.findElement(By.id("searchText")).clear();
		                driver.findElement(By.id("searchText")).sendKeys(a[0]);
		                Thread.sleep(2000);
						driver.findElement(By.id("searchText")).sendKeys(Keys.ARROW_DOWN);
				        driver.findElement(By.id("searchText")).sendKeys(Keys.ENTER);
				        Thread.sleep(2000);
						return str="pass";
					}
//-----------------------------------------------------------------------------//
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
public static String Entertext(String[] loc, String[] value)
{
	String a[]=loc[0].split(",");
	String b[]=value[0].split(",");
	bStatus=verifyElementVisible(loc);
if(!bStatus){
		
		return str="fail";
	}
	driver.findElement(Bylocator(a[0], a[1])).clear();
	driver.findElement(Bylocator(a[0], a[1])).sendKeys(b[0]);
	return str="pass";
	
}
//-----------------------------------------------------------------------//
//-----------------------------------------------------------------------//
public static String EnterKeyword(String[] loc, String[] novalue)
{
	String a[]=loc[0].split(",");
	bStatus=verifyElementVisible(loc);
	if(!bStatus){
		return str="fail";
	}else{
		driver.findElement(Bylocator(a[0], a[1])).sendKeys(Keys.ENTER);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return str="pass";
	}
	
}
//---------------------------------------------------------------------------//

public static String EnterTab(String[] loc, String[] novalue)
{
	String a[]=loc[0].split(",");
	bStatus=verifyElementVisible(loc);
	if(!bStatus){
		return str="fail";
	}else{
		driver.findElement(Bylocator(a[0], a[1])).sendKeys(Keys.ENTER);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return str="pass";
	}
}
//-----------------------------------------------------------------------//

public static String ClickOnElement(String[] loc, String[] novalue) {
	String a[]=loc[0].split(",");
	bStatus=verifyElementVisible(loc);
	if(bStatus)
	{
		driver.findElement(Bylocator(a[0], a[1])).click();
		 str="pass";
	}else
	{
		 str="fail";
	}
	return str;
}
public static String validate(String[] loc,String[] novalue)
{
	String a[]=loc[0].split(",");
	if(driver.findElement(Bylocator(a[0], a[1])).isDisplayed())
	{
		 str="pass";
	}else
	{
		 str="fail";
	}
	return str;
}

//-------------------------------------------------------------------------//
public static String ClickFilteredRecord()
{
	// driver.findElement(By.className("odd")).click();
	driver.findElement(By.xpath("//*[@id='tableFilter']/tbody[2]/tr")).click();
	return str="pass";
}
//-------------------------------------------------------------------------//
//------------------------------------------------------------------------//
public static String capture(String[] loc, String[] novalue)
{

	String a[]=loc[0].split(",");
	bStatus=verifyElementVisible(loc);
	if(!bStatus){
		return str="fail";
	}else{
		str=driver.findElement(Bylocator(a[0], a[1])).getText();
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
		return str="pass";
	}	
}
//------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------//
public static String popup(String[] loc, String[] PData)
{	
	String a[]=loc[0].split(",");

//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(Bylocator(a[0], a[1])).click();

for (String winHandle : driver.getWindowHandles()) {
  driver.switchTo().window(winHandle); 
}
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
   
   
return str="pass";
}

             //--------------------------------//

public static String SelectDataFromPopup(String[] noloc, String[] value) {
	String b[]=value[0].split(",");
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
		return str;
}
//--------------------------------------------------------------------------------------------------------//
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
		else if(Alert_Type==null){
			Thread.sleep(2000);
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


public static String compareQty(String[] a, String[] data) {
//		FIR_Accum_R_Qty=FIR_Current_R_Qty + previous Qty
			//GlobalVariables.FIR_TotalQty= GlobalVariables.SBE_TotalQty	;
if(GlobalVariables.EOOpenQty==GlobalVariables.EOTotalQty - GlobalVariables.PSP_TotalQty+ GlobalVariables.SBE_TotalQty &&GlobalVariables.SBP_OpenQty==GlobalVariables.PSP_TotalQty - GlobalVariables.PSP_ShippingBillOpenQty &&  GlobalVariables.FIR_BalanceQty ==GlobalVariables.FIR_TotalQty-GlobalVariables.FIR_AccumulateREceiptQty &&GlobalVariables.FIR_TotalQty==GlobalVariables.PSP_TotalQty)
{
str="pass";
}else{
str="fail";
}return str;
}







}