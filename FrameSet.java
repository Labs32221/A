import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;
import java.util.List;
class FrameSet {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs26\\Desktop\\Browser\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/y20cs26/Desktop/index.html");
        
        /*
        //What is a frame index?
        //How to get total number of frames on a webpage?
        JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);

		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
 */
       
		//now use the switch command
		driver.switchTo().frame(0);

		
       }
}
