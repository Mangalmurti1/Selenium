
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTocart74 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Problem : Add the below items to the cart. Brocoli,cucumber & Beetroot
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String expectedProduct[]= {"Cucumber","Brocolli","Beetroot","Pumpkin"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		addItems(driver,expectedProduct);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

	}

	public static void addItems(WebDriver driver,String[] expectedProduct)
	{
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int i,j=0;
		for (i = 0; i < products.size(); i++)
		{
			
			String cuttedString[]= products.get(i).getText().split("-");
			String formattedString=cuttedString[0].trim();
			List expectedProductList=Arrays.asList(expectedProduct);
			if (expectedProductList.contains(formattedString)) 
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j == expectedProduct.length)
				{
					break;
				}
			}
		}
	}
}
