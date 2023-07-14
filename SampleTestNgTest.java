package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SampleTestNgTest {
	public String baseUrl= "http://newtours.demoaut.com/";
	public WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	@Test
	public void verifyHomepageTitle() {
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle =driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}

}
