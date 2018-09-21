Feature: Login esktop
  As a QuintoAndar client
  I want to do my login
  So that I can see my personal data

  Background:
    Given I have accessed the QuintoAndar site
    When I click in the waffle menu button
    Then I should see the login button

  Scenario: Valid Login with AccountKit
    When I click in the login button
    And insert a valid mobile country code
    And insert a valid mobile área code
    And insert a valid mobile number
    And I click in the confirm button
    And confirm the information in the popup
    And insert the code received by sms in the AccountKit
    And click in the continue button
    Then I should be authenticated with success
