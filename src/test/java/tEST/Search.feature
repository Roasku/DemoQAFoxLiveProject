Feature: Searh functionality

Scenario: Search for a valid product
Given Users opens the application
When Users enters valid product in to search text field
And User click on search text field
Then valid product should get displayed in search results

Scenario: Searh for non_existing product
Given User enters non_existing product in to search text field
And User click on search button
Then Product text informing the user about to product matching should be displayed

Scenario: Search without providing any product
Given User opens the application
When User dont enter any product in to search field
And User click on search button
Then proper text informing the user about no product matching should be displayed

