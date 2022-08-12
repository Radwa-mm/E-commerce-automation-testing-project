@smoke
  Feature: F08_Wishlist | user could add different products to Wishlist

    #first scenario
    Scenario: adding a product to wishlist displays a success message
      When user clicks add to  wishlist button
      Then a success message is displayed at the top of the page

      #second scenario
    Scenario: adding a product to wishlist increases quantity value on wishlist page
      When user clicks add to  wishlist button
      And user goes on Wishlist page
      Then the quantity value is bigger than 0