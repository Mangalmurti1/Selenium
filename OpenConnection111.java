import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class OpenConnection111 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			//String url=driver.findElement(By.cssSelector("a[href*='broken']")).getDomAttribute("href");
			
			List<WebElement>AllLinks=driver.findElements(By.xpath("//li/a"));
			SoftAssert a= new SoftAssert();
			
			for(WebElement ele:AllLinks)
			{
				
				
				String link=ele.getDomAttribute("href");
				//System.out.println(link);
			    HttpURLConnection conn= (HttpURLConnection) new URL(link).openConnection();	
				conn.setRequestMethod("HEAD");
				conn.connect();
				int code=conn.getResponseCode();
				System.out.println(code);
				a.assertTrue(code<400,"Test failed due to"+ele.getText());
				
							
			}
			
			a.assertAll();
			
		
	}

}
