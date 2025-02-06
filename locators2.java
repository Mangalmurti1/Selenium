import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="Mahesh";
      WebDriver driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/locatorspractice/");
      driver.manage().window().maximize();
      driver.findElement(By.id("inputUsername")).sendKeys(name);
  	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//label[@for='chkboxOne']")).click();
      driver.findElement(By.cssSelector("button.submit")).click();
      System.out.println("We have successfully land on the page = "+driver.getCurrentUrl());
      Thread.sleep(2000);
      System.out.println("Below is the text from page where we land successfully = \n"+driver.findElement(By.tagName("p")).getText());
      Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
      System.out.println( driver.findElement(By.cssSelector("h2")).getText());
      Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Hello "+ name+",");
      driver.findElement(By.xpath("//button[text()='Log Out']")).click();
      driver.close();
      
	}

}
