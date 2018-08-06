package gateManagement;

import configuration.DriverOLD;
import configuration.GlobalVariables;
import configuration.Reusable;

public class OutGateOperation {
	public static String status;
	public static String S_01(String[] username, String[] url)
	{
		return status=Reusable.launchapp(username,url);
	}
	
	public static String S_02(String[] loc,String[] values) throws InterruptedException
	{
		return status=Reusable.login(loc,values);
	}
	
	public static String S_03(String[] noelement,String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(noelement,form);
	}
	
	public static String S_04(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
		
	}
	public static String S_05(String[] check, String[] noelement)
	{
		return status=Reusable.checkbox(check, noelement);
	}
	public static String S_06(String[] check, String[] noelement)
	{
		return status=Reusable.checkbox(check, noelement);
	}
	public static String S_07(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup3(loc, PData);
	}
	
	public static String S_07_E(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup3(loc, PData);
	}
	
	public static String S_08(String[] loc, String[] text) throws InterruptedException
	{
		return status=Reusable.popup2(loc, text);
	}
	/*public static String S_08(String[] check, String[] noelement)
	{
		return status=Reusable.checkbox(check, noelement);
	}*/
	public static String S_09(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	
	public static String S_10(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	public static String S_11(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_12(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_13(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	
	
	public static String S_14(String[] username, String[] url)
	{
		return status=Reusable.closebrowser(username, url);
		
		
	}
	
	
	
}





































/*public String S_04(String[] elementloc,String[] noelement) throws InterruptedException
	{
		return status=Reusable.clicknew(elementloc,noelement);
		
	}
	public String S_05(String[] check, String[] noelement)
	{
		return status=Reusable.checkbox(check,noelement);
		
	}
	public String S_06(String[] loc, String[] value) throws InterruptedException
	{
		return status=Reusable.popup1(loc, value);
	}
	public String S_07(String[] check, String[] noelement)
	{
		return status=Reusable.checkbox(check,noelement);
		
	}
	public String S_08(String[] save, String[] noelenent) throws InterruptedException
	{
		return status=Reusable.save(save,noelenent);
			
	}
	public String S_09(String[] approve,String[] noelement) throws InterruptedException
	{
		return status=Reusable.Approval(approve,noelement);
	}*/