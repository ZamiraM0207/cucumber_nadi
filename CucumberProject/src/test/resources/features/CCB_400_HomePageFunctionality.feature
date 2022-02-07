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

@SmokeTest4
  Feature: Verify Home Page functionality
  
  
  Background:
  Given A user is on the Home Page

  
  Scenario: Verify home page has four sliders only
  
  When A user click to the scroll button on right side
  Then A user is able verify Home page has four sliders only
   
 
  Scenario: Verify home page has five images under sliders
  
  When A user click to the images
  Then A user is able to verify Home page has five images

  
  Scenario: Verify send a keyword to the keywords successfully
  
  When A user is send key to the keyword field "BIKE"
  And A user click enters 
  Then A user successfully verifies a message 
  

   