import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SixtyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Tejas");
		driver.findElement(By.name("email")).sendKeys("tejas01@gmail.com");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement stat = driver.findElement(By.id("exampleFormControlSelect1"));
		Select s = new Select(stat);
		s.selectByIndex(0);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("12-12-1999");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		// Assert.assertEquals(,"Success! The Form has been submitted successfully!."));
	}

}
