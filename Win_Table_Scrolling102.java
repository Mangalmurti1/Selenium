import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Win_Table_Scrolling102 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/home");
		  driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		List<WebElement> ele=driver.findElements(By.cssSelector(" .tableFixHead td:nth-child(4)"));
		int cal=0;
		
		for(int i=0;i<ele.size();i++)
		{
			
			//System.out.println("Total elements are"+Integer.parseInt(ele.get(i).getText()));
			cal=cal+Integer.parseInt(ele.get(i).getText());
			
		}
		System.out.println(" Total count is="+cal);
	    
//	 String textline= driver.findElement(By.cssSelector(".totalAmount")).getText(); 
//	 String count= textline.split(":")[1].trim();
//	 Integer.parseInt(count);
//	 System.out.println(count);
	 int actual=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	 Assert.assertEquals(actual,cal); 
	}

}

