import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class locators3{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
	       WebDriver driver = new FirefoxDriver();
		   //WebDriver driver = new ChromeDriver();
	       //WebDriver driver= new EdgeDriver();
	       String name="Mahesh";
	       driver.get("https://rahulshettyacademy.com/locatorspractice/");
	       driver.manage().window().maximize();
	       driver.findElement(By.linkText("Forgot your password?")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	   	
	   	   locators3 loc=new locators3();
	   	   String pass= loc.getpwd(driver);
	   	   driver.findElement(By.id("inputUsername")).sendKeys(name);
	  	   driver.findElement(By.name("inputPassword")).sendKeys(pass);
	       Thread.sleep(2000);
	  	   driver.findElement(By.xpath("//label[@for='chkboxOne']")).click();
	  	   
	       driver.findElement(By.cssSelector("button.submit")).click();
	       Thread.sleep(2000);
	       Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	       driver.findElement(By.cssSelector(".logout-btn")).click();
	       System.out.println("You are successfully logged in to the system");
	       
	       driver.close();
		}
	   public String getpwd(WebDriver driver)
	   {
		   String passtext= driver.findElement(By.cssSelector("form p")).getText();
		   driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		   System.out.println("Gabbed text from web page is="+passtext);
		   String split[]=passtext.split("'");
		   System.out.println("Value of the first splitted index i.e [0] = "+split[0]);
		   System.out.println("Value of the first splitted index i.e [1] = "+split[1]);
		   String pass=split[1];
		   return pass;
	   }
}


