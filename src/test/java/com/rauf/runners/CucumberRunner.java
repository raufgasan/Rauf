package com.rauf.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com\\rauf\\step_definitions",
        features = "src\\test\\resources\\features",
        plugin = {
                "json:target/cucumber.json"
        },
        tags = "@api",
        dryRun = true

)


public class CucumberRunner {
}
