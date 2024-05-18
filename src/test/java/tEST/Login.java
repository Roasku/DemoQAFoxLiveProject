package tEST;

import io.cucumber.java.en.*;

public class Login {
	
	@Given("User navigate to login page.")
	public void user_navigate_to_login_page() {
		
		System.out.println("<< User get login page");
	   
	}

	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address(String emailAddressText) {
	  
		System.out.println("<< User enters valid email address"+emailAddressText);
		
	}

	@When("Enters valid password {string}")
	public void enters_valid_password(String passwordText) {
	 
		System.out.println("<< User enter valid password"+passwordText);
		
	}

	@When("Clicks on login button.")
	public void clicks_on_login_button() {
	  
		System.out.println("<< User clicks on login button");
		
	}

	@Then("User should login successfully.")
	public void user_should_login_successfully() {
	  
		
		System.out.println("<< User got logi successfully");
		
	}

	@Given("User navigates to login page.")
	public void user_navigates_to_login_page() {
	 
		
		
		
	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidemailAddress) {
	 
		System.out.println("<< User has entered invalid email address"+invalidemailAddress);
		
		
	}

	@Then("User should get a proper warning message.")
	public void user_should_get_a_proper_warning_message() {
	 
		System.out.println("<< User got a  proper warning message ");
		
		
	}

	@When("Enters invalid password {string}")
	public void enters_invalid_password(String invalidPassword) {
	  
		System.out.println("<< User has entered invalid password"+invalidPassword);
		
		
	}

	@When("User dont enter any credentials")
	public void user_dont_enter_any_credentials() {
	   
	
		System.out.println("User has not entered any credentials");
		
	}



}
