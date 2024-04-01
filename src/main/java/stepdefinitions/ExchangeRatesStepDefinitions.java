package stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import pages.ExchangeRateData;



import static org.junit.Assert.assertEquals;

public class ExchangeRatesStepDefinitions {

    public int statusCode;
    Response response;

    public int responseCode;
    @Given("get api hit")
    public void get_api_hit() {

        RestAssured.baseURI =  "https://open.er-api.com/";
        RequestSpecification httpRequest = RestAssured.given();
        response = httpRequest.get("v6/latest/USD");
    }

    @When("I pass the url of products in the request")
    public void i_pass_the_url_of_products_in_the_request(){

        int responseCode = response.getStatusCode();

    }

    @When("Pass url")
    public void pass_url(){
        int responseCode = response.getStatusCode();
        ResponseBody body = response.body();

        String responseBody = body.toString();
        JsonPath jsonPath = response.jsonPath();
        String s = jsonPath.getJsonObject("").toString();
    }

    @Then("I receive the response code as 200")
    public void i_receive_the_response_code_as_200(){
        assertEquals(responseCode,200);
    }

    @Then(" I receive the response time less than 3 seconds")
    public void i_receive_the_response_time_less_than_3sec(){
        assertEquals(response.getTime(),3);
    }

    @Then("Total currency pairs returned are 162")
    public void i_receive_total_currency_pairs_162(){
       ResponseBody list_size = response.getBody();
       assertEquals("",162);
    }

    @Then("Json schema matches API response")
    public void json_schema_matches_API_response() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        ExchangeRateData exchangeRateData = objectMapper.readValue(response.getBody().toString(), ExchangeRateData.class);
        assertEquals(response.getBody().jsonPath().toString(),"");
    }

    @Then("I receive the price against the AED on range 3.6-3.7")
    public void i_receive_the_price_in_range(){
        assertEquals(responseCode,200);
    }
}
