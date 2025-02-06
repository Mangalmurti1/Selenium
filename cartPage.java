package maheshSelenium.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maheshSelenium.Abstractcomponents.Abstractcomponents;

public class cartPage extends Abstractcomponents{

	WebDriver driver;
	
	public cartPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy (css=".totalRow button")
	WebElement ckhout;
	@FindBy (css=".cart ul")
	List<WebElement> cartItems;
	
	By chbutton= By.cssSelector(".totalRow button");

	public boolean verifyItemPresentInCart(String productName)
	{
		goToCartPage();
		//List<String> cart= cartItems.stream().map(s->s.findElement(By.cssSelector("h3")).getText()).collect(Collectors.toList());
	 	//cart.stream().forEach(s->System.out.println(s));
	    boolean value =cartItems.stream().anyMatch(s->s.findElement(By.cssSelector("h3")).getText().equals(productName));
	    return value;
	}
	public CheckoutPage  checkout()
	{
		waitForElementToAppear(chbutton);
		waitForElementToBeClickable(chbutton);
		ckhout.click();
		CheckoutPage checkoutPage= new CheckoutPage(driver);
		return checkoutPage;
		
		
	}
}
