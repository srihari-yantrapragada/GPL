package gateManagement;

import configuration.Reusable;


public class ExportOrder
{
	static String status;
	  
	
	//public class Reusable r=new Reusable;
	
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
	
	public String S_04(String[] elementloc,String[] noelement) throws InterruptedException
	{
		return status=Reusable.clicknew(elementloc,noelement);
		
	}
	
}





























