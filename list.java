package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
public class list {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs54\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("file:///Z:/list.html");
        driver.navigate().to("file:/Z:/list.html");
		WebElement vegetable = driver.findElement(By.className("tomatoes"));
		System.out.println("vegetable = "+vegetable.getText());
		WebElement fruits = driver.findElement(By.id("fruits"));
		WebElement fruit = fruits.findElement(By.className("tomatoes"));
		WebElement fruit1 = driver.findElement(By.cssSelector("#fruits .tomatoes"));
		List<WebElement> plants = driver.findElements(By.tagName("li"));
		List<WebElement> elements = driver.findElements(By.tagName("li"));

		for (WebElement element : elements) {
		    System.out.println("Paragraph text:" + element.getText());
		}
		  driver.quit();
		  
	}

}
