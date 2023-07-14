import java.util.*;
import org.openqa.selenium.*; 
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOperation { 
	
public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver();

driver.get("http://www.naukri.com/");

driver.manage().window().maximize();
driver.manage().window().minimize();

System.out.println("Title: "+driver.getTitle());

String parent=driver.getWindowHandle();
Set<String>s=driver.getWindowHandles();
Iterator<String> I1= s.iterator();

while(I1.hasNext())
{

String child_window=I1.next();

if(!parent.equals(child_window))
{
driver.switchTo().window(child_window);

System.out.println(driver.switchTo().window(child_window).getTitle());

driver.close();
}
}
driver.switchTo().window(parent);

}
}

