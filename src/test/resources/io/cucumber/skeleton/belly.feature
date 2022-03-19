Feature: TestGlobal


   Scenario Outline: SumaOk
    Given I have a Calculator
    When I sum <a> and <b>
    Then the result is <value>

    Examples: 
         |  a   |  b  |  value  |
         |  2   |  2  |    4    |
         |  0   |  0  |    0    |
         |  -2  |  1  |    -1   |