Feature:  Google HomePage

  Background: Google
    Given I am in google home

  @Test1
  Scenario: Search
    Then I am click Search and Write "Sleep"


  Scenario Outline: Send value
    Then I am searching a <Start>
    Then I search <value>
    Examples:
      |Start||value|
      |  book   || pen     |

  @Test2
  Scenario: searching
    Then i am searching:
      |Name|