package demo;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class confirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Click the link to activate the alert
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		// TODO Auto-generated method stub
		//Click the link to activate the alert
		driver.findElement(By.linkText("See a sample confirm")).click();

		//Wait for the alert to be displayed
//		wait.until(ExpectedConditions.alertIsPresent());

		//Store the alert in a variable
		Alert alert = driver.switchTo().alert();

		//Store the alert in a variable for reuse
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

		//Press the Cancel button
//		alert.dismiss();

	}

}
