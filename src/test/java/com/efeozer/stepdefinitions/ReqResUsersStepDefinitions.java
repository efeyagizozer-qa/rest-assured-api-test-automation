package com.efeozer.stepdefinitions;

import com.efeozer.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import static org.hamcrest.Matchers.equalTo;

public class ReqResUsersStepDefinitions {

    Response response;

    @Given("user sends GET request to {string}")
    public void userSendsGETRequestTo(String endpoint) {

        response = RestAssured
                .given()
                .baseUri(ConfigurationReader.getProperty("base_url"))
                .header("x-api-key",
                        ConfigurationReader.getProperty("api_key"))
                .queryParam("page", 2)
                .when()
                .get(endpoint);
    }

    @Then("status code should be {int}")
    public void statusCodeShouldBe(int expectedStatusCode) {
        int actualStatusCode = response.statusCode();
        Assert.assertEquals(expectedStatusCode, actualStatusCode);

    }

    @Then("page number should be {int}")
    public void pageNumberShouldBe(int expectedPageNumber) {

        response.then()
                .body("page", equalTo(expectedPageNumber));
    }
}
