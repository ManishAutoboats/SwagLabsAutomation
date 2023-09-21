@Reg
Feature: checkout Funtionality

@smoke
Scenario: checkout with valid firstname lastname and postalcode
When user enter "standard_user" and "secret_sauce" deatils
And user click on login button
And user click on add to cart button
Then Validte cart count is "1"
And user nvaigate to checkout page
And user enter personal details "Test" "Automation" "201301"
And user click on Continue button
Then Validate user navigate to checkout two page
