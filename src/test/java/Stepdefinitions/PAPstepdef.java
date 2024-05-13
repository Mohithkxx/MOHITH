package Stepdefinitions;

import Base.Base;
import POM.PAPPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class PAPstepdef extends Base {

    PAPPOM pom4 = new PAPPOM();

    @Given("User is on the ATIT PAP website")
    public void userIsOnTheATITPAPWebsite() {
        url(driver,"https://atit.org.in/pap");
        maximize(driver);
    }

    @When("User going through the steps in PAP")
    public void user_going_through_the_steps_in_pap() throws InterruptedException{
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
        Thread.sleep(15000);
        JavascriptExecutor js1=(JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1500)", "");

    }

    @When("User joining the PAP platform")
    public void user_joining_the_pap_platform() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(pom4.Joinnow).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(pom4.rocket).click();

    }

}