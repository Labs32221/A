package demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class s {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs54\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev");

        driver.quit();
	}

}
