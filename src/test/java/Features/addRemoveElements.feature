Feature: AddRemoveElementsFeature

  Scenario: adding elements
    Given user navigates to the "add_remove_elements/"
    When user adds a new element
    Then delete button is added


  Scenario: removing elements
    Given user navigates to the "add_remove_elements/"
    And user adds a new element
    And delete button is added
    When user clicks on delete
    Then added elements should be deleted





