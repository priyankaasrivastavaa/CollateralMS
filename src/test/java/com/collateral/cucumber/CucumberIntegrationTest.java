package com.collateral.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberContextConfiguration
@CucumberOptions(glue = {"com.collateral.cucumber"},
        features = {
                "classpath:src/test/resources/test.feature"},
        plugin = {"de.monochromata.cucumber.report.PrettyReports:build/cucumber"})
public class CucumberIntegrationTest extends SpringIntegrationTest {
}
