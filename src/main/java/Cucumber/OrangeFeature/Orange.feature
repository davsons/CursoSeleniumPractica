Feature: Orange Test

  Scenario Outline:
    Given on the orange page
    When  Logged in
    And  I enter landing page
    And  Prueba
    Then See <option> of quick actions

    Examples:
      | option       |
      | Assign Leave |
      | Leave List   |
      | My Leave     |

    Scenario:
      Given on the orange page
      When  Logged in
      And   I get the amount of leave request to approve
      And   Enter the leave request section
      Then  Items displayed must match










