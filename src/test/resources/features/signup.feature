@Signup
Feature: Sign up
  As a user
  I want to be able to add new clients in the system
  So that I can add accounting data for that client

  Background:
    Given the user is on landing page
    When she chooses to sign up

  @Signup-Simple
  Scenario: Sign up a new user
    And she provides the first name as "ccc"
    And she provides the last name as "l"
    And she provides the email as "aaaa4@3459.com"
    And she provides the password as "11111111"
    And she provides the confirm password again as "11111111"
    And she signs-up
    Then she should be logged in to the application

  @Signup-DataDriven
  Scenario Outline: Data driving new user sign-up
    And she provides the first name as "<firstName>"
    And she provides the last name as "<lastName>"
    And she provides the email as "<email>"
    And she provides the password as "<password>"
    And she provides the confirm password again as "<password>"
    And she signs-up
    Then she should be logged in to the application
    Examples:
      | firstName | lastName | email        | password |
      | Suki      | Li       | bbbc4@test.com | 12345678 |
      | Kitty     | Hello    | dddc4@test.com | 12345678 |

  @Signup-Datatable
  Scenario: Sign-up a new user with datatable example
    And she provides her details as follows:
      | firstName | lastName | email      | password |
      | Sukesa    | Kuma    | eeeu4@aq.com | 11111111 |
    And she signs-up
    Then she should be logged in to the application
