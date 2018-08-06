package gateManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class gettext {
	
	WebDriver driver;
	@Test
	public void setUp() {
		System.out.println("*******************");
		System.out.println("launching chrome browser");
		
		//driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		
		// System.setProperty("webdriver.firefox.marionette","D:\\Workspace\\library\\geckodriver.exe");

        // if above property is not working or not opening the application in browser then try below property

    //   System.setProperty("webdriver.gecko.driver","D:\\Workspace\\library\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\library\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
      // driver = new FirefoxDriver();

       driver.get("http://www.guru99.com/selenium-tutorial.html");
       
    // Configure the Action
       Actions action = new Actions(driver);

       // To click on the element
       
       WebElement element=driver.findElement(By.xpath("//*[@id='rt-header']/div/div[2]/div[1]/ul/li[2]/a"));
     
       action.moveToElement(element).build().perform();
       action.moveToElement(driver.findElement(By.linkText("Selenium"))).click().perform();
       
       //action.moveToElement(element).moveToElement(driver.findElement(By.linkText("Directorate"))).click().build().perform();
       //driver.close();
	}

}
