package tEST;

import io.cucumber.java.en.*;

public class Registered {

	@Given("User navigate to registered account Page.")
	public void user_navigate_to_registered_account_page() {
	   
		System.out.println("<< User got navigated to registered account page");
	}

	@When("User enters first name {string} in first name text field")
	public void user_enters_first_name_in_first_name_text_field(String firstNameText) {
	   
		System.out.println("<< User has entered first name"+firstNameText);
	}

	@When("enters last name {string} in last name text field")
	public void enters_last_name_in_last_name_text_field(String lastNameText) {
		
		System.out.println("<< User has entered last name"+lastNameText);
	    
	}

	@When("enters email address {string} in email text field.")
	public void enters_email_address_in_email_text_field(String emailText) {
	    
		System.out.println("<< User has entered email"+emailText);
	}

	@When("enters telephone {string} in telephone text field.")
	public void enters_telephone_in_telephone_text_field(String telephoneText) {
	    
		System.out.println("<< User has enterd telephone number"+telephoneText);
		
	}

	@When("Enters password {string} in to password text field.")
	public void enters_password_in_to_password_text_field(String passwordText) {
	    
		System.out.println("<< User has entered password"+ passwordText);
	}

	@When("enters password {string} in to confirm password text field.")
	public void enters_password_in_to_confirm_password_text_field(String passwordText) {
	   
		System.out.println("<< User has entered confirm password"+passwordText);
	}

	@When("Select privacy policy field.")
	public void select_privacy_policy_field() {
	    
		System.out.println("<< User selected privecy policy field successfully");
		
	}

	@When("clicks on continue button.")
	public void clicks_on_continue_button() {
		
		System.out.println("<< User has clicked continue button");
	    
	}

	@Then("account should get successfully created.")
	public void account_should_get_successfully_created() {
	    
		
		System.out.println("<< User got created account successfully");
		
		
	}

	@When("Selects yes for newsletter")
	public void selects_yes_for_newsletter() {
	   
		
		System.out.println("<<User has selected radio button successfully");
		
	}

	@When("User dont enter details in any field")
	public void user_dont_enter_details_in_any_field() {
	    
		
		System.out.println("<<User has kept all the field blank ");
		
	}

	

	@Then("Warning message should be  displayed for the mandetory fields.")
	public void warning_message_should_be_displayed_for_the_mandetory_fields() {
	   
		System.out.println("<< Warning message for all the mandeatory field got displayed.");
		
	}

	@Then("Warning message infomating the user about duplicate email should be displayed.")
	public void warning_message_infomating_the_user_about_duplicate_email_should_be_displayed() {
	   
		
	System.out.println("<< Warning message informing the user about dublicate email is displayed");
		
		
	}
}
