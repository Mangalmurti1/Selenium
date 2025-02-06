import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updatedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");		
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println("Adult count before selection = "+driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
	        i++;
		}
		System.out.println("Adult count after selection = "+driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		//driver.close();
	}
	
}
