package Runner.java;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Shilpashree\\Desktop\\Cucumber_ddemo\\src\\test\\resources\\Form\\outline.feature"},
glue= {"Step_definition"}
)
public class india_portal_runner {

}
