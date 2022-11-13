Feature: FormLoginFeature

  Scenario: valid Login
    Given user navigates to the "login"
    And user enter UserName And PassWord
      | UserName | Password |
      | tomsmith    | SuperSecretPassword!   |
    When user clicks login
    Then user is logged in successfully


  Scenario: invalid Login
    Given user navigates to the "login"
    And user enter UserName And PassWord
      | UserName | Password |
      | admin    | admin    |
    When user clicks login
    Then user is not logged in successfully
    And Error message is displaying


  Scenario: Logout
    Given user navigates to the "login"
    And user enter UserName And PassWord
      | UserName | Password |
      | tomsmith      | SuperSecretPassword!   |
    And user clicks login
    And user is logged in successfully
    When user clicks logout
    Then user is logged out successfully
