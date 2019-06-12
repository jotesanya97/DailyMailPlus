@ForgotPassword
Feature: ForgotPassword Test

  Scenario: As a user I want to see if I can still login even though I have forgotten my password
    Given I go to the Home Page
    And I click sign in
    And I click on the forgot your password link
    When I enter my email in the enter email field
    Then I click the continue button