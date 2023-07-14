package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class frames {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs54\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	        		
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/frames/");			
                            		
		//Store the web element
		WebElement iframe = driver.findElement(By.cssSelector("#modal>iframe"));

		//Switch to the frame
		driver.switchTo().frame(iframe);

		//Now we can click the button
		driver.findElement(By.tagName("button")).click();
		
		driver.switchTo().frame("buttonframe");

		//Or using the name instead
		driver.switchTo().frame("myframe");

		//Now we can click the button
		driver.findElement(By.tagName("button")).click();
		
		// Switches to the second frame
		driver.switchTo().frame(1);
		
		// Return to the top level
//		driver.switchTo().defaultContent();
	}

}
