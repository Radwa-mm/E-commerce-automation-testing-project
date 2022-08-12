@smoke
  Feature: F05_hoverCategories | users could hover on one of main categories then click on sub category
    Scenario: user could hover on one of main categories then click on sub category
      Given user selects a random category of the three main categories
      When user hover on the selected category
      And user click on sub category
      Then sub category page is opened successfully
