package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormFillingPage {
	
WebDriver driver;
	
	public FormFillingPage(WebDriver rdriver) {
		driver = rdriver;		
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="userEmail")
	WebElement emailId;
	
	@FindBy(xpath="//*[text()='Male']")
	WebElement maleBtn;
	
	@FindBy(id="userNumber")
	WebElement mobileNo;
	
	@FindBy(id="dateOfBirthInput")
	WebElement DOB;
	
	@FindBy(className="react-datepicker__year-select")
	WebElement yearSelect;
	
	@FindBy(className="react-datepicker__month-select")
	WebElement monthSelect;
	
	@FindBy(xpath="//div[contains(@class,'react-datepicker__day react-datepicker__day--010')]")
	WebElement dateSelect;

	
	@FindBy(xpath="//*[@id='subjectsContainer']//input")
	WebElement subjects;
	
	@FindBy(xpath="//div[@class='custom-control custom-checkbox custom-control-inline']//input[@value='1']")
	WebElement selectHobbies;

	@FindBy(id="currentAddress")
	WebElement address;
	
	
	@FindBy(id="react-select-3-input")
	WebElement selectState;

	@FindBy(id="react-select-4-input")
	WebElement selectCity;
	
	@FindBy(id="submit")
	WebElement submitBtn;
	

	public void FName(String enterFname) {
		firstName.sendKeys(enterFname);
	}

	public void LName(String enterLname) {
		lastName.sendKeys(enterLname);
	}

	public void Email(String emailAdd) {
		emailId.sendKeys(emailAdd);
	}

	public void clickOnMaleBtn() {
		maleBtn.click();
	}

	public void Mnumber(String mobileNumber) {
		mobileNo.sendKeys(mobileNumber);
	}

	public void DateOfBirth() {
		DOB.click();
	}

	public void selectYear() {
		Select se = new Select(yearSelect);
		se.selectByVisibleText("1995");
	}

	public void selectMonth() {
		Select sel = new Select(monthSelect);
		sel.selectByVisibleText("August");
	}

	public void selectDate() {
		dateSelect.click();
	}

	public void enterSubject(String subjectText) {
		subjects.sendKeys(subjectText);
		subjects.sendKeys(Keys.ENTER);
	}

	public void hobbies() {
		
		selectHobbies.click();
	}

	public void entercurrentAdd(String currentAdd) {
		address.sendKeys(currentAdd);
	}

	
	public void stateSelect(String stateName) {
		
		selectState.sendKeys(stateName);
		selectState.sendKeys(Keys.ENTER);
	}

	public void citySelect(String cityName) {
		selectCity.sendKeys(cityName);
		selectCity.sendKeys(Keys.ENTER);
	}
	
	public void clickOnSubmitBtn() {
		submitBtn.click();
	}
	

}
