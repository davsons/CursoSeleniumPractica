Feature: Greetings Feature

  Scenario: Welcome

    Given I come in to the bar
    When I find people
    Then I greet then


    Scenario: Linkedin Succesfully Login
      Given Estoy en la pagina de login
      When ingreso mi usuario y contraseña 
      Then entro a mi cuenta

  Scenario: Linkedin Invalid Email Login
    Given Estoy en la pagina de login
    When ingreso mi email incorrecto
    And Ingreso mi contraseña correcta
    Then error de login


