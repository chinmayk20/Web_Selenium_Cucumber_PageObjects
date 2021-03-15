Feature: NewsLetter

  Scenario: Sign Up NewsLetter
    Given I am on the Home Page "https://www.mailtravel.co.uk/" of Website
    When user Clicks on SignUp NewsLetterURL
    And user Enters following information
      | title | firstName | lastName | email       | address           |
      | Mr    | John     | Barnes   | steve@me.com | 10, United Street |
    And user clicks on Sign-up button
    Then he is presented with a Thank You message

  Scenario: To create an online reservation
    Given I am on the Home Page "https://www.mailtravel.co.uk/" of Website
    When user searches for India
    Then clicks on the moreinfo on the first result
    And user verifies the following data
      | PHONE_NUMBER |
      | DAYS         |
      | PRICE        |