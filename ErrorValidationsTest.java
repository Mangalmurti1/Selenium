package MaheshSelenium.Tests1;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import MaheshSelenium.TestComponents.BaseTest;
import maheshSelenium.pageobjects.Productcatalogue;
import maheshSelenium.pageobjects.cartPage;
public class ErrorValidationsTest extends BaseTest {

	@Test
	public void LoginError() throws IOException, InterruptedException
	{
		String item = "IPHONE 13 PRO";		
        lp.Login("onkarsapkal123@gmail.com","Onkarsapkal@12");		
		Assert.assertEquals(lp.getErrorMessage(), "Incorrect email or password.");
				
	}
	
	@Test
	public void AddTocartError() throws IOException, InterruptedException
	{
		String item = "IPHONE 13 PRO";		
		Productcatalogue pc=lp.Login("onkarsapkal123@gmail.com","Onkarsapkal@123");
		List<WebElement> products=pc.getProducts();
		pc.addProductToCart(item);
		cartPage cp = pc.goToCartPage();
		boolean value= cp.verifyItemPresentInCart(item);
		Assert.assertTrue(value);
	}
}

		
