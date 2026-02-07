package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriverManager.chromedriver().setup();
driver = new ChromeDriver(options);

	
	public  LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="username")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement submitBtn;
	
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement LogoutBtn;
	
	public void enterEmail(String emailAdd)
	{
		
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pass)
	{
	
		password.sendKeys(pass);
	}
	
	public void loginBtn()
	{
		submitBtn.click();
		
	}
	
	public void logoutBtn()
	{
		LogoutBtn.click();
	}
	
	public void clearField()
	{
		email.clear();
		password.clear();
	}
	
	
}
