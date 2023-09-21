Feature: Basket funtionality

Background: user navigate swag labs app
When user enter "standard_user" and "secret_sauce" deatils
And user click on login button

@Reg @smoke
Scenario: verify user is able to add the product into basket
And user click on add to cart button
Then Validte cart count is "1"
