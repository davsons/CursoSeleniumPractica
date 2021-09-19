Feature: Reserva de Vuelos

  Scenario Outline: Reservas

    Given Estoy en la pagina
    When  Ingreso Reserva <Destino>
    Then  Valido <Reserva>

    Examples:
    |Destino|   |Reserva|
    |Punta Cana ||Reserva Punta Cana|
    |Argentina  ||Reserva Argentina |
    |Colombia  ||Reserva Colombia |

  Scenario: Experiencias

    Given Estoy en la pagina
    When Ingreso a experiencias
    And Reservo Experiencias
    Then Valido Reserva


  Scenario: Lugares Cercanos
    When Estoy en la pagina
    Then Valido Lugares Cercanos

