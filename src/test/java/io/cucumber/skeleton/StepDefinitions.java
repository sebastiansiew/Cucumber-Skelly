package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void I_wait_hours(int hours){
        Belly belly = new Belly();
        belly.wait(hours);
    }

    @Then("my belly should growl")
    public void my_belly_growl(){
        System.out.println("Growl~~!");
    }
}
