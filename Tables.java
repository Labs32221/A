
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tables {

	 public static void main(String[] args) 
	{
		String columnXpath = "/html/body/table/tbody/tr[1]/th";
		String rowXpath = "/html/body/table/tbody/tr/td[1]";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs26\\Desktop\\Browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Website
		driver.get("file:///C:/Users/y20cs26/Desktop/table.html");

		// Number of columns
		List<WebElement> col
			= driver.findElements(By.xpath(columnXpath));
		System.out.println("No of columns : " + col.size());

		// Number of rows
		List<WebElement> rows
			= driver.findElements(By.xpath(rowXpath));
		System.out.println("No of rows : " + rows.size());
		//driver.close();
	}
}
