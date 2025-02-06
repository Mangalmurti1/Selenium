import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.id("inputUsername")).sendKeys("Mahesh");
	driver.findElement(By.name("inputPassword")).sendKeys("Mahesh123");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nilesh");
	//driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Nilesh");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("mahesh@gmail.com");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
	driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("mahesh@gmail.com");
	driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("7654321786");
	driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).clear();
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("7654321786");
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	System.out.println( driver.findElement(By.cssSelector("form p")).getText());
	driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
	driver.findElement(By.id("inputUsername")).sendKeys("mahesh");
	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='chkboxOne']")).click();
    driver.findElement(By.cssSelector("button.submit")).click();
    System.out.println("We have successfully land on the page = "+driver.getCurrentUrl());
    }

}
 