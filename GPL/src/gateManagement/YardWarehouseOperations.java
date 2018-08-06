package gateManagement;

import configuration.Reusable;

public class YardWarehouseOperations {
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
	public static String S_06(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup3(loc, PData);
	}
	public static String S_05_E(String[] check, String[] noelement)
	{
		return status=Reusable.checkbox(check, noelement);
	}
	public static String S_06_E(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup3(loc, PData);
	}
	public static String S_07(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_08(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_09(String[] loc, String[] value) 
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_10(String[] loc, String[] novalue) 
	{
		return status=Reusable.EnterTab(loc, novalue);
		
	}
	public static String S_11(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_12(String[] loc, String[] value) 
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_13(String[] loc, String[] value) 
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_14(String[] loc, String[] value) 
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_15(String[] loc, String[] value) 
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_16(String[] loc, String[] value) 
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_17(String[] loc, String[] value) 
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_18(String[] loc, String[] value) throws InterruptedException 
	{
		return status=Reusable.popup2(loc, value);
		
	}
	public static String S_19(String[] loc, String[] value) 
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_20(String[] loc, String[] value) 
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_21(String[] loc, String[] value) 
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_22(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	
	public static String S_23(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	public static String S_24(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_25(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_26(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
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
	public String S_07(String[] loc, String[] value) throws InterruptedException
	{
		return status=Reusable.popup(loc, value);
	}
	public String S_08(String[] save, String[] elenent) throws InterruptedException
	{
		return status=Reusable.entertext(save,elenent);
			
	}
	public String S_09(String[] save, String[] elenent) throws InterruptedException
	{
		return status=Reusable.entertextclick(save,elenent);
			
	}

	public String S_10(String[] save, String[] elenent) throws InterruptedException
	{
		return status=Reusable.entertext(save,elenent);
			
	}
	public String S_11(String[] save, String[] elenent) throws InterruptedException
	{
		return status=Reusable.entertext(save,elenent);
			
	}
	public String S_12(String[] save, String[] elenent) throws InterruptedException
	{
		return status=Reusable.entertext(save,elenent);
			
	}
	public String S_13(String[] save, String[] elenent) throws InterruptedException
	{
		return status=Reusable.entertext(save,elenent);
			
	}
	public String S_14(String[] save, String[] elenent) throws InterruptedException
	{
		return status=Reusable.entertext(save,elenent);
			
	}
	public String S_15(String[] save, String[] elenent) throws InterruptedException
	{
		return status=Reusable.entertext(save,elenent);
			
	}
	
	public String S_16(String[] loc, String[] value) throws InterruptedException
	{
		return status=Reusable.popup(loc, value);
	}
	
	public String S_17(String[] save, String[] noelenent) throws InterruptedException
	{
		return status=Reusable.save(save,noelenent);
			
	}
	public String S_18(String[] approve,String[] noelement) throws InterruptedException
	{
		return status=Reusable.Approval(approve,noelement);
	}

	public static String S_19(String[] noelement,String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(noelement,form);
	}
	public static String S_20(String[] a, String[] novalue) throws InterruptedException
	{
		return status=Reusable.SearchRecord_from2to_gvariable(a, novalue);
	}
	public String S_21(String[] loc, String[] text) throws InterruptedException
	{
	return status=Reusable.cancelation(loc, text);
		
	}
	public static String S_22(String[] noelement,String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(noelement,form);
	}
	public static String S_23(String[] loc,String[] novalue) throws InterruptedException
	{
		return status=Reusable.Searchgvariable(loc,novalue);
	}
	public static String S_24(String[] loc,String[] novalue) throws InterruptedException
	{
		return status=Reusable.compareStatus(loc,novalue);
	}
	public static String S_25(String[] noelement,String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(noelement,form);
	}
	public static String S_26(String[] loc,String[] novalue) throws InterruptedException
	{
		return status=Reusable.Searchgvariable(loc,novalue);
	}
	public static String S_27(String[] loc,String[] novalue) throws InterruptedException
	{
		return status=Reusable.compareStatus(loc,novalue);
	}
	public static String S_28(String[] noelement,String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(noelement,form);
	}
	public static String S_29(String[] loc,String[] novalue) throws InterruptedException
	{
		return status=Reusable.Searchgvariable(loc,novalue);
	}
	public static String S_30(String[] loc,String[] novalue) throws InterruptedException
	{
		return status=Reusable.compareStatus(loc,novalue);
	}*/