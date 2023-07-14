package demo;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;
public class table {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs54\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Z:/table.html");
		List<WebElement> elements = driver.findElements(By.tagName("table"));

		for (WebElement element : elements) {
		    System.out.println("Text:" + element.getText());
		}
		
		WebElement testing = driver.findElement(By.id("d"));
		System.out.println("Subject in id d = "+testing.getText());
		  driver.quit();
	}

}
