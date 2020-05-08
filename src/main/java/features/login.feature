Feature: codecademy login feature	
#Scenario: codecademy login test scenario
#
#Given User is on codecademy login page
#When title of the page is codecademy login
#Then User enters "manixeal@gmail.com" and "mani1994"
#Then Clicks on login button


Scenario Outline: codecademy login test scenario

Given User is on codecademy login page
When title of the page is codecademy login
Then User enters "<username>" and "<password>"
Then Clicks on login button
Then user is on home page
#Then close the browser

Examples:
  | username | password |
  |manixeal@gmail.com|mani1994|
  | naveenk | test@123 |