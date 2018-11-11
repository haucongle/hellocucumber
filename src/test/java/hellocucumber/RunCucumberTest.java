package hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json"},
//        monochrome = true,
//        dryRun = true,
//        strict = true,
        features = {
//                "src/test/resources/hellocucumber",
//                "src/test/resources/hellocucumber/is_it_friday_yet.feature",
//                "src/test/resources/hellocucumber/shopping.feature",
                "src/test/resources/hellocucumber/example.feature",
        }
//        glue = {},
//        tags = {}
)
public class RunCucumberTest {
}
