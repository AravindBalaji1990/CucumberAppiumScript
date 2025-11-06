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


  Scenario: to test the login feature for the problem user
    When user enter the username and password
      | USERNAME        | PASSWORD     |
      | problem_user    | secret_sauce |
      | locked_out_user | secret_sauce |
    And user click on the login button
    Then user can see the error message
    Then user close the app

  @sanity
  Scenario Outline: this is to test login module in application with different sets of values
    When user enter the user name <USERNAME>
    And user enter the password <PASSWORD>
    And user click on the login button
    Then user can see the dashboard
    Then user close the app
    Examples:
      | USERNAME        | PASSWORD     |
      | problem_user    | secret_sauce |
      | locked_out_user | secret_sauce |
      | standard_user   | secret_sauce |
