# cucumber-calculadora-java
## David Ramírez
Proyecto de calculadora - Especificación de pruebas usando Cucumber y Gherkin

### *Test.feature* contiene todas las pruebas como distintos scenarios

- *Scenario Outline: Suma*: Contiene una prueba del método Calculadora.suma presentada en 1 escenario estandar.\
Estructura:\
Given Calculadora\
When Suma {double} y {double}\
Then Resultado es {double}
