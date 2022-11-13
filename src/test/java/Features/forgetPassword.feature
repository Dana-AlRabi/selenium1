Feature: ForgetPassword

  Scenario: user enters their email to reset password
    Given user navigates to the "forgot_password"
    When user enters the email "alrabi.dana@gmail.com"
    And user clicks on retrieve password action
    Then user is redirected to email is sent page
