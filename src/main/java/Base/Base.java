package Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
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

    //public static WebDriver driver;

    public static void Bowserlaunch() {
        driver = new ChromeDriver();
    }

    public static void geturl(String url) {
        driver.get(url);
    }

    public static void Maximize() {
        driver.manage().window().maximize();
    }

    public static void implicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public static void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static void jsScroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static void screenshot(WebDriver driver, String imageName) throws IOException {

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File imgType = screenshot.getScreenshotAs(OutputType.FILE);
        File imgPath = new File("C:\\Users\\Revanth\\eclipse-workspace\\Testing_DominusWebsite\\Dominus Screenshot\\"
                + imageName + ".png");
        FileUtils.copyFile(imgType, imgPath);
    }

    public static void scrollup(WebDriver driver, WebElement web) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false)", web);
    }

    public static void toHold(WebDriver driver, int seconds) {
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(seconds));
    }

    public void windowhandle(WebDriver driver, String windowTitle) {
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
            if (driver.getTitle().equals(windowTitle)) {
                break;
            }
        }
    }

    public void windowhandleparent(WebDriver driver) {
        Set<String> opcw = driver.getWindowHandles();
        Iterator<String> itera = opcw.iterator();
        String parent = itera.next();
        String child = itera.next();
        driver.switchTo().window(parent);

    }

    public static void NavigateBack() {
        driver.navigate().back();
    }

    public static void log(String text) {
        System.out.println(text);
    }
}