package Step_definition;

//import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Formexamplesteps {
	String input1,input2,result;
	@Given("input1 is \"([^\"]*)\"$")
	public void input1(String input1) {
	    this.input1=input1;
	}

	@When("input2 is also \"([^\"]*)\"$")
	public void input2(String input2) {
		this.input2=input2;
	}

	@Then("result should be \"([^\"]*)\"$")
	public void result(String result) {
		this.result=result;
	//    Assert.fail();
	}
}
