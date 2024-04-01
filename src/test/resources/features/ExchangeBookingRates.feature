Feature:
  Scenario : Verify the api code and status returned
    Given get api hit
    When  I pass the url of products in the request
    Then  I receive the response code as 200
  Scenario : Verify USD price against the AED and make sure the prices are in range on 3.6 – 3.7
    Given get api hit
    When  I pass the url of products in the request
    Then  I receive the price against the AED on range 3.6-3.7
  Scenario : Verify that 162 currency pairs are returned by the API
    Given get api hit
    When  I pass the url of products in the request
    Then  Total currency pairs returned are 162
  Scenario : Verify API response matches the Json schema
    Given get api hit
    When  I pass the url of products in the request
    Then  Json schema matches API response
  Scenario : Verify the API response Ɵme is not less then 3 seconds then current Ɵme in second.
    Given get api hit
    When  I pass the url of products in the request
    Then  I receive the response time less than 3 seconds

