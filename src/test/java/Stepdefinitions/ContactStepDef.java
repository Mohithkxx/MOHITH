package Stepdefinitions;
import Base.Base;
import POM.ContactPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

    public class ContactStepDef extends Base{

        ContactPOM pom3 = new ContactPOM();

        @Given("User is on the ATIT website")
        public void userIsOnTheATITWebsite() {
            url(driver,"https://atit.org.in/contact");
            maximize(driver);
        }

        @When("User entering the contact form")
        public void userEnteringTheContactForm() throws InterruptedException{
            Thread.sleep(2000);
            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,550)", "");
            driver.findElement(pom3.Name).sendKeys("Mohith");
            driver.findElement(pom3.Email).sendKeys("mohithk888@gmail.com");
            driver.findElement(pom3.Phone).sendKeys("7358811651");
            driver.findElement(pom3.Message).sendKeys("Hi");
            driver.findElement(pom3.Submit).click();
            Thread.sleep(17000);
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.accept();
            driver.findElement(pom3.rocket).click();

        }

        @And("User entering the frame area")
        public void userEnteringTheFrameArea() {
            driver.switchTo().frame(0);
            driver.findElement(pom3.Directions).click();
            String parentWindowHandle = driver.getWindowHandle();
            driver.switchTo().window(parentWindowHandle);
            driver.switchTo().frame(0);
            driver.findElement(pom3.Directions).click();
            driver.findElement(pom3.review).click();
            String parentWindowHandle1 = driver.getWindowHandle();
            driver.switchTo().window(parentWindowHandle1);
            driver.switchTo().frame(0);
            driver.findElement(pom3.Large).click();
            String parentWindowHandle2 = driver.getWindowHandle();
            driver.switchTo().window(parentWindowHandle2);

        }
    }