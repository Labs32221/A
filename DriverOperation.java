import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class DriverOperation {

    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = driver.getTitle();

        System.out.println("Title = "+title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));

        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");

        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        System.out.println("value = "+value);

        driver.quit();

    }

}



