Feature: Spotify

  Scenario Outline: PlanesF

    Given Estoy en Sitio Spotify
    When Ingreso a opciones <options>

    Examples:
      |opciones|
      |Individual|
      |Familiar|
      |Universitario|


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
