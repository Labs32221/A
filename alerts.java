package demo;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs54\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/#alerts");
		// Maximize the browser
        driver.manage().window().maximize();
    
        // Launch Website
        driver.get("https://demoqa.com/alerts");
        
        // clicking on prompt button
        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
//        Thread.sleep(3000);
        
        // accepting javascript alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
          
        // clicking on prompt button
        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
//        Thread.sleep(3000);
        
        // Rejecting javascript alert
        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();  
		  
		

	}

}
