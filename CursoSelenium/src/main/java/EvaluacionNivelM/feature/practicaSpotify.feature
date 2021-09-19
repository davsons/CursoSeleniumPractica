Feature: Spotify TestSpotify

  Scenario Outline: Paquetes

    Given Estoy en Sitio SpotifyPremium
    When Ingreso a options <options>

    Examples:
      |options|
      |Individual|
      |Familiar|
      |Duo          |


  Scenario: Email

    Given Estoy en Sitio SpotifyPremium
    When Estoy en registro
    And Valido Correo vacios
    Then Valido Correo Incorrecto
    Then Valido Correo Existente

    Scenario Outline: Links

      Given Estoy en Sitio SpotifyLegal
      When Ingreso a options <links>

      Examples:
        |links|
        |Disfrutando Spotify|
        |Pagos,cancelaciones y periodo de reflexión|
        |Uso de nuestro servicio|









