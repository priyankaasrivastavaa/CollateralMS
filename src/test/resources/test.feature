Feature: the version can be retrieved

  Scenario: client makes call to GET /version
    When the client calls version
    Then the cllient receives status code of 200
    And the cllient receives server version 1.0