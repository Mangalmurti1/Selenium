import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_8_Auto_DropdownAfter102 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com/home");
		
		  driver.manage().window().maximize();
		  String country="Uni";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys(country);
		Thread.sleep(2000);
		
		//List<WebElement> coll=driver.findElements(By.cssSelector("div[class='ui-menu-item-wrapper']"));
		List<WebElement> coll=driver.findElements(By.cssSelector(".ui-menu-item"));
		//System.out.println( coll.get(0).getText());
		for(int i=0;i<coll.size();i++)
	{
//		System.out.println(coll.get(i).getText());
//			Thread.sleep(2000);
		if (coll.get(i).getText().contains("United States"))
		{
			coll.get(i).click();
			}
		}
		//System.out.println("Country successfully selected");
	}

}
