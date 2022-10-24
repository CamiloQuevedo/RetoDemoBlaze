# Autor: Camilo Quevedo

@stories
Feature: shopping through the shopping cart
  As a user, I can make purchases using the shopping cart.

  @scenario1
  Scenario Outline: Camilo makes a purchase by adding a product to the cart
    Given that Camilo is logged in to DemoBlaze page
    |strUsername  |strPassword  |
    |<strUsername>|<strPassword>|
    When he finds the product to buy
      |Name  |Country  |City  |CreditCard  |Month  |Year  |
      |<Name>|<Country>|<City>|<CreditCard>|<Month>|<Year>|
    Then he successfully completes the purchase process
      |strFinalTextUserRegister|
      |<strFinalTextUserRegister>|
    Examples:
      |strUsername  |strPassword  |Name          |Country |City         |CreditCard |Month|Year  |strFinalTextUserRegister    |
            ##@externaldata@./src/test/resources/dataDriver/DemoBlazeData.xlsx@ShoppingCart
   |CamiloQuevedo   |CamiloQuevedo   |Camilo Quevedo   |Colombia   |Villavicencio   |92837472734   |12   |2022   |Thank you for your purchase!|
