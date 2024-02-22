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
@tag
Feature: India government national portal

  @tag1
  Scenario: To verify the india national portal
    Given User opens the browser and navigate to India government portal for website
    And User click on register
    When User enter username, email address
    And User enters Firstname, Lastname
    And User selects country, state
    And User enters pincode, education
    And User click on radio button newsletter
    And User click on create new account
    Then User gets a pop-up

  
    