package firsttestngpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	 //String driverPath = "C:\\Users\\y20cs26\\Desktop\\Browser\\geckodriver.exe";
	 String driverPath = "C:\\Users\\y20cs26\\Desktop\\Browser\\chromedriver.exe";
	 public WebDriver driver ; 
  @Test
  public void verifyHomepageTitle() {
      
      System.out.println("launching google web browser");
      //System.setProperty("webdriver.gecko.driver", driverPath);
      //driver = new FirefoxDriver();
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}
