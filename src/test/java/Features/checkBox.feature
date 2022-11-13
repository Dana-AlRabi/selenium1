Feature: CheckBoxFeature

  Scenario: checkbox functionality
    Given user navigates to the "checkboxes"
    When user select first checkbox
    Then the checkbox is checked
    And user unselect first checkbox
    Then the checkbox is unchecked
