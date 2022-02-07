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

## (Comments)
#Sample Feature Definition Template
##################START FEATURE#########################
@Opal
Feature: Verify function and data on MyAccount tab

Background: 

 		Given A user is able to login with a valid username/password
 
Scenario: Verify the  information in Billing session that successfully save

		When A user navigates to My Account tab 
		And  A user is able to change the info in address fields box to "5678"
		Then A user should successfully verify a message Your details has been save

Scenario: Verify radio button is selected in Filter session on Web Orders Tap.

		When A user is navigate to Orders Tab
		Then A user is able to verify if Order Number is selected
 
Scenario: Verify adding favorite part number on Favorites Tap successfully.

		When A user is navigates to Favorite Tab.
		And  A user enters part number in the fields.
		Then A user successfully verifies a message Product Added Successfully
 
 ##################END FEATURE#########################
 
 
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

      
   
      
     
      
      