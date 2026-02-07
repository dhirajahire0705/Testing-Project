package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);

	@Before
	public void setup() {
		
		System.out.println("Before execution before every scenerio..........");
	}
	
	@After
	public void tearDown() {

		System.out.println("After execution after every scenerio..........");
	}

	@Given("User navigate to login page url {string}")
	public void user_navigate_to_login_page_url(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		LoginPg = new LoginPage(driver);
		driver.manage().window().maximize();
		driver.get(url);
	    
	}

	@When("User enter valid email {string}")
	public void user_enter_valid_email(String EmailAdd) {
		
		LoginPg.enterEmail(EmailAdd);
	    
	}

	@When("User enter valid password {string}")
	public void user_enter_valid_password(String pwd) {
		
		LoginPg.enterPassword(pwd);
	    
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		
		LoginPg.loginBtn();
		
		if(driver.getTitle().equals("Test Login | Practice Test Automation"))
		{
			driver.quit();
		}
		
		
		
	}

	@Then("User login successfully")
	public void user_login_successfully() {
		
		System.out.println("User in Home Page");
	    
	}

	@Then("User click on logout button")
	public void user_click_on_logout_button() {
		
		LoginPg.logoutBtn();
		
	    
	}

	@Then("User logout successfully")
	public void user_logout_successfully() {
		
		System.out.println("Logout Successfully");
		driver.quit();
	}

	@When("User enter invalid email {string}")
	public void user_enter_invalid_email(String invalidEmail) {
		
		LoginPg.enterEmail(invalidEmail);
	    
	}

	@When("User enter invalid password {string}")
	public void user_enter_invalid_password(String invalidPass) {
		
		LoginPg.enterPassword(invalidPass);
	    
	}

	@Then("User should get proper warning message")
	public void user_should_get_proper_warning_message() {
	    
		System.out.println("User should enter valid credential");
	}

	@When("User should not enter any credential")
	public void user_should_not_enter_any_credential() {
		
		LoginPg.clearField();
	    
	}

}
