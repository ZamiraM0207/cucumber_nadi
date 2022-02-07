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

#//////////
@tag6
Feature: Cardio Page functionality


#Background:
# User is on the cardio page


  Scenario: Threadmill button Functonality
    Given user is on the cardio tab
    When user clicks the treadmill picture
		Then user should be on the treadmill page

  Scenario: Add to cart button from Bike page
    Given user is on the bikes page
    When user clicks the treadmill picture
		And adds first item of bike to the cart
		Then carts page should have the bike added
	
	Scenario: Rowers sort by drop down button
    Given user is on the Rowers page
    When user clicks on sort by 
    And changes the price to Asc
		Then user should be able to see all bikes in ascending order
		
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
