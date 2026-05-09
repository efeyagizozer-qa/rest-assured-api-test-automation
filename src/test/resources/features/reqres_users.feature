Feature: ReqRes Users API

  Scenario: Get users successfully

    Given user sends GET request to "/api/users?page=2"
    Then status code should be 200