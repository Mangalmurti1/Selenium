package maheshSelenium.Abstractcomponents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import maheshSelenium.pageobjects.OrderPage;
import maheshSelenium.pageobjects.cartPage;

public class Abstractcomponents {
	WebDriver driver;
	
	public Abstractcomponents(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//nav/ul/li[4]")
	WebElement cart;
	
	@FindBy (xpath="//nav/ul/li[3]")
	WebElement orders;

	public void waitForElementToAppear(By loc)
	{     
	   WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(5));
	   wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(loc));
    }
	
	public void staticDropdown(WebElement months,int ind)
	{
		Select sd= new Select(months);
		sd.selectByIndex(ind);
	}
	public void waitForElementToDisappear(By loc2)
	{
		WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(5));
		wt.until(ExpectedConditions.invisibilityOfElementLocated(loc2));
	}
	
	public void waitForElementToBeClickable(By loc3)
	{
		WebDriverWait wt= new WebDriverWait(driver,Duration.ofSeconds(5));
		wt.until(ExpectedConditions.elementToBeClickable(loc3));
	}
	
	public cartPage goToCartPage()
	{
		cart.click();
		cartPage cp= new cartPage(driver);
		return cp;
	}
	
    public OrderPage goToOrderPage()
    {
    	orders.click();
    	OrderPage op= new OrderPage(driver);
    	return op;
    	
    }
	
}	
