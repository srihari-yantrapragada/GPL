package gateManagement;



import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://192.168.6.112:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLogin() throws Exception {
    driver.get(baseUrl + "/iportman_uat3/");
    driver.findElement(By.name("j_password")).clear();
    driver.findElement(By.name("j_password")).sendKeys("123");
    driver.findElement(By.name("j_username")).clear();
    driver.findElement(By.name("j_username")).sendKeys("90130");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.cssSelector("div.dojoxExpandoIcon.dojoxExpandoIconLeft")).click();
    driver.findElement(By.id("searchText")).clear();
    driver.findElement(By.id("searchText")).sendKeys("ex");
    driver.findElement(By.cssSelector("li.ac_over")).click();
    driver.findElement(By.cssSelector("tr.hover > td")).click();
    driver.findElement(By.id("toolbar1.save")).click();
    driver.findElement(By.id("alertButForUpdate")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
