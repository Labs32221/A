package Main;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
//import org.openqa.selenium.NoAlertPresentException;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import org.openqa.selenium.support.ui.Wait;
//
//import org.openqa.selenium.support.ui.WebDriverWait;

class Alerts
{

    public static void main(String[] args) {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\exam2\\Desktop\\L21CS194\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //      ALERTS
//      driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
//    //Click the link to activate the alert
//      driver.findElement(By.linkText("See an example alert")).click();
//
//      //Wait for the alert to be displayed and store it in a variable
//      Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
//      //Store the alert text in a variable
//      String text = alert.getText();
//
//      //Press the OK button
//      System.out.println(text);
//      alert.accept();
  
//      CONFIRM
      driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
      
    //Click the link to activate the alert
      driver.findElement(By.linkText("See a sample confirm")).click();

      //Wait for the alert to be displayed
      new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
      //Store the alert in a variable
      Alert alert = driver.switchTo().alert();

      //Store the alert in a variable for reuse
      String text = alert.getText();

      System.out.println(text);
      
      //Press the Cancel button
      alert.dismiss();
//    PROMPT
//      driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
//      driver.findElement(By.linkText("See a sample prompt")).click();
//    //Wait for the alert to be displayed and store it in a variable
//    Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
//    //Type your message
//    alert.sendKeys("Selenium");
//    //Press the OK button
//    alert.accept();
       }
}