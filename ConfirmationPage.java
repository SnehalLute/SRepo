package rahulshettyacademy1.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.abstractcomponent.AbstractComponent;

public class ConfirmationPage extends AbstractComponent {
	WebDriver driver;
	
	public ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 
	@FindBy (css = ".hero-primary")
	WebElement confirmMessage;
	
	public String getConfirmationMessgae()
	{
		return confirmMessage.getText();
	}
	
	public OrderPage goToOrderPage() {
		// Click on the "Go to Order Page" button
			
			orderLink.click();
			return new OrderPage(driver);
		
	}
	
	}

