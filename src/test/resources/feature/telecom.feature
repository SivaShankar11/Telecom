#Author: siva

@telecomfeature 
Feature: telecom site automation
  I want to use this template for my feature file

  @addcustomerscenario
  Scenario: Add Customer
    Given Lauch Browser
    When user enters username password
    And click on the login button	
    Then user validates login screen
 