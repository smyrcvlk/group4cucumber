Feature: Create a Grade level
  Scenario: Grade level Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on gradelevel
    And Click on plus icon
    And Type the gradelevel name "sumeyra"
    And Type the shortName "smyr"

    And Type the order "0"
    When Click on save button
    Then "sumeyra" should be displayed
    And Remove the data "sumeyra"
    Then Verify data is removed "sumeyra"