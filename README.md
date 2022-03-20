# cucumber-calculadora-java
## David Ramírez
Proyecto de calculadora - Especificación de pruebas usando Cucumber y Gherkin

### *Test.feature* contiene todas las pruebas como distintos scenarios

- *Suma*: Contiene pruebas del método Calculadora.suma() **Escenario Outline**\
Estructura:\
   Scenario Outline: Suma\
   Given I have a Calculator\
   When I sum <a> and <b>\
   Then the result is <value>\