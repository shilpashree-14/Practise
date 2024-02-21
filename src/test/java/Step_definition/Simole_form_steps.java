package Step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Simole_form_steps {
	WebDriver driver;
	@Given("User opens the browser and navigate to V{int} training for website")
	public void user_opens_the_browser_and_navigate_to_V_training_for_website(Integer v11) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/simple-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("User enters First name, Last name, Email")
	public void user_enters_First_name_Last_name_Email() {
		    driver.findElement(By.id("firstName")).sendKeys("Shilpa");
		    driver.findElement(By.id("lastName")).sendKeys("shree");
		    driver.findElement(By.id("email")).sendKeys("shilpashree.h.m.06@gmail.com");
	}

	@When("User enters Contact Number, Message")
	public void user_enters_Contact_Number_Message() {
		 driver.findElement(By.id("number")).sendKeys("987654321");
		  driver.findElement(By.xpath("//div[@class='field']//textarea")).sendKeys("Hello");
	}

	@When("User clicks on Submit")
	public void user_clicks_on_Submit() {
		driver.findElement(By.xpath("//input[@value='submit']")).click();
	}

	@Then("A confirmation pop-up should displayed")
	public void a_confirmation_pop_up_should_displayed() {
	   System.out.println("clicking on submit");
	  driver.quit();
	}

}
