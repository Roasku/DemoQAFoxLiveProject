Feature: User Registration

Scenario: Registration is mandeatory field.
Given User navigate to registered account Page.
When User enters first name "Abhishek" in first name text field
And  enters last name "Kumar" in last name text field
And  enters email address "abbhishek189@gmail.com" in email text field.
And  enters telephone "7838189203" in telephone text field.
And Enters password "12345" in to password text field.
And enters password "12345" in to confirm password text field.
And Select privacy policy field.
And clicks on continue button.
Then account should get successfully created.

Scenario: Registration is mandeatory field.
Given User navigate to registered account Page.
When User enters first name "Abhishek" in first name text field
And  enters last name "Kumar" in last name text field
And  enters email address "abbhishek189@gmail.com" in email text field.
And  enters telephone "7838189203" in telephone text field.
And Enters password "12345" in to password text field.
And enters password "12345" in to confirm password text field.
And Selects yes for newsletter
And Select privacy policy field.
And clicks on continue button.
Then account should get successfully created.

Scenario: Registered without providing any field
Given User navigate to registered account Page.
When User dont enter details in any field
And clicks on continue button.
Then Warning message should be  displayed for the mandetory fields.

Scenario: Registered with duplicate email address
Given User navigate to registered account Page.
When User enters first name "Abhishek" in first name text field
And  enters last name "Kumar" in last name text field
And  enters email address "abbhishek189@gmail.com" in email text field.
And  enters telephone "7838189203" in telephone text field.
And Enters password "12345" in to password text field.
And enters password "12345" in to confirm password text field.
And Selects yes for newsletter
And Select privacy policy field.
And clicks on continue button.
Then Warning message infomating the user about duplicate email should be displayed.



