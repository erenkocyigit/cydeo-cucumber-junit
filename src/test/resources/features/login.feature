Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different account. And dashboard should be displayed.

  Accounts are: Librarian, student, admin

  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard