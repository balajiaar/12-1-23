package Cucumber.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,features="src/test/java/resources/FeatureFiles",glue="Stepdefinition",monochrome=true,
plugin= {"pretty","html:src//test//java//resources//report"})
public class Runnerclass {
	

}