package io.cucumber.skeleton;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions
{
    
    private Calculadora_Archerd6 calculadora;
    private double Resultado;
    
    @Given("I have a Calculator")
    public void i_have_a_calculator()
    {
    // Write code here that turns the phrase above into concrete actions
    	calculadora = new Calculadora_Archerd6();
    }
    @When("I sum {int} and {int}")
    public void i_sum_and(Integer int1, Integer int2)
    {
    // Write code here that turns the phrase above into concrete actions
    	Resultado = calculadora.suma(int1, int2);
    }
    @Then("the result is {double}")
    public void the_result_is(double Entrante)
    {
    	// Write code here that turns the phrase above into concrete actions
    	Assertions.assertEquals(Entrante, Resultado);
    }
    
    
    



}
