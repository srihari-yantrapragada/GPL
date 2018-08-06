package gateManagement;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;



public  class Demo {
	public static String scenarios;

	public static void main(String[] args) throws InterruptedException, FindFailed
	{
		
		
		Screen s=new Screen();
		
		s.find("D:\\duck\\des.png"); //identify pause button
		s.click("D:\\duck\\des.png");
	
	
}
}