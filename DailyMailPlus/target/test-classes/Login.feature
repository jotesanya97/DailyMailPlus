@Login
Feature: Login Test

Scenario Outline: As a user I want to check if I can login successfully
Given I go to the Home Page
And I click sign in
And I enter my email "<email>" address
And I enter my password "<password>"
And I click the sign in button
#When I verify that "<user>" is logged in
#Then I sign out

Examples:
| email                  | password         | user           |
| jotesanya97@gmail.com  | Bababinraders1   | James Otesanya |

  @Login

  Scenario Outline: As a user I want to see if an error message will appear when I login with the incorrect details
    Given I go to the Home Page
    And I click sign in
    And I enter my email "<email>" address
    And I enter my password "<password>"
    When I click the sign in button
    #Then I want to see an error "<errormessage>" error message details

    Examples:
      | email                 | password      | errormessage                              |
      | jotesanya97@gmail.com |               | Please enter your password                |
      |                       | Bababinraders1| Please enter a valid email address        |
      | jotesanya97@gmail.com | yeezus        |                                           |
      | xxxxxxxxxx@gmail.com  | Bababinraders1|                                           |
      |                       |               | Please enter a valid email address        |



    #The web elements for the error message have different locators because the error message for please enter your password and
    #please enter a valid email address are located in different parts of the web page so its not possible to automate that test