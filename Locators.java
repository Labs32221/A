
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators { 
       public static void main (String [] args){ 
    	   System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs26\\Desktop\\Browser\\chromedriver.exe");
   		ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.gmail.com"); 
       // Here Tag = input and Id = Email 
       driver.findElement(By.cssSelector("input#Email")).sendKeys("Software Testing Material");
       driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Software Testing Material"); 
       
       
       }
}