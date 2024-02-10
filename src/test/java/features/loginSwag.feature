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
#@ (Tags/Labels):To group Scenarioss
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@loginFeature
Feature: Login to the SwagLab Application

  @loginApp
  Scenario Outline: Verify if user is able to login with valid credentials
    Given I launch the "<url>" of the application
    When I enter "<userName>" and "<password>"
    Then I should be able to login successfully.

    Examples: 
      | url	  										 | userName     | 		password  |
      | https://www.saucedemo.com/ |standard_user 	 | secret_sauce    |
      
