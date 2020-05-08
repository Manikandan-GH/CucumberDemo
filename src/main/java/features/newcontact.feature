Feature: New contact creation

Scenario Outline: Free crm new contact create
Given user is on login page 
When the title of the page is matched
Then user clicks on login link
Then user moves to login page
Then user enters "<email>" and "<password>"
Then user clicks on login button
Then user moves to home page
Then user clicks contact
Then user creates new contact
Then user enters contact details "<first_name>" and "<last_name>" and "<position>"

#Then close the brower
 
Examples:
| email | password | first_name | last_name | position |
| manixeal@gmail.com | Manicrm94 | test | test2 | testpos |
| manixeal@gmail.com | Manicrm94 | test3 | test4 | testposition |