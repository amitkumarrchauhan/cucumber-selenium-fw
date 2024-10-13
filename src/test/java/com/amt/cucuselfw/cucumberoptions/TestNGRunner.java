package com.amt.cucuselfw.cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/com/amt/cucuselfw/features",
    glue = "com.amt.cucuselfw.stepDefinitions", monochrome = true)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
