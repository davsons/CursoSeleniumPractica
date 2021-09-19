Feature: Spotify Evaluacion

  Scenario Outline: Planes

    Given Estoy en Sitio SpotifyPremium
    When Ingreso a options <options>
    Then Valido Plan

    Examples:
      |options|
      |Individual|
      |Familiar|
      |Universitario|