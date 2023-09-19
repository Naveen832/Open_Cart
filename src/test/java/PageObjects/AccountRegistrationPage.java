package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(id="input-firstname") WebElement FirstName;
	@FindBy(id="input-lastname") WebElement LastName;
	
	@FindBy(xpath="//input[@id='input-email']") WebElement Email;
	@FindBy(xpath="//input[@id='input-password']") WebElement Password;
	@FindBy(xpath="//input[@name='agree']") WebElement Agree;
	@FindBy(xpath="//button[normalize-space()='Continue']") WebElement submit;
	
	public void enterFirstname(String fname) {
		FirstName.sendKeys(fname);
	}
	public void enterLastname(String Lname) {
		LastName.sendKeys(Lname);
	}
	public void enterEmail(String email) {
		FirstName.sendKeys(email);
	}
	public void enterPassword(String pwd) {
		FirstName.sendKeys(pwd);
	}
	public void selectAgree() {
		Agree.click();
	}
	public void Submitbtn() {
		submit.click();
	}
}
