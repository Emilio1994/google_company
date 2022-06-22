Feature: Search functionality

  Agile story: As a user I should be able to search for item on google search

  Scenario:
    Given I am on GM google search page
    When I search for the item
    And I click on search button
    Then the car page title should be displayed