package Runner.java;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Shilpashree\\Desktop\\Cucumber_ddemo\\src\\test\\resources\\Form\\Formexample.feature"},
glue= {"Step_definition"}
)

public class Runnerformexample {

}
