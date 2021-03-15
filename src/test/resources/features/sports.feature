Feature: Search

  @testc
  Scenario: TO Test something
    Given I am on the BBC homepgae
    And I move to the menu
      |Home|
      |News|
      |Sports|
    And I click on the Sports button
    Then I Should see the Sports page
#    And the page title should be "Home - BBC Sport"
