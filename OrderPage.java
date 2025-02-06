package maheshSelenium.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import maheshSelenium.Abstractcomponents.Abstractcomponents;

public class OrderPage extends Abstractcomponents {
	WebDriver driver;
	public OrderPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	@FindBy (css="tbody td:nth-child(3)")
	List<WebElement> listOfOrders;
	By listofOrders1 = By.cssSelector("tbody td:nth-child(3)");
	
	public List<WebElement> OrderList()
	{
		waitForElementToAppear(listofOrders1);
		return listOfOrders;
	}
	
	public WebElement findOrder(String item)
	{
		 WebElement match= listOfOrders.stream().filter(s->s.getText().equals(item)).findFirst().orElse(null);
		 return match;
		 
	}
	   
}
