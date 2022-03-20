# cucumber-calculadora-java
## David Ramírez

Especificación de pruebas usando Cucumber y Gherkin

#### El archivo *Test.feature* contiene todas las pruebas como distintos scenarios

- *Suma*: Contiene pruebas del método Calculadora.suma()    &nbsp; &nbsp; &nbsp;    **Escenario Outline**\
Estructura:\
   Scenario Outline: Suma\
   Given I have a Calculator\
   When I sum <a> and <b>\
   Then the result is <value>\