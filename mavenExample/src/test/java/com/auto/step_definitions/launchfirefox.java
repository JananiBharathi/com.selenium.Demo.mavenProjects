package com.auto.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class launchfirefox {

	@Given("I launch firefox browser")
	public void i_launch_firefox_browser() {
		System.out.println("I launch firefox browser");
	   
	}

	@When("I click search button")
	public void i_click_search_button() {
	    System.out.println("I click search button");
	}


	@When("I enter text for search")
	public void i_enter_text_for_search() {
		System.out.println("I enter text for search");
	    
	}

	@Then("I verify search successfull")
	public void i_verify_search_successfull() {
		System.out.println("I verify search successfull");
	}
}
