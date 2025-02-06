import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.time.Duration;
public class RelativeLocators123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//WebDriverWait wt= new WebDriverWait(driver,Duration.ofSeconds(2));
		
		//Used above relative locator
		WebElement above=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println( driver.findElement(with(By.tagName("label")).above(above)).getText());
		
		//Used below relative locator
		WebElement be=driver.findElement(By.cssSelector("label[for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(be)).click();
        
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,0)");
        
        //Used toLeftOf relative locator
        WebElement left=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(left)).click();
		
		//Used toRightOf relative locator
		WebElement righ=driver.findElement(By.id("inlineRadio1"));
		System.out.println( driver.findElement(with(By.tagName("label")).toRightOf(righ)).getText());
	}

}
