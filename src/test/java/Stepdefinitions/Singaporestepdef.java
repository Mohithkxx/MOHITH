package Stepdefinitions;

import Base.Base;
import POM.SingaporePOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class Singaporestepdef extends Base {

    SingaporePOM Spom = new SingaporePOM();

    @Given("User is on the ATIT Singapore PAP website")
    public void user_is_on_the_atit_singapore_pap_website() {
        url(driver,"https://atit.org.in/singaporeJob");
        maximize(driver);
    }
    @When("User going through Frequently asked questions")
    public void user_going_through_frequently_asked_questions() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2790)", "");
        Thread.sleep(3000);
        driver.findElement(Spom.first).click();
        Thread.sleep(2000);
        driver.findElement(Spom.first).click();
        Thread.sleep(2000);
        driver.findElement(Spom.second).click();
        Thread.sleep(2000);
        driver.findElement(Spom.second).click();
        driver.findElement(Spom.third).click();
        Thread.sleep(2000);
        driver.findElement(Spom.third).click();
        driver.findElement(Spom.fourth).click();
        Thread.sleep(2000);
        driver.findElement(Spom.fourth).click();
        driver.findElement(Spom.fifth).click();
        Thread.sleep(2000);
        driver.findElement(Spom.fifth).click();
        driver.findElement(Spom.sixth).click();
        Thread.sleep(2000);
        driver.findElement(Spom.sixth).click();
        driver.findElement(Spom.seventh).click();
        Thread.sleep(2000);
        driver.findElement(Spom.seventh).click();
        driver.findElement(Spom.Eighth).click();
        Thread.sleep(2000);
        driver.findElement(Spom.Eighth).click();
        driver.findElement(Spom.ninth).click();
        Thread.sleep(2000);
        driver.findElement(Spom.ninth).click();
    }
}
