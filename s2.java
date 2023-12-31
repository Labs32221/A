package demo;

//package dev.selenium.getting_started;

//import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class s2 {


    public static void main(String args[]) {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\y20cs54\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = driver.getTitle();
        System.out.println("Title = "+title);
//        assertEquals("Web form", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        System.out.println("value = "+value);
//        assertEquals("Received!", value);

        driver.quit();
    }

}
