package maheshSelenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import maheshSelenium.Abstractcomponents.Abstractcomponents;

public class Landingpage extends Abstractcomponents {
	WebDriver driver;
	
	public Landingpage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

   
	@FindBy (id="userEmail")
	WebElement useremail;
	
	@FindBy(id="userPassword")
	WebElement userpassword;
	
	@FindBy(id="login")
	WebElement submit;
	
	@FindBy(css="#toast-container")
	WebElement pop;
	
	@FindBy (css="div[aria-label='Incorrect email or password.']")
	WebElement FailedLogin;
	//By popup=By.xpath("//div[@role='alert']");
	
	public Productcatalogue Login(String uname, String pass)
	{
		useremail.sendKeys(uname);
		userpassword.sendKeys(pass);
		submit.click();
	//	waitForElementToAppear(pop);
		//System.out.println("Pop-up message after logged in = "+pop.getText());
		Productcatalogue pc= new Productcatalogue(driver);
		return pc;
	}
	
	public String getErrorMessage()
	{
		return FailedLogin.getText();
	}
	public void Goto()
	{
		driver.get("https://rahulshettyacademy.com/client");
		
	}

}
