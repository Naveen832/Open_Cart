package TestClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_AccountRegistration extends BaseClass {

	
	 public WebDriver driver;
	@Test
	void Test_Account_Registartion() {
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		hp.clickRegister();
		AccountRegistrationPage AP = new AccountRegistrationPage(driver);
		AP.enterFirstname("RFREFRFRF");
		AP.enterLastname("QWERQWR");
		AP.enterEmail("DFGDFG@gmail.com");
		AP.enterEmail("ASDFGH");
		
		
		
		
	}
	}
