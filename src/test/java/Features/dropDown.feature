Feature: DropDownFeature

  Scenario: dropdown list select functionality
    Given user navigates to the "/dropdown"
    When user selects option "1"
    Then "option1" is chosen
    When user selects option "2"
    Then "option2" is chosen


