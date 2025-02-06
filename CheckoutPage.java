package maheshSelenium.pageobjects;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maheshSelenium.Abstractcomponents.Abstractcomponents;

public class CheckoutPage extends Abstractcomponents{

	WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
		
	@FindBy (css ="input[value='4542 9931 9292 2293']")
	WebElement creditcardnumberTextField;
	
	@FindBy (xpath="//div/select[1]")
	WebElement monthField;
	
	@FindBy (xpath="//div/select[2]")
	WebElement years;
	
	@FindBy (xpath="//div[text()='CVV Code ']/following-sibling::input")
     WebElement cvv;
	
	@FindBy (xpath="//div[text()='Name on Card ']/following-sibling::input")
	WebElement nameoncard;
	
	@FindBy (css="input[name='coupon']")
	WebElement couponinput;
	
	@FindBy (xpath="//button[text()='Apply Coupon']")
	WebElement couponButton; 
	
	@FindBy (css=".mt-1.ng-star-inserted")
	WebElement couponappliedmsg;
	
	@FindBy (css="input[placeholder='Select Country']")
	 WebElement country;
	
	@FindBy (css=".list-group-item")
	List<WebElement> countryList;
	
	@FindBy (css="input[placeholder='Select Country']")
	WebElement entercountryname;
	
	@FindBy (css=".btnn.action__submit.ng-star-inserted")
	WebElement placeOrderButton;
	
	@FindBy (css=".hero-primary")
	WebElement finalMessage;
	
	
	
	By circle= By.cssSelector(".la-ball-scale-multiple");
	By eleTobeClick = By.xpath("//button[text()='Apply Coupon']");
	By couponmsg=By.cssSelector(".mt-1.ng-star-inserted");
	
	By shipCountry= By.cssSelector("input[placeholder='Select Country']");
	By countrylist1= By.cssSelector(".list-group-item");
	
	By message = By.cssSelector(".hero-primary");
	By placeOrderButton1= By.cssSelector(".btnn.action__submit.ng-star-inserted");
	
	public void personalInfo()
	{
		creditcardnumberTextField.clear();
		creditcardnumberTextField.sendKeys("1234 4321 5678 8765");
		staticDropdown(monthField,11);
		staticDropdown(years,29);
		cvv.sendKeys("343");	
		nameoncard.sendKeys("Mahesh Rajkumar Rokade");
		couponinput.sendKeys("rahulshettyacademy");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,500)");
		
		waitForElementToAppear(eleTobeClick);
		waitForElementToBeClickable(eleTobeClick);
		couponButton.click();
		

	}
	
	public List<WebElement> countryLIST()
	{
		waitForElementToAppear(countrylist1);
		return countryList;
		
	}
	
	public void findCountry(String cname, String ExactCountryname)
	{
		
		
		WebElement contryFound= countryLIST().stream().filter(s->s.getText().equals(ExactCountryname)).findFirst().orElse(null);
	     // countryLIST().stream().anyMatch(s->s.getText().equals(ExactCountryname)).
		  if(contryFound!=null)
		  {
			  contryFound.click();
		  }
		  
		  placeOrder();
	}

	public void shippingInfo(String countryName, String ExactCountryname) throws InterruptedException 
	{		
		personalInfo();
		waitForElementToAppear(couponmsg);
		entercountryname.sendKeys(countryName);
		findCountry(countryName,ExactCountryname);
//		waitForElementToAppear(countrylist1);
//		WebElement found= countryList.stream().filter(s->s.getText().equalsIgnoreCase("India")).findFirst().orElse(null);
//   		if(found!=null)
//		{
//			found.click();
//		}


	}
	
	public void placeOrder()
	{
		//waitForElementToBeClickable(placeOrderButton1);
		placeOrderButton.click();
		waitForElementToAppear(message);
		System.out.println(finalMessage.getText());
		//System.out.println(finalMessage.getText());
		
	}
	
	}

