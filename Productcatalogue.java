package maheshSelenium.pageobjects;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maheshSelenium.Abstractcomponents.Abstractcomponents;

public class Productcatalogue extends Abstractcomponents{

	WebDriver driver;
	public Productcatalogue(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(css=".col-sm-10")
	List<WebElement> products; 
	
	
	
	
	By productlist= By.cssSelector(".col-sm-10");
	By addToCart= By.cssSelector(".card-body button:last-of-type");
	By addTocartMessage=By.xpath("//div[@role='alert']");
	
	public List<WebElement> getProducts()
	{
		waitForElementToAppear(productlist);
		return products;
	}
	
	public WebElement getProductByName(String productName)
	{
		WebElement ele= getProducts().stream().filter(s->s.findElement(By.cssSelector("b"))
				.getText().equals(productName)).findFirst().orElse(null);
	    return ele;
	}
	
	public void addProductToCart(String productName)
	{
		WebElement ele =getProductByName(productName);
		ele.findElement(addToCart).click();	
		waitForElementToAppear(addTocartMessage);
		
	}
	

}
