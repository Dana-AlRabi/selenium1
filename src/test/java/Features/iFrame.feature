Feature: iFramefeature

  Scenario: adding a content in iframe
    Given user navigates to the "iframe"
    When user navigate to timnymce field
    And user add a content
    Then content is added