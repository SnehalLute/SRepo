package rahulshettyacademy1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.tools.javac.util.List;

import rahulshettyacademy.abstractcomponent.AbstractComponent;

public class OrderPage extends AbstractComponent {
	WebDriver driver;
	
	@FindBy (css = ".cartSection h3")
	private List<WebElement> cartProducts;
	
	
	@FindBy (css = "tr td:nth-child(3)")
	private List<WebElement> productNames;
	
	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 
	public Boolean VerifyOrderDisplay(String productName) {
		Boolean match = productNames.stream().anyMatch(product->product.getText().
				equalsIgnoreCase(productName));
				return match;
	}
}
