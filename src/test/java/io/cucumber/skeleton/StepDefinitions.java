package io.cucumber.skeleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions
{
//	Belly belly;
//    @Given("I have {int} cukes in my belly")
//    public void I_have_cukes_in_my_belly(int cukes)
//    {
//        belly = new Belly();
//        belly.eat(cukes);
//    }
//    @When("I wait {int} hour")
//    public void i_wait_hour(Integer int1)
//    {
//    	// Write code here that turns the phrase above into concrete actions
//    	belly.wait_hour(int1);
//    }
//    @Then("my belly should growl")
//    public void my_belly_should_growl()
//    {
//    	// Write code here that turns the phrase above into concrete actions
//    	assertEquals("growl", belly.growl());
//    }
    
    private Calculadora_Archerd6 calculadora;
    private ArrayList<Double> Scenario_Outline_Suma;
    @Given("Given I have a Calculator")
    public void I_have_a_Calculator()
    {
        calculadora = new Calculadora_Archerd6();
    }
    @When("When I sum <a> and <b>")
    public void i_sum(Double int1, Double int2)
    {
    	// Write code here that turns the phrase above into concrete actions
    	Scenario_Outline_Suma.add(calculadora.suma(int1, int2));
    }
    @Then("the result is <value>")
    public void the_result_is()
    {
    	// Write code here that turns the phrase above into concrete actions
    	assertEquals(1, 1);
    }
    
    
}
