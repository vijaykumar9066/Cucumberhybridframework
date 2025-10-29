package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",              // Path of feature files
    glue = {"stepdefinitions", "hooks"},                   // Step definitions and hooks packages
    plugin = {
        "pretty",                                          // Clean console output
        "html:target/cucumber-reports.html",               // HTML report
        "json:target/cucumber.json"                        // JSON report
    },
    monochrome = true,   									// Makes console output readable
    publish = true
)
public class TestRunner {
}



