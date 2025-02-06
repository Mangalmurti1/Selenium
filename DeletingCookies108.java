import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeletingCookies108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.manage().deleteCookieNamed("gpv_pn");
		driver.manage().deleteAllCookies();
		Set<Cookie>cook=driver.manage().getCookies();
		
		
//		for(Cookie getCookies:cook)
//		{
//			System.out.println(getCookies);
//		}
		
		//driver.manage().deleteCookieNamed("SN");
		
		//NOTE: Set of cookies converted into array but above we have used Enhanced for loop i.e for each
		
		System.out.println("Before deleting the cookie");
		Cookie[] newarray= cook.toArray(new Cookie[0]);
		
		for(int i=0;i<newarray.length;i++)
		{
			System.out.println("Index is ="+i+" Value is: "+ newarray[i]);			
		}
		
		
//		System.out.println("After deleting the cookie");
//	//	Cookie[] newarray= cook.toArray(new Cookie[0]);
//		for(int i=0;i<newarray.length;i++)
//		{
//			System.out.println("Index is ="+i+" Value is: "+ newarray[i]);			
//		}
//		
		
		//driver.manage().deleteAllCookies();
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.id("password")).sendKeys("learning");
//		driver.findElement(By.xpath("//label[2]//span[2]")).click();
//		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(3));
//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
//		driver.findElement(By.id("okayBtn")).click();
//		WebElement drop=driver.findElement(By.xpath("//form/div/select"));
//		
//		wt.until(ExpectedConditions.visibilityOfAllElements(drop));
//		Select s= new Select(drop);
//		
//		s.selectByIndex(2);
//		driver.findElement(By.id("terms")).click();
//		driver.findElement(By.id("signInBtn")).click();
//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Category 1']")));
//		driver.findElement(By.xpath("//a[text()='Category 1']")).click();
//		
//		driver.manage().deleteAllCookies();
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	}

}
