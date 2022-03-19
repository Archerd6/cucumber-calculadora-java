Feature: TestGlobal


   Scenario Outline: SumaOk
    Given I have a Calculator
    When I sum <a> and <b>
    Then the result is <value>

    Examples: 
         |  a   |  b  |  value  |
         |  5   |  1  |    6    |
         |  123   |  9  |    132    |
         |  876  |  557  |    1433   |
         |  2   |  5543  |    5545    |