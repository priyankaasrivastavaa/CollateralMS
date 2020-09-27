package com.collateral.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"com.collateral.cucumber"}, features = {
        "classpath:src/test/resources/test.feature"})
public class CucumberIntegrationTest extends SpringIntegrationTest {
}
