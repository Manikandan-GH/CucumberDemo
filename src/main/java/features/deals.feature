Feature: Deals Data Creation

Scenario: Create anew deal free CRM
Given user is on login page
When title of the page is matched
Then user clicks on login link
Then user moves to login page 
Then user enters emailid and password
 |manixeal@gmail.com | Manicrm94|

Then clicks on login button
Then user on home page 
Then user moves to deal page
Then enters deal details
|Cucumber Testing|Deal entry|100|
Then close the browser