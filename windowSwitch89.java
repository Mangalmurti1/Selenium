import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class windowSwitch89 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//WebDriverWait ww= new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get(("https://rahulshettyacademy.com/loginpagePractise/"));
		Thread.sleep(3000);
//ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='blinkingText'][1]")));
		driver.findElement(By.xpath("//a[@class='blinkingText'][1]")).click();

		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		String username=driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(username);
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(username);

	}
}
