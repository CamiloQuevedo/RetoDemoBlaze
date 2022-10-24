package runners;

import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import util.BeforeSuite;
import util.DataToFeature;
import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/UserRegister.feature",
        tags = "@stories",
        glue = "stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

@RunWith(DataDriverRunner.class)

public class UserRegister_RunnerTags {

    @BeforeSuite
            public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/UserRegister.feature");
    }
}