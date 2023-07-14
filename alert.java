package demo;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Click the link to activate the alert
		System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs54\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		//Click the link to activate the alert
		driver.findElement(By.linkText("See an example alert")).click();

		//Wait for the alert to be displayed and store it in a variable
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();

		//Store the alert text in a variable
		String text = alert.getText();

		//Press the OK button
		alert.accept();
	}

}
