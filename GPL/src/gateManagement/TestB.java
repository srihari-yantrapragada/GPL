package gateManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestB {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.out.println("*******************");
		System.out.println("launching firefox browser");
		
		//driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		
		 System.setProperty("webdriver.firefox.marionette","D:\\Workspace\\library\\geckodriver.exe");

        // if above property is not working or not opening the application in browser then try below property

        //System.setProperty("webdriver.gecko.driver","D:\\Workspace\\library\\geckodriver.exe");

       WebDriver driver = new FirefoxDriver();

       driver.get("http://www.google.com");
	}
	
	@Test
	public void testPageTitleSampleB() {
		//driver.navigate().to("http://www.google.com");
		//String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+"strPageTitle");
		//Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	}
	
	@Test
	public void testSampleOne() {
		System.out.println("Im in test sample one");
	}
	
	@Test
	public void testSampleTwo() {
		System.out.println("Im in test sample two");
	}
	
	@Test
	public void testSampleThree() {
		System.out.println("Im in test sample three");
	}

	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing IE browser");
			driver.quit();
		}
	}
	
}