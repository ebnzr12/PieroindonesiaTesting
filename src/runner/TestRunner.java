package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Feature", glue="Login")

public class TestRunner {

}
