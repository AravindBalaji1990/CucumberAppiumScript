package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DummyStepDef {

    @When("user logs in")
    public void user_logs_in() {
        System.out.println("user logs in");
    }
    @When("user validates data")
    public void user_validates_data() {
        System.out.println("user validates data");

    }
    @Then("user sigout")
    public void user_sigout() {
        System.out.println("user signsout");

    }

}
