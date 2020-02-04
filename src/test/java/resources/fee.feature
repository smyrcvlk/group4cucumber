Feature: Create a Fee
  Scenario: Fee Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on fee
    And Click on plus icon
    And Type the  feename "sumeyra"
    And Type the  feecode "smyr"

    And Type in Feepriority "0"
    When Click on save button
    Then "sumeyra" should be displayed
    And Remove the data "sumeyra"
    Then Verify data is removed "sumeyra"
