@Reg
Feature: Login Funtionality

@smoke
Scenario: login with valid credentials
When user enter "standard_user" and "secret_sauce" deatils
And user click on login button
Then Validte successful login


Scenario: login with invalid credentials
When user enter "standard_ufgsser" and "secret_dsfsfsauce" deatils
And user click on login button
Then validate error message


Scenario: login with valid user and invalid password
When user enter "standard_user" and "fgdfg" deatils
And user click on login button
Then validate error message


Scenario: login with invalid username and valid password
When user enter "stadfdsf" and "secret_sauce" deatils
And user click on login button
Then validate error message