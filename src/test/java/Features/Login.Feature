Feature: Login Functionility

  Background:Opens Chrome Browser
    Given Chrome Browser is Open

Scenario: Validate the login Functionality
  Given User is on Orange HRM Login Page
  When <Username> and <Password> is Entered
  Then User Should be logged into Homepage
