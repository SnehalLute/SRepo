package rahulshettyacademy1.pageobject;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage1 {

		WebDriver driver;
		
		public LoginPage1 (WebDriver driver) {
			//Initialization
					super();
					this.driver=driver;
					PageFactory.initElements(driver, this);
					
		}
		
		@FindBy(id= "userEmail")
		WebElement userEmail;
		
		@FindBy(id= "userPassword")
		WebElement userPassword;
		
		@FindBy(id= "login")
		WebElement submit;
		
		public ProductListingPage loginApplication(String email, String password) {
			userEmail.sendKeys(email);
			userPassword.sendKeys(password);
			submit.click();
			ProductListingPage plp=new ProductListingPage(driver);
			return plp;

		}
		public void goToSite() {
			driver.get("https://rahulshettyacademy.com/client");
		}

}
