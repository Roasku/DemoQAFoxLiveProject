package tEST;

import io.cucumber.java.en.*;

public class Search {

	@Given("Users opens the application")
	public void users_opens_the_application() {
	    
		System.out.println("<< Application got open");
	}

	@When("Users enters valid product in to search text field")
	public void users_enters_valid_product_in_to_search_text_field() {
	    
		System.out.println("<<Valid product got entered in to search field ");
	}

	@And("User click on search text field")
	public void user_click_on_search_text_field() {
	    
		
		System.out.println("<< User has clicked on search text field");
		
	}

	@Then("valid product should get displayed in search results")
	public void valid_product_should_get_displayed_in_search_results() {
	    
		
		System.out.println("<< Valid product got  displayed in to search page");
		
	}

	@Given("User enters non_existing product in to search text field")
	public void user_enters_non_existing_product_in_to_search_text_field() {
	   
		
		System.out.println("<< User has entered non existing product");
		
	}

	@And("User click on search button")
	public void user_click_on_search_button() {
	    
		
		System.out.println("<< User clicked on search button");
		
	}

	@Then("Product text informing the user about to product matching should be displayed")
	public void product_text_informing_the_user_about_to_product_matching_should_be_displayed() {
	    
		System.out.println("<<User got matching product ");
		
	}

	@Given("User opens the application")
	public void user_opens_the_application() {
	    
		System.out.println("<< User got open the application");
		
	}

	@When("User dont enter any product in to search field")
	public void user_dont_enter_any_product_in_to_search_field() {
	   
		System.out.println("<< User has not entered any product in to search field");
		
	}

	

	@Then("proper text informing the user about no product matching should be displayed")
	public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {
	   
		
		System.out.println("<< User got no matching product message");
	}

}
