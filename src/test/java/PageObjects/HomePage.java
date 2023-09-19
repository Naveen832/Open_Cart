package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	//Locators
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement MyAccount;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement Register;
	//Actions
	
	public void clickMyaccount() {
		MyAccount.click();
	}
	public void clickRegister() {
		Register.click();
	}
	
	

}
