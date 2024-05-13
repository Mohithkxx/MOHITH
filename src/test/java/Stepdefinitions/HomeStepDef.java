package Stepdefinitions;

import Base.Base;
import POM.HomePOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class HomeStepDef extends Base {

    HomePOM pom = new HomePOM();

    @Given("User on the ATIT website")
    public void user_on_the_atit_website() {
       url(driver,"https://atit.org.in/");
       maximize(driver);
    }

    @When("User Clicking the Contact form cross button")
    public void user_clicking_the_contact_form_cross_button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(pom.Crossbtn).click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2050)", "");
    }

    @When("User clicking the About PAP button")
    public void user_clicking_the_about_pap_button() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(pom.AboutPap).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(pom.Crossbtn).click();
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");
    }

    @When("User clicking software testing button")
    public void user_clicking_software_testing_button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(pom.Softwaretesting).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(pom.Crossbtn).click();
    }

    @When("User clicking Software development button")
    public void user_clicking_software_development_button() throws InterruptedException {
        Thread.sleep(2000);
       //driver.findElement(pom.Home).click();
        //driver.findElement(pom.Crossbtn).click();
       //Thread.sleep(2000);
       driver.findElement(pom.rocket).click();
       Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");
        Thread.sleep(2000);
       driver.findElement(pom.softwaredevelopment).click();
       driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(pom.Crossbtn).click();
    }

    @When("User clicking Artificial intelligence button")
    public void user_clicking_artificial_intelligence_button() throws InterruptedException{
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", "bc");
        Thread.sleep(3000);
        driver.findElement(pom.AI).click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(pom.Crossbtn).click();
    }

    @When("User clicking Devops button")
    public void user_clicking_devops_button() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", "bc");
        Thread.sleep(2000);
        driver.findElement(pom.Devops).click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(pom.Crossbtn).click();
    }

    @And("User Clicking the Contact form button")
    public void userClickingTheContactFormButton() throws InterruptedException{
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6000)", "bc");
        Thread.sleep(2000);
        driver.findElement(pom.contact).click();
        Thread.sleep(2000);
        driver.findElement(pom.Crossbtn).click();
        
    }

    @And("User clicking the Whatsapp icon")
    public void userClickingTheWhatsappIcon() throws InterruptedException {
         driver.findElement(pom.Whatsapp).click();
         Thread.sleep(2000);
         String parentWindowHandle = driver.getWindowHandle();
         driver.switchTo().window(parentWindowHandle);
         driver.findElement(pom.rocket).click();
    }





}
