package Step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class India_portal_steps {
	WebDriver driver;
   @Given("User opens the browser and navigate to India government portal for website")
	public void user_opens_the_browser_and_navigate_to_India_government_portal_for_website() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.india.gov.in/user/register");
	driver.manage().window().maximize();
		Thread.sleep(2000);
   }

	@Given("User click on register")
	public void user_click_on_register() {
	    driver.get("https://www.india.gov.in/user/register");
	}

	@When("User enter username, email address")
	public void user_enter_username_email_address() {
	    driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys("Shilpa14");
	    driver.findElement(By.xpath("//input[@id='edit-mail']")).sendKeys("shilpashree.h.m.06@gmail.com");
	}

	@When("User enters Firstname, Lastname")
	public void user_enters_Firstname_Lastname() {
	   driver.findElement(By.xpath("//input[@id='edit-profile-main-field-first-name-und-0-value']")).sendKeys("Shilpa");
	   driver.findElement(By.xpath("//input[@id='edit-profile-main-field-last-name-und-0-value']")).sendKeys("shree");	
	   }

	@When("User selects country, state")
	public void user_selects_country_state() {
		WebElement country_box=	driver.findElement(By.xpath("//select[@id='edit-profile-main-field-country-und']"));
	    country_box.click();
		Select select = new Select(country_box); // Create a Select object for Dropdowns
	    select.selectByVisibleText("India"); // Select an option by visible text
	    WebElement state_box= driver.findElement(By.id("edit-profile-main-field-state-und-hierarchical-select-selects-0"));
	    state_box.click();
	    Select sel= new Select(state_box);
	    sel.selectByVisibleText("Karnataka");
	}

	@When("User enters pincode, education")
	public void user_enters_pincode_education() {
	    driver.findElement(By.id("edit-profile-main-field-pin-code-und-0-value")).sendKeys("572128");
	  WebElement  education_box =driver.findElement(By.id("edit-profile-main-field-education-und"));
	  education_box.click();
	  Select add= new Select(education_box);
	  add.selectByVisibleText("Graduate/Post Graduate-Professional");
	}

	@When("User click on radio button newsletter")
	public void user_click_on_radio_button_newsletter() {
	  driver.findElement(By.id("edit-profile-main-field-subscribe-to-our-newslett-und-yes")).click();
	}

	@When("User click on create new account")
	public void user_click_on_create_new_account() {
	    driver.findElement(By.id("edit-submit")).click();
	}

	@Then("User gets a pop-up")
	public void user_gets_a_pop_up() {
	  System.out.println("Pop-up will get");
	  driver.quit();
	}

}
