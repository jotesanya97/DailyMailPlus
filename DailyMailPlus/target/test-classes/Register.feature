@Register

Feature: Register New User

  Scenario Outline: As a new user i want to create an account
    Given I go to the Home Page
    And I click sign in
    And I enter my email address where it says create your mail account
    And I click continue
   # And I enter my title
   # And I enter a firstname "<firstname>"
    #And I enter a lastname "<lastname>"
   # And I enter my email address
   # And I confirm my email address
   # And I enter my password
   # And I confirm my password
   # And I will click continue
   # When I verify that "<user>" is logged in
   # Then I click sign out

    Examples:
      | firstname | lastname | password | user                 |
      | mike      | dean     | Today01  | mike dean            |
     #| john      | ken      | Today01  | john ken             |
     #| sarah     | anne     | Today01  | sarah anne           |


