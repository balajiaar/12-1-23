Feature: Adactin loginfunctionality
Scenario Outline: Login
Given user should be in login page
When user sholud be enter the "<username>" and "<password>"
And user should click the login btn
Then user should receive the sucess message "hello navensoo"

Examples:
|username|password|
|Naveenaso| Naveenmech1!|


