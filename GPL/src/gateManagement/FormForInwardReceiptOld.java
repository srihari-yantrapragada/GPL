package gateManagement;


import configuration.GlobalVariables;
import configuration.MyExceptionClass;
import configuration.NResuable;
import configuration.Reusable;


public class FormForInwardReceiptOld {
	public static String status;
	public static String S_01(String[] username, String[] url)
	{
		return status=Reusable.launchapp(username,url);
	}
	public static String S_02(String[] loc,String[] values) throws InterruptedException, MyExceptionClass
	{
		return status=Reusable.login(loc,values);
	}
	public static String S_03(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_04(String[] loc, String[] novalue)
	{
		return status=NResuable.ClickOnElement(loc, novalue);
	}
	public static String S_05(String[] loc, String[] novalue)
	{
		return status=NResuable.validate(loc, novalue);
	}
	public static String S_06(String[] loc, String[] novalue)
	{
		return status=NResuable.ClickOnElement(loc, novalue);
	}
	public static String S_07(String[] noloc, String[] value) throws InterruptedException
	{
		return status=NResuable.navigation(noloc, value);
	}
	public static String S_08(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_09(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_10(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_11(String[] loc, String[] novalue)
	{
		return status=NResuable.EnterKeyword(loc, novalue);
	}
	public static String S_12()
	{
		return status=NResuable.ClickFilteredRecord();
	}
	public static String S_13(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.EOTotalQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_14(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.EOOpenQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_15(String[] noloc, String[] value) throws InterruptedException
	{
		return status=NResuable.navigation(noloc, value);
	}
	public static String S_16(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_17(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_18(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_19(String[] loc, String[] novalue)
	{
		return status=NResuable.EnterKeyword(loc, novalue);
	}
	public static String S_20()
	{
		return status=NResuable.ClickFilteredRecord();
	}
	public static String S_21(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.PSP_TotalQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_22(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.PSP_PortReceiptQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_23(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.PSP_ShippingBillOpenQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_24(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.PSP_TransportationType = str;
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_25(String[] noloc, String[] value) throws InterruptedException
	{
		return status=NResuable.navigation(noloc, value);
	}
	public static String S_26(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_27(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_28(String[] loc, String[] novalue)
	{
		return status=NResuable.EnterKeyword(loc, novalue);
	}
	public static String S_29()
	{
		return status=NResuable.ClickFilteredRecord();
	}
	public static String S_30(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.SBE_TotalQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_31(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.SBE_OpenQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_32(String[] noloc, String[] value) throws InterruptedException
	{
		return status=NResuable.navigation(noloc, value);
	}
	public static String S_33(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_34(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_35(String[] loc, String[] novalue)
	{
		return status=NResuable.EnterKeyword(loc, novalue);
	}
	public static String S_36()
	{
		return status=NResuable.ClickFilteredRecord();
	}
	public static String S_37(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.SBP_TotalQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_38(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.SBP_OpenQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_39(String[] noloc, String[] value) throws InterruptedException
	{
		return status=NResuable.navigation(noloc, value);
	}
	public static String S_40(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_41(String[] loc, String[] value)
	{
		return status=NResuable.Entertext(loc, value);
	}
	public static String S_42(String[] loc, String[] novalue)
	{
		return status=NResuable.EnterKeyword(loc, novalue);
	}
	public static String S_43()
	{
		return status=NResuable.ClickFilteredRecord();
	}
	public static String S_44(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.SBP_TotalQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_45(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.SBP_OpenQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	
	public static String S_46(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.SBP_TotalQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_47(String[] loc, String[] novalue)
	{
		String str =NResuable.capture(loc, novalue);
		 GlobalVariables.SBP_OpenQty = Double.parseDouble(str);
		 System.out.println(str);
		 return status="pass"; 
	}
	public static String S_48(String[] a, String[] data) throws InterruptedException
	{
		return status=NResuable.compareQty(a,data);
	}
	
	
	/*public static String S_02(String[] loc,String[] values) throws InterruptedException, MyExceptionClass
	{
		return status=Reusable.login(loc,values);
	}
	public static String S_03(String[] a, String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(a, form);
	}
	public static String S_04(String[] a, String[] form) throws InterruptedException
	{
		return status=Reusable.SearchRecord_from2to(a, form);
		
	}
	public String S_05(String[] capture, String[] noelement) throws InterruptedException
	{
		return status=Reusable.capture_EO_Values(capture,noelement);

	}
	public static String S_06(String[] a, String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(a, form);
	}
	public static String S_07(String[] a, String[] form) throws InterruptedException
	{
		return status=Reusable.SearchRecord_from2to(a, form);
	}
	public String S_08(String[] capture, String[] noelement) throws InterruptedException
	{
		return status=Reusable.capture_PSP_Values(capture,noelement);

	}
	public static String S_09(String[] a, String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(a, form);
	}
	public static String S_10(String[] a, String[] data) throws InterruptedException
	{
		return status=Reusable.searchRecord(a,data);
	}
	
	public static String S_11(String[] a, String[] data) throws InterruptedException
	{
		return status=Reusable.capture_SB_EO_Values(a,data);
	}
	
	public static String S_12(String[] a, String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(a, form);
	}
	public static String S_13(String[] a, String[] data) throws InterruptedException
	{
		return status=Reusable.searchRecord(a,data);
	}
	public static String S_14(String[] a, String[] data) throws InterruptedException
	{
		return status=Reusable.capture_SB_PSP_Values(a,data);
	}
	public static String S_15(String[] a, String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(a, form);
	}
	public static String S_16(String[] a, String[] data) throws InterruptedException
	{
		return status=Reusable.searchRecord(a,data);
	}
	public static String S_17(String[] a, String[] data) throws InterruptedException
	{
		return status=Reusable.capture_FIR_Values(a,data);
	}
	public static String S_18(String[] a, String[] data) throws InterruptedException
	{
		return status=Reusable.compareQty(a,data);
	}
	
	public String S_19(String[] elementloc, String[] noelement) throws InterruptedException, MyExceptionClass
	{
		return status=Reusable.clicknew(elementloc, noelement);
		
		
	}

	public String S_20(String[] loc, String[] text) throws InterruptedException, MyExceptionClass

	
	{

	return status=Reusable.entertruckno(loc, text);

	}
	public String S_21(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup(loc, PData);
		
		
	}
	public String S_22(String[] loc, String[] value) throws InterruptedException
	{
		return status=Reusable.popup(loc, value);
	}
	public String S_23(String[] loc, String[] value) throws InterruptedException
	{
		return status=Reusable.popup(loc, value);
	}
	public String S_24(String[] loc, String[] value) throws InterruptedException
	{
	return status=Reusable.entertext(loc, value);
		
	}
	public String S_25(String[] loc, String[] value) throws InterruptedException
	{
	return status=Reusable.entertext(loc, value);
		
	}
	public String S_26(String[] loc, String[] value) throws InterruptedException
	{
		return status=Reusable.popup(loc, value);
			
	}
	public String S_27(String[] save, String[] noelenent) throws InterruptedException
	{
		return status=Reusable.save(save,noelenent);
			
	}
	public String S_28(String[] check, String[] noelement)
	{
		return status=Reusable.checkbox(check,noelement);
		
	}
	public String S_29(String[] copy, String[] noelement) throws InterruptedException
	{
		return status=Reusable.CopyFromActionitems(copy,noelement);
	}
	public String S_30(String[] copy, String[] element) throws InterruptedException
	{
		return status=Reusable.CopyFromActionitemsforBreakBulk(copy,element);
	}
	public String S_31(String[] approve,String[] noelement) throws InterruptedException
	{
		return status=Reusable.Approval(approve,noelement);
	}
	public String S_32(String[] capture, String[] noelement)
	{
		return status=Reusable.capture(capture,noelement);

	}
	public String S_33(String[] loc, String[] text) throws InterruptedException
	{
	return status=Reusable.changeaction(loc, text);
		
	}
	public String S_34(String[] loc, String[] text) throws InterruptedException
	{
	return status=Reusable.entertrucknovalidation(loc, text);
		
	}
	public String S_35(String[] loc, String[] text) throws InterruptedException
	{
	return status=Reusable.cancelation(loc, text);
		
	}
	
	public String S_36(String[] loc, String[] text) throws InterruptedException
	{
	return status=Reusable.entertrucknovalidation(loc, text);
		
	}*/
			
}
