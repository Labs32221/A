import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {

	public static void main(String[] args) {

		//Click the link to activate the alert
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



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class AlertDemo {
	
	public static void main(String[] args) throws NoAlertPresentException {									
	//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        // Alert Message handling

        driver.get("https://demo.guru99.com/test/delete_customer.php");			
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        // Switching to Alert        

        Alert alert = driver.switchTo().alert();		

        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        // Displaying alert message		

        System.out.println(alertMessage);	

        // Accepting alert		

        alert.accept();		

    }	


}


import org.openqa.selenium.Alert; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 

public class PromptAlertTest 
{ 
public static void main(String[] args) throws InterruptedException 
{ 
  WebDriver driver = new ChromeDriver(); 
  String URL = "https://selenium08.blogspot.com/2019/07/alert-test.html"; 
  driver.get(URL); 
  driver.manage().window().maximize(); 
    WebElement element = driver.findElement(By.xpath("//button[@id='prompt']")); 
     element.click(); 

    Alert alert = driver.switchTo().alert(); 
     alert.sendKeys("Deep"); 
   alert.accept();

     WebElement displayMessage = driver.findElement(By.id("prompt_demo")); 
     String getText = displayMessage.getText(); 
     System.out.println(getText); 
 
  if(getText.equalsIgnoreCase("Hello Deep! How are you today?"))
  { 
      System.out.println("Exact matched"); 
  }
  else { 
     System.out.println("Something went wrong"); 
   } 
    //driver.close(); 
  } 
}




