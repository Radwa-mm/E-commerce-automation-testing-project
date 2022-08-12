@smoke
  Feature: F03_currencies | users could change currency
    Scenario: user could change currency to euro
      Given user clicks on currency dropdown list
      When  user elect Euro currency from the dropdown list
      Then Euro Symbol is shown on the 4 products displayed in Home page