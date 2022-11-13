Feature: RedirectsFeature

  Scenario: page redirection to 200 status code page
    Given user navigates to the "redirector"
    And user triggers a redirect
    And user is on status codes page
    When user click on Success code
    Then user is redirected to the code page

  Scenario: page redirection to 301 status code page
    Given user navigates to the "redirector"
    And user triggers a redirect
    And user is on status codes page
    When user click on redirection code
    Then user is redirected to the code page



  Scenario: page redirection to 404 status code page
    Given user navigates to the "redirector"
    And user triggers a redirect
    And user is on status codes page
    When user click on client error code
    Then user is redirected to the code page

  Scenario: page redirection to 500 status code page
    Given user navigates to the "redirector"
    And user triggers a redirect
    And user is on status codes page
    When user click on server error code
    Then user is redirected to the code page




