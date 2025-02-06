import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ActionClass87 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.amazon.com/home");
  driver.manage().window().maximize();
  
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  Actions a=new Actions(driver);
// WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
// a.moveToElement(move).contextClick().build().perform(); 
 
 driver.findElement(By.id("twotabsearchtextbox"));
 a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Shoes").build().perform();
 
 //a.moveToElement(sup).click().keyDown(Keys.SHIFT).sendKeys("US polo shoes for men");
 
 
 
 

 //a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("woodland leather sneakers for mens").doubleClick().build().perform();
// driver.findElement(By.id("nav-search-submit-button")).click();
 //Thread.sleep(2000);
 //a.moveToElement(move).contextClick();
	}

}
