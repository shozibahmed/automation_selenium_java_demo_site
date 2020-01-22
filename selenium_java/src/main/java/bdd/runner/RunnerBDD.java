package bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(


        //tags = { "@debug" },
        //tags = { "@smoke" },         /* smoke test only */
        //tags = { "@smoke,@debug" }, /* debug or smoke test */
        //tags = { "@smoke","@debug" },  /* debug and smoke test */
        //monochrome = true,
        features = {"C:\\Users\\Yusuf\\Documents\\automation_selenium_java_demo_site\\selenium_java\\src\\main\\java\\bdd\\features"},
        //features = {"src\\main\\java\\bdd\\features"},
        //the path of the feature files
        //features = "src/test/resources/features/LoginFunctionality2.feature",
        //features = {"src/test/resources/features/LoginFunctionality2.feature",
        //            "src/test/resources/features/LoginFunctionality.feature"},
        //glue = {"C:\\Users\\Yusuf\\Documents\\automation_selenium_java_demo_site\\selenium_java\\src\\main\\java\\bdd\\stepDefinition\\FunctionalTest"},
       glue = {"stepDefinition"},
        //dryRun = true,
        /***
        features = "/Users/NaveenKhunteta/Documents/workspace/FreeCrmBDDFramework/src/main/java/Features/taggedhooks.feature", //the path of the feature files
        glue={"stepDefinitions"}, //the path of the step definition files
        format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
        monochrome = true, //display the console output in a proper readable format
        strict = true, //it will check if any step is not defined in step definition file
        dryRun = false //to check the mapping is proper between feature file and step def file
        //tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
         ***/
        plugin={
                "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml"
        }
)



public class RunnerBDD {
        public static void main(String[] args) {
                String currentDirectory= System.getProperty("user.dir");
                System.out.println(currentDirectory);
        }
}
