Feature: User Login.
Registered user should be able to login to access account details

Scenario: Login with valid credentials
Given User navigate to login page.
When User enters valid email address "abbhishek189@gmail.com"
And Enters valid password "Abhi@1995"
And Clicks on login button.
Then User should login successfully.

Scenario: Login with invalid credentials
Given User navigates to login page.
When User enters invalid email address "abbhishek1890@gmail.com"
And Enters valid password "Abhi@1995"
And Clicks on login button.
Then User should get a proper warning message.

Scenario: Login with valid email address and invalid password
Given User navigates to login page.
When User enters valid email address "abbhishek189@gmail.com"
And Enters invalid password "Abhi@19950"
And Clicks on login button.
Then User should get a proper warning message.

Scenario: Login with invalid email address and valid password
Given User navigates to login page.
When User enters invalid email address "abbhishek1890@gmail.com"
And Enters valid password "Abhi@1995"
And Clicks on login button.
Then User should get a proper warning message.

Scenario: Login without providing any credentials
Given User navigates to login page.
When User dont enter any credentials
And Clicks on login button.
Then User should get a proper warning message.

