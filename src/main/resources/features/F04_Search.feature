@smoke

Feature: F04_Search.feature | users could use search feature to find and certain product

#  scenario outline 1:
  Scenario Outline: user could search using product name
    Given user navigates to search page
    When user enters <productName>
    And user clicks search button
   Then search results contains <productName>
    Examples:
      | productName  |
      | nike         |
      | laptop       |
      | book         |

#  scenario outline 2:
  Scenario Outline: user could search using product SKU
    Given user navigates to search page
    When user types product <sku>
    And user clicks search button
    And user clicks a result from search results
   Then the sku from the opened result matches <sku> from search criteria
    Examples:
      | sku       |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |

