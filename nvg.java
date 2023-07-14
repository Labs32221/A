package demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class nvg {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs54\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://chromedriver.chromium.org/downloads");
		driver.navigate().to("https://selenium.dev");
		driver.navigate().back();
		driver.navigate().forward();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		String title = driver.getTitle();
		System.out.println("Title = "+title);
		String url = driver.getCurrentUrl();
		System.out.println("Url = "+url);
        driver.quit();
	}

}
