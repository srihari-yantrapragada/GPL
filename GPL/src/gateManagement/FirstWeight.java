package gateManagement;

import configuration.Reusable;

public class FirstWeight {
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
	public static String S_04(String[] loc, String[] novalue)
	{
		return status=Reusable.Enter_Runtime_Text(loc, novalue);
	}
	public static String S_04_E(String[] loc, String[] novalue)
	{
		return status=Reusable.Enter_Runtime_Text(loc, novalue);
	}
	public static String S_05(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.EnterKeyword(loc, novalue);
	}
	public static String S_06(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickFilteredRecord();
		
	}
	public static String S_07(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_08(String[] loc, String[] value) 
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_08_E(String[] loc, String[] value) 
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_09(String[] loc, String[] novalue)
	{
		return status=Reusable.checkbox(loc, novalue);
	}
	
	public static String S_10(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	
	public static String S_11(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	public static String S_12(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_13(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_14(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
}

































































/*public static String S_04(String[] listloc, String[] listvalue) throws InterruptedException
{
	return status=Reusable.Selectfromlist1(listloc, listvalue);
}
public String S_05(String[] loc, String[] value) throws InterruptedException
{
	return status=Reusable.popup(loc, value);
}
public String S_06(String[] loc, String[] value1) throws InterruptedException
{
return status=Reusable.entertext(loc, value1);
	
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
}
public static String S_10(String[] noelement,String[] form) throws InterruptedException
{
	return status=Reusable.navigation(noelement,form);
}
public static String S_11(String[] a, String[] novalue) throws InterruptedException
{
	return status=Reusable.SearchRecord_from2to_gvariable(a, novalue);
}
public String S_12(String[] loc, String[] text) throws InterruptedException
{
return status=Reusable.cancelation(loc, text);
	
}
public static String S_13(String[] noelement,String[] form) throws InterruptedException
{
	return status=Reusable.navigation(noelement,form);
}
public static String S_14(String[] loc,String[] novalue) throws InterruptedException
{
	return status=Reusable.Searchgvariable(loc,novalue);
}
public static String S_15(String[] loc,String[] novalue) throws InterruptedException
{
	return status=Reusable.compareStatus(loc,novalue);
}
public static String S_16(String[] noelement,String[] form) throws InterruptedException
{
	return status=Reusable.navigation(noelement,form);
}
public static String S_17(String[] loc,String[] novalue) throws InterruptedException
{
	return status=Reusable.Searchgvariable(loc,novalue);
}
public static String S_18(String[] loc,String[] novalue) throws InterruptedException
{
	return status=Reusable.compareStatus(loc,novalue);
}*/