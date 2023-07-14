package demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class webelement {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs54\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Z:/test.html");
		System.out.println(driver.findElement(By.className("information")));
		
		System.out.println(driver.findElement(By.cssSelector("#fname")));
		
		System.out.println(driver.findElement(By.id("lname")));
		
		System.out.println(driver.findElement(By.name("newsletter")));
		
		System.out.println(driver.findElement(By.linkText("Selenium Official Page")));
		
		System.out.println(driver.findElement(By.partialLinkText("Official Page")));
		
		System.out.println(driver.findElement(By.tagName("a")));
		
		System.out.println(driver.findElement(By.xpath("//input[@value='f']")));
		
		
        driver.quit();
	}

}