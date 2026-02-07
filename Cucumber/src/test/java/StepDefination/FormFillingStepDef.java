package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.FormFillingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFillingStepDef {
	
	WebDriver driver;
	FormFillingPage formFilling;
	
	@Given("User open Form Filling website as {string}")
	public void user_open_form_filling_website_as(String url) {
		
		WebDriverManager.chromedriver().clearDriverCache().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
	    formFilling = new FormFillingPage(driver);
	    
	    
	}

	@When("User enter first name {string}")
	public void user_enter_first_name(String FirstName) {
		
		formFilling.FName(FirstName);
	}

	@When("Enter last name {string}")
	public void enter_last_name(String LastName) {
		
		formFilling.LName(LastName);
	}

	@When("Enter email {string}")
	public void enter_email(String EmailID) {
		
		formFilling.Email(EmailID);
	}

	@When("User click on male radio button")
	public void user_click_on_male_radio_button() {
		
		formFilling.clickOnMaleBtn();
	}

	@When("Enter Mobile no. as {string}")
	public void enter_mobile_no_as(String MobileNumber) {
		
		formFilling.Mnumber(MobileNumber);
	}

	@When("Select Date of Birth")
	public void select_date_of_birth() {
		
		formFilling.DateOfBirth();
		formFilling.selectYear();
		formFilling.selectMonth();
		formFilling.selectDate();
	}

	@When("Enter subject as {string}")
	public void enter_subject_as(String SubjectText) {
		
		formFilling.enterSubject(SubjectText);
	}

	@When("Select hobbies checkbox")
	public void select_hobbies_checkbox() {
		
		formFilling.hobbies();
	}

	@When("Enter Address {string}")
	public void enter_address(String CurrentAddress) {
		
		formFilling.entercurrentAdd(CurrentAddress);
	}

	@When("Select State as {string} and City as {string}")
	public void select_state_as_and_city_as(String state, String city) {
	    
		formFilling.stateSelect(state);
		formFilling.citySelect(city);
	}

	@Then("click on Submit Button")
	public void click_on_submit_button() {
		
		formFilling.clickOnSubmitBtn();
		driver.quit();
	}

}
