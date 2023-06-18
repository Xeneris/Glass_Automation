Feature: Workflows
  As a registered admin user,
  I want to be able to see the correct number of workflows.

  Scenario: Number of workflows displayed correctly
    Given You are logged in as codecooladmin and you are on the Glass Test Project overview site
    When You check the Workflows box on the right side of the screen
    And click the schemes dropdown at the bottom of the page
    And choose the "GTP Workflow scheme"
    Then You see the correct workflows in the table at the bottom of the page