#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
# @SmokeTest50
Feature: Verify SignUp Functionality

Background: 
      Given User Navigates to Fitness Avenue website registration page 
       
   
  Scenario: Verify user can register with new valid email 
    When User enters new valid email and creates password
    And User completes billing information
    And User clicks Register button
   Then User is navigated to HomePage
    And User should see Welcome Message1 on Homepage
     
       
   @SmokeTest50  
  Scenario: Verify user registetrs using valid email  
    Given User Navigate to Fitness Avenue websit registration page
    When User Enter email that was registered before
    Then User get Message Username already exist in display on Sign up page
   
   
    
    
  Scenario: Verify user registetrs without firstname 
    Given User Navigate to Fitness Avenue websit registration page
    When User Entering valid email that was not used before without firstname
    Then User get Message Your First name is required is display on Sign up page
    