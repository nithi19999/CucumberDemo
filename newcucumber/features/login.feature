Feature: Login Functionality

  Scenario: Successful Login
    Given I am on the login page
    When I enter a valid username and password
    And I click the login button
    Then I should be logged in successfully and My account page should be displayed
