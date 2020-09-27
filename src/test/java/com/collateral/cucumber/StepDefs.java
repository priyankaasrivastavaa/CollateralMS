package com.collateral.cucumber;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.HttpStatus;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StepDefs extends SpringIntegrationTest {

    @When("the client calls version")
    public void theClientCallsVersion() {
        executeGet("http://localhost:9062/version");
    }

    @Then("the cllient receives status code of {int}")
    public void theCllientReceivesStatusCodeOf(int arg0) throws IOException {
        HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : " +
                latestResponse.getBody(), currentStatusCode.value(), is(arg0));
    }

    @And("the cllient receives server version {string}")
    public void theCllientReceivesServerVersion(String arg0) {
        assertThat(latestResponse.getBody(), is(arg0));
    }
}
