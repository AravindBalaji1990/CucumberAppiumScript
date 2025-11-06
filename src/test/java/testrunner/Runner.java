package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // cucumber intergation with Junit
@CucumberOptions(
        features = "src/test/resources/", // this is the place where the feature files to test it willbe available
        glue = {"stepdefinition","Hooks"}, // package where the class files willbe available
        monochrome = true,
        dryRun = false, // when you make it as true it will check the feature files steps are available in the glue
        // if its not availabl ethen it will highlight it inthe console
        tags = "@dummy",
        plugin = {"pretty", "html:HTMLReport.html"})
public class Runner {
}
