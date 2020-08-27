  Feature: Verify Get Request

    Scenario: Verify Get Without Parameters
      Given I set  GET request
      When I not providing any parameters
      Then Verify status code "200"
      And Content type "application/json; charset=utf-8"
      Then Verify that name, surname, gender, region fields have value