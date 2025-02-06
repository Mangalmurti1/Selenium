package MaheshSelenium.Tests1;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import MaheshSelenium.TestComponents.BaseTest;
import maheshSelenium.pageobjects.CheckoutPage;
import maheshSelenium.pageobjects.OrderPage;
import maheshSelenium.pageobjects.Productcatalogue;
import maheshSelenium.pageobjects.cartPage;
public class SubmitOrderTest extends BaseTest {
	String item = "IPHONE 13 PRO";
	@Test
	public void submitOrder() throws IOException, InterruptedException
	{
				
		Productcatalogue pc=lp.Login("onkarsapkal123@gmail.com","Onkarsapkal@123");
		
		List<WebElement> products=pc.getProducts();
		pc.addProductToCart(item);
		
		cartPage cp = pc.goToCartPage();
		boolean value= cp.verifyItemPresentInCart(item);
		Assert.assertTrue(value);
		
		CheckoutPage checkoutPage= cp.checkout();
		checkoutPage.shippingInfo("ind", "India");		
	}
	 
	@Test (dependsOnMethods= {"submitOrder"})
	public void OrderHistoryTest()
	{
		Productcatalogue pc=lp.Login("onkarsapkal123@gmail.com","Onkarsapkal@123");
		OrderPage op=pc.goToOrderPage();
		op.findOrder(item);
	
	}
}
