package Stepdefinitions;

import Base.Base;
import POM.BlogPom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class BlogStepDef extends Base {

    BlogPom Bpom = new BlogPom();

    @Given("User is on the ATIT Blog website")
    public void user_is_on_the_atit_blog_website() throws InterruptedException {
        url(driver,"https://atit.org.in/blog");
        maximize(driver);
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
    }
    @When("User going through IT Jobs")
    public void user_going_through_it_jobs() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(Bpom.It_jobs).click();
        driver.findElement(Bpom.LucrativeITJobOpportunities).click();
        driver.navigate().back();
        driver.findElement(Bpom.It_jobs).click();

    }
    @When("User going through Interviews")
    public void user_going_through_interviews() {
//        driver.findElement(Bpom.Interviews).click();
//        driver.navigate().back();
    }
    @When("User going through Tech-skills")
    public void user_going_through_tech_skills() {
//        driver.findElement(Bpom.Tech_skills).click();
//        driver.navigate().back();
    }
    @When("User going through Others")
    public void user_going_through_others() {
//        driver.findElement(Bpom.Others);
//        driver.navigate().back();
    }

}