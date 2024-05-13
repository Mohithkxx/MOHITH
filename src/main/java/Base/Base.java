package Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Base {

    public static WebDriver driver;

    public static void openChromebrowser(WebDriver driver ){
        driver=new ChromeDriver();

    }
    public static void url(WebDriver driver,String url) {
        driver.get(url);
    }

    public static void maximize(WebDriver driver)
    {
        driver.manage().window().maximize();
    }

    public static void click(WebElement clickbtn) {
        clickbtn.click();
    }

    public static void sendkeys(WebElement sendvalue,String value) {
        sendvalue.sendKeys(value);

    }

    public static void scroll(WebDriver driver,WebElement e) {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", e);

    }

    public static void Implicitwait(WebDriver driver,int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public static void minimize(WebDriver driver) {
        driver.manage().window().minimize();
    }

    public static void explicitwait(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public static void parentHandle(WebDriver driver) {
        String windowHandle = driver.getWindowHandle();
        driver.switchTo().window(windowHandle);
    }
}