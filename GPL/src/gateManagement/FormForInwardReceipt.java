package gateManagement;

import configuration.GlobalVariables;
import configuration.MyExceptionClass;
import configuration.Reusable;

public class FormForInwardReceipt {
	public static String status;
	public static String S_01(String[] a, String[] b)
	{
		return status=Reusable.launchapp(a,b);
	}
	public static String S_02(String[] loc,String[] values) throws InterruptedException 
	{
		return status=Reusable.login(loc,values);
	}
	public static String S_15(String[] a, String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(a, form);
	}
	public static String S_19(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);	
	}
	public static String S_20(String[] loc, String[] value) throws InterruptedException 
	{
		status=Reusable.Entertext(loc, value);
		
		return status;
	}
	public static String S_21(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_22(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_23(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_24(String[] loc, String[] value) throws InterruptedException
	{
				return status=Reusable.Entertext(loc, value);
	}
	public static String S_25(String[] loc, String[] value) throws InterruptedException
	{
				return status=Reusable.Entertext(loc, value);
	}
	
	public static String S_26(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	
	public static String S_27(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	
	public static String S_28(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	public static String S_30(String[] loc, String[] novalue) throws InterruptedException
	{
	return status=Reusable.CopyFromActionitems(loc, novalue);
	}
	
	public static String S_32(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_33(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_34(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	
	public static String S_35(String[] loc, String[] novalue)
	{
		 String str =Reusable.capture_runtimevalue(loc, novalue);
		 GlobalVariables.runtimevalue = str;
		 System.out.println(str);
		 return status="pass";
	}
	
	

}
