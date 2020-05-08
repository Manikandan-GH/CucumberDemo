Feature: login with freecrm and testing contact module

#Scenario: Free crm contact details
#
#Given user is on login page 
#When the title of the page is matched
#Then user clicks on login link
#Then user moves to login page
#Then user enters "manixeal@gmail.com" and "Manicrm94" 
#Then user clicks on login button
#Then user moves to home page

Scenario Outline: Free crm contact details page

Given user is on login page 
When the title of the page is matched
Then user clicks on login link
Then user moves to login page
Then user enters "<email>" and "<password>" 
Then user clicks on login button
Then user moves to home page
Then close the brower

Examples:
|email|password|
|manixeal@gmail.com|Manicrm94|


#Then user enters <username> and <password>
#Then clicks on login button
#Then user move to the home page
#Then user move to the contact page
#Then user enters details <> and <> and <>
#Then clicks on save button

