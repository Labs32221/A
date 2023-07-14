package demo;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class prompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Click the link to activate the alert
		System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs54\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		driver.findElement(By.linkText("See a sample prompt")).click();

		//Wait for the alert to be displayed and store it in a variable

//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();

		//Type your message
		alert.sendKeys("Selenium");

		//Press the OK button
		alert.accept();
		  

	}

}
