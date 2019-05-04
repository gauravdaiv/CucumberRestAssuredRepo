Feature: Facebook login
As a facebook user, I want to enter username and pwd as

Scenario: validate entee facebook login Scenario1
Given the user is on facebook login Page
When he enters "anil" as user name
When he enters "pwd" as password
Then check username is present in textbox
Then I am checking the login




