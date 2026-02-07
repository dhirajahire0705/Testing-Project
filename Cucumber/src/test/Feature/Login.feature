Feature: Login Functionalty


@sanity 
Scenario: Login with valid credential
Given User navigate to login page url "https://practicetestautomation.com/practice-test-login/"
When User enter valid email "student"
And User enter valid password "Password123"
And User click on login button
Then User login successfully
And User click on logout button
Then User logout successfully

@regression
Scenario: Login with invalid credential
Given User navigate to login page url "https://practicetestautomation.com/practice-test-login/"
When User enter invalid email "abcd"
And User enter invalid password "123456"
And User click on login button
Then User should get proper warning message

@sanity
Scenario: Login with invalid email and valid password
Given User navigate to login page url "https://practicetestautomation.com/practice-test-login/"
When User enter invalid email "abcd"
And User enter valid password "Password123"
And User click on login button
Then User should get proper warning message


@sanity
Scenario: Login with valid email and invalid password
Given User navigate to login page url "https://practicetestautomation.com/practice-test-login/"
When User enter valid email "student"
And User enter invalid password "123456"
And User click on login button
Then User should get proper warning message


@regression
Scenario: Login with empty credential
Given User navigate to login page url "https://practicetestautomation.com/practice-test-login/"
When User should not enter any credential
And User click on login button
Then User should get proper warning message