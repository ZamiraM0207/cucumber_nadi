@tag200
Feature: Verify LogIn Functionality

  Background: 
    Given User navigates to LogIn Page

  Scenario: Verify log in functionality with valid credencials
    When User log in with valid email and password
    And User navigated to the homepage and verify welcome text
    And User click log out
    Then User should see successfully logout message displayed on

  Scenario: Verify log in functionality with invalid credencials
    When User log in with invalid email and invalid password
    Then User should see invalid logIn. displayed on


  Scenario: Verify log in functionality without any credencials
    When User click on login button
    Then User should see Your Username and Password are required. displayed on

