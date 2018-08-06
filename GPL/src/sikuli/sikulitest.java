package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class sikulitest {

	//public static void main(String[] args) throws Exception {
		/*Screen s=new Screen();
		//Pattern p=new Pattern("D:\\Workspace\\IPORTMAN\\duck\\win.PNG");
		
		s.find("D:\\Workspace\\IPORTMAN\\GPL\\duck\\START.PNG");
		s.click("D:"
				+ "\\Workspace\\IPORTMAN\\GPL\\duck\\START.PNG");*/


@Test

public void functionName() throws FindFailed {  

// Create a new instance of the Firefox driver

WebDriver driver = new FirefoxDriver();

// And now use this to visit Google

driver.get("http://www.google.com");

//Create and initialize an instance of Screen object   

Screen screen = new Screen();

//Add image path  

Pattern image = new Pattern("D:\\IMAGES\\searchButton.png"); 

//Wait 10ms for image 

screen.wait(image, 10);  

//Click on the image

screen.click(image);

  

}
}
