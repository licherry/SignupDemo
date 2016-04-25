@Signin
Feature: Sign in
  As a user
  I want to be able to sign in the system by an existing account

  Background:
    Given the user is on landing page

  Scenario: Sign in successfully
    When she inputs email as "bbbb@test.com"
    And she inputs password as "12345678"
    And she signs-in
    Then she should be logged in to the application
