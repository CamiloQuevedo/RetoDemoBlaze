# Autor: Camilo Quevedo

@stories
Feature: DemoBlaze new user registration
  As a new user, I can register on the DemoBlaze page.

  @scenario1
  Scenario Outline: Camilo's successful registration on DemoBlaze's page
    Given that Camilo wants to register on the DemoBlaze page
    When he enters all the data requested in the record
    Then he completes the registration successfully on the page
    |strFinalTextUserRegister  |
    |<strFinalTextUserRegister>|
    Examples:
      |strFinalTextUserRegister|
            ##@externaldata@./src/test/resources/dataDriver/DemoBlazeData.xlsx@UserRegister
   |Sign up successful.|


 
  




