package MaheshSelenium.Tests1;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import MaheshSelenium.TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import maheshSelenium.pageobjects.cartPage;
import maheshSelenium.pageobjects.CheckoutPage;
import maheshSelenium.pageobjects.Landingpage;
import maheshSelenium.pageobjects.Productcatalogue;

import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class EndToEndFlow extends BaseTest 
{

	@Test
	public void SubmitOrder() throws IOException, InterruptedException
	{
		String item = "IPHONE 13 PRO";
		SoftAssert sa= new SoftAssert();
		//WebDriver driver;
		Landingpage lp= launchApplication();
		Productcatalogue pc=lp.Login("onkarsapkal123@gmail.com","Onkarsapkal@123");
		
		List<WebElement> products=pc.getProducts();
		pc.addProductToCart(item);
		cartPage ck= pc.verifyItemPresentInCart(item);
		CheckoutPage cf=	ck.checkout();
		//Confirmation cf= new Confirmation(driver);
		cf.personalInfo();
		cf.shippingInfo("Ind","India");
		String finalConfirmationMessage = cf.placeOrder();
		sa.assertTrue(finalConfirmationMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		//driver.quit();
	    	
	}
}
