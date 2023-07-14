import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String args[])

	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chromedriver.chromium.org/downloads");

		driver.navigate().to("https://selenium.dev");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

		driver.manage().window().maximize();

		driver.manage().window().minimize();

		String title = driver.getTitle();

		System.out.println("Title = "+title);

		String url = driver.getCurrentUrl();

		System.out.println("Url = "+url);

//        driver.quit();

	}
}


