Feature: launch firefox.com link
Scenario: search in firefox browser
    Given I launch firefox browser
    When I click search button
    And I enter text for search
    Then I verify search successfull