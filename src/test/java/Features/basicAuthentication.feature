Feature: BasicAuthentication

  Scenario: authentication login verification
    Given user navigates to the "basic_auth"
    When  user fills the pop-up with "admin" and "admin"
    And  user clicks login on the pop-up
    Then user should be logged in
