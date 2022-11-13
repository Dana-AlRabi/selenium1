Feature: AdsPopupfeature

  Scenario: closing ads popup
    Given user navigates to the "entry_ad"
    When user close ad popup
    Then ad pop-up is closed