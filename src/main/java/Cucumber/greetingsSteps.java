package Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class greetingsSteps {

    @Given("I come in to the bar")
    public void i_come_in_to_the_bar() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@Given: Entro al bar");
        //throw new io.cucumber.java.PendingException();
    }

    @When("I find people")
    public void i_find_people() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@When: Encuentro Gente");
        //throw new io.cucumber.java.PendingException();
    }

    @Then("I greet then")
    public void i_greet_then() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@Then: Los saludo");
        //throw new io.cucumber.java.PendingException();
    }


}
