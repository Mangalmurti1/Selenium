import java.util.Iterator;
import java.util.Set;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkCount94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 1.Find the count of links present in the web page
		System.out.println("Total links present in the webpage are = " + driver.findElements(By.tagName("a")).size());

		/*
		 * 2.Find the count of links present in the footer section of the web page I
		 * want to find the links present in the footer section of above web page used
		 * in get(). so, we have limited the webDriver scope by creating new WebElement
		 * with the help of driver object below
		 */
		WebElement footerLink = driver.findElement(By.id("gf-BIG"));
		System.out.println("Total links present in the footer are = " + footerLink.findElements(By.tagName("a")).size());

		// 3. Find the count of links present in the each section/block of the footer
		// section.
		WebElement columnLink = footerLink.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println("Total links present in the each section/block of the footer are = "
				+ columnLink.findElements(By.tagName("a")).size());

		// 4. Open the each link of any section/block in footer of web page and grab the
		// title of it
		for (int i = 1; i < columnLink.findElements(By.tagName("a")).size(); i++) 
		{
			String everyLinkClick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnLink.findElements(By.tagName("a")).get(i).sendKeys(everyLinkClick);
		} // It opens all the links present in the first block of footer section.

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) 
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}
