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
@SmokeTestNadia
Feature: Verify eBikes Functionality

Background: 
 Given User navigates to ebikes page
 

  Scenario: Verify user can add item to cart on eBikes page    
    When User clicks on Add to cart button 
    And User clicks on Checkout button
    Then User is on Shopping cart page
 
    Scenario: Verify user can delete item from shopping cart  
    When User clicks on Add to cart button 
    And User clicks on Checkout button
    And User removes item from Shopping cart
    Then User accepts alert message
    And Shopping cart is empty 
   

   Scenario: Verify user cannot add to cart out-of-stock items  
    When User selects out of stock item   
    Then User cannot see add to card button     
   
   

  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
