package gateManagement;

import configuration.GlobalVariables;
import configuration.MyExceptionClass;
import configuration.Reusable;

public class FormForRoadDispatch {
	
	public static String status;
	public static String S_01(String[] username, String[] url)
	{
		return status=Reusable.launchapp(username,url);
	}
	public static String S_02(String[] loc,String[] values) throws InterruptedException, MyExceptionClass
	{
		return status=Reusable.login(loc,values);
	}
	public static String S_03(String[] a, String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(a, form);
	}
	public static String S_04(String[] loc, String[] value) throws InterruptedException
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_05(String[] loc, String[] value) throws InterruptedException
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_06(String[] loc, String[] value) throws InterruptedException
	{
		return status=Reusable.Entertext(loc, value);
		
	}
	public static String S_07(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.EnterKeyword(loc, novalue);
		
	}
	public static String S_08(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickFilteredRecord();
		
	}
	
	public static String S_09(String[] loc, String[] novalue) throws InterruptedException
	{
	 String str =Reusable.capture_new(loc, novalue);
	 GlobalVariables.DO_TotalQty = Double.parseDouble(str);
	 System.out.println(str);
	 return status="pass";
		
	}
	public static String S_10(String[] loc, String[] novalue) throws InterruptedException
	{
	 String str =Reusable.capture_new(loc, novalue);
	 GlobalVariables.DO_OpenQty = Double.parseDouble(str);
	 System.out.println(str);
	 return status="pass";
	}
	public static String S_11(String[] loc, String[] novalue) throws InterruptedException
	{
	 String str =Reusable.capture_new(loc, novalue);
	 GlobalVariables.DO_DispatchedQty = Double.parseDouble(str);
	 System.out.println(str);
	 return status="pass";
	}
	public static String S_12(String[] a, String[] form) throws InterruptedException
	{
		return status=Reusable.navigation(a, form);
	}
	public static String S_13(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
		
	}
	public static String S_14(String[] loc, String[] value)
	{
		return status=Reusable.Dropdown(loc, value);
		
	}
	//------------------------------------------------------------------------------------//
	//-------------------------BULK-------------------------------------------------------//
	//------------------------------------------------------------------------------------//
	public static String S_15(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_16(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_17(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_18(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_19(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_20(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_21(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_22(String[] check, String[] noelement)
	{
		return status=Reusable.checkbox(check, noelement);
	}
	public static String S_23(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	
	public static String S_24(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	public static String S_25(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_26(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_27(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	public static String S_28(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	
	public static String S_29(String[] loc, String [] noelement)
	{
		return status=Reusable.checkbox(loc, noelement);
	}
	public static String S_30(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_31(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_32(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_33(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_34(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_35(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_36(String[] check, String[] noelement)
	{
		return status=Reusable.checkbox(check, noelement);
	}
	public static String S_37(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	
	public static String S_38(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	public static String S_39(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_40(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_41(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	public static String S_42(String[] loc, String [] noelement)
	{
		return status=Reusable.checkbox(loc, noelement);
	}
	public static String S_43(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	
	
	public static String S_44(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_45(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_46(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_47(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_48(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_49(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_50(String[] check, String[] noelement)
	{
		return status=Reusable.checkbox(check, noelement);
	}
	public static String S_51(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	
	public static String S_52(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	public static String S_53(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_54(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_55(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	public static String S_56(String[] loc, String[] novalue)
	{
		 String str =Reusable.capture_runtimevalue(loc, novalue);
		 GlobalVariables.runtimevalue = str;
		 System.out.println(str);
		 return status="pass";
	}
//--------------------------------------------------------------------------------------------------------//	
//----------------------------------------BREAK BULK------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------//	
	public static String S_57(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_58(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_59(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_60(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_61(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_62(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_63(String[] loc, String[] PData) throws InterruptedException
	{
		return status=Reusable.popup2(loc, PData);
	}
	public static String S_64(String[] check, String[] noelement)
	{
		return status=Reusable.checkbox(check, noelement);
	}
	public static String S_65(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	
	public static String S_66(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	public static String S_67(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_68(String[] loc, String[] novalue) throws InterruptedException
	{
		return status=Reusable.ClickOnElement(loc, novalue);
	}
	public static String S_69(String[] noloc, String[] novalue)
	{
		Reusable.IsAlertPresent();
		return status="pass";
		
	}
	public static String S_98(String[] loc, String[] novalue)
	{
		 String str =Reusable.capture_runtimevalue(loc, novalue);
		 GlobalVariables.runtimevalue = str;
		 System.out.println(str);
		 return status="pass";
	}
	//--------------------------------------------------------------------------------------------------------//	
	//----------------------------------------PROJECT------------------------------------------------------//
	//--------------------------------------------------------------------------------------------------------//	
		public static String S_99(String[] loc, String[] PData) throws InterruptedException
		{
			return status=Reusable.popup2(loc, PData);
		}
		public static String S_100(String[] loc, String[] PData) throws InterruptedException
		{
			return status=Reusable.popup2(loc, PData);
		}
		public static String S_101(String[] loc, String[] PData) throws InterruptedException
		{
			return status=Reusable.popup2(loc, PData);
		}
		public static String S_102(String[] loc, String[] PData) throws InterruptedException
		{
			return status=Reusable.popup2(loc, PData);
		}
		public static String S_103(String[] loc, String[] PData) throws InterruptedException
		{
			return status=Reusable.popup2(loc, PData);
		}
		public static String S_104(String[] loc, String[] PData) throws InterruptedException
		{
			return status=Reusable.popup2(loc, PData);
		}
		public static String S_105(String[] loc, String[] PData) throws InterruptedException
		{
			return status=Reusable.popup2(loc, PData);
		}
		public static String S_106(String[] check, String[] noelement)
		{
			return status=Reusable.checkbox(check, noelement);
		}
		public static String S_107(String[] loc, String[] novalue) throws InterruptedException
		{
			return status=Reusable.ClickOnElement(loc, novalue);
		}
		
		public static String S_108(String[] noloc, String[] novalue)
		{
			Reusable.IsAlertPresent();
			return status="pass";
			
		}
		public static String S_109(String[] loc, String[] novalue) throws InterruptedException
		{
			return status=Reusable.ClickOnElement(loc, novalue);
		}
		public static String S_110(String[] loc, String[] novalue) throws InterruptedException
		{
			return status=Reusable.ClickOnElement(loc, novalue);
		}
		public static String S_111(String[] noloc, String[] novalue)
		{
			Reusable.IsAlertPresent();
			return status="pass";
			
		}
		public static String S_140(String[] loc, String[] novalue)
		{
			 String str =Reusable.capture_runtimevalue(loc, novalue);
			 GlobalVariables.runtimevalue = str;
			 System.out.println(str);
			 return status="pass";
		}

}







































































/*
public String S_15(String[] loc, String[] PData) throws InterruptedException
{
	return status=Reusable.popup(loc, PData);
}
public String S_16(String[] check, String[] noelement)
{
	return status=Reusable.checkbox(check,noelement);
	
}

public String S_17(String[] loc, String[] PData)
{
	return status=Reusable.popup2(loc, PData);
	
}

public static String S_18(String[] loc, String[] value)
{
	return status=Reusable.Entertext(loc, value);
	
}
public static String S_19(String[] loc, String[] novalue) 
{
	return status=Reusable.EnterKeyword(loc, novalue);
	
}
public String S_20(String[] check, String[] noelement)
{
	return status=Reusable.checkbox(check,noelement);
	
}
public static String S_21(String[] loc, String[] value)
{
	return status=Reusable.Entertext(loc, value);
	
}
public static String S_22(String[] loc, String[] novalue) 
{
	return status=Reusable.EnterKeyword(loc, novalue);
	
}
public String S_23(String[] check, String[] noelement)
{
	return status=Reusable.checkbox(check,noelement);
	
}

public static String S_24(String[] loc, String[] novalue)
{
	return status=Reusable.ClickOnElement(loc, novalue);
	
}

public String S_25(String[] loc, String[] PData)
{
	try {
		return status=Reusable.popup2(loc, PData);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return status;
}
public String S_26(String[] loc, String[] value) 
{
	return status=Reusable.Entertext(loc, value);
}
public String S_27(String[] loc, String[] novalue) 
{
	return status=Reusable.EnterKeyword(loc, novalue);
}





public String S_29(String[] loc, String[] PData)
{
	return status=Reusable.popup2(loc, PData);
	
}

public String S_30(String[] loc, String[] PData)
{
	return status=Reusable.popup2(loc, PData);
	
}

public static String S_(String[] loc, String[] value)
{
	return status=Reusable.Entertext(loc, value);
	
}
public static String S_32(String[] loc, String[] novalue) 
{
	return status=Reusable.EnterKeyword(loc, novalue);
	
}
public String S_33(String[] check, String[] noelement)
{
	return status=Reusable.checkbox(check,noelement);
	
}
public static String S_34(String[] loc, String[] value)
{
	return status=Reusable.Entertext(loc, value);
	
}
public static String S_35(String[] loc, String[] novalue) 
{
	return status=Reusable.EnterKeyword(loc, novalue);
	
}
public String S_36(String[] check, String[] noelement)
{
	return status=Reusable.checkbox(check,noelement);
	
}

public static String S_37(String[] loc, String[] novalue)
{
	return status=Reusable.ClickOnElement(loc, novalue);
	
}
public static String S_38(String[] loc, String[] novalue)
{
	return status=Reusable.ClickOnElement(loc, novalue);
}
public static String S_39(String[] loc, String[] text)
{
	return status=Reusable.Entertext(loc, text);
}
public static String S_40(String[] loc, String[] novalue)
{
	return status=Reusable.EnterKeyword(loc, novalue);
}
*/
