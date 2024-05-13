package Runner;

import Base.Base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\IdeaProjects\\Axess technology website\\src\\test\\java\\Featurefile\\Home.feature",
        glue = "Stepdefinitions", dryRun = false)

public class Runnerclass extends Base {

    @BeforeClass
     public static void start() {

        driver = new ChromeDriver();
    }
}