package rahulshettyacademy1.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.abstractcomponent.AbstractComponent;

public class CartPage extends AbstractComponent{
	
	WebDriver driver;
	
	@FindBy(css=".totalRow button")
	WebElement checkoutEle;
	
	@FindBy(css=".cartSection h3")
	private List<WebElement> cartProducts;
	
	public CartPage (WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public Boolean VerifyProductDisplay (String ProductName) {
		Boolean match = cartProducts.stream().anyMatch(product -> product.getText()
				.equalsIgnoreCase(ProductName));
		return match;
	}
	public CheckoutPage goToCheckOut() {
		checkoutEle.click();
		CheckoutPage checkout = new CheckoutPage(driver);
		return checkout;
		
	}

}
