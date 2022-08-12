@smoke
  Feature: F06_homeSliders | users can click on home sliders

    #first scenario
    Scenario: first slider is clickable on home page
      When user clicks on the first home page slider
      Then user is directed to the correct first url


    #second scenario
    Scenario: second slider is clickable on home page
      When user clicks on the second home page slider
      Then user is directed to the correct second url
