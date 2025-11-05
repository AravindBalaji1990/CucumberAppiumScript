Feature: login test feature

  Background:
    Given user open the swaglab app in android

    Scenario: to test the login functionality for standard_user
      When user enter the user name "standard_user"
      And user enter the password "secret_sauce"
      And user click on the login button
      Then user can see the dashboard
      Then user close the app

  Scenario: to test the login functionality for problem_user
    When user enter the user name "problem_user"
    And user enter the password "secret_sauce"
    And user click on the login button
    Then user can see the dashboard
    Then user close the app
