import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentAfter82 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
		String Fetchedtext,username,pass;
		
		//PartONE: Fetch the textline from web page which having Uname and pass and and grab it in separate variable so that we can use it further.
		Fetchedtext=driver.findElement(By.cssSelector("p.text-center")).getText();
		String[] actual=Fetchedtext.split("and");
   //     System.out.println(actual[0]);
        username=actual[0].split("is")[1].trim();
        System.out.println("Fetched username is = "+username);
 //       System.out.println(actual[1]);
        pass=actual[1].split("is")[1].trim();
        String finalpass = pass.split("\\)")[0];
        System.out.println("Fetched password is = "+ finalpass);
        
        //PartTWO: Use fetched Uname and Pass 
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(finalpass);
       // 
    //    Thread.sleep(2000);
        driver.findElement(By.xpath("//label[2]//span[2]")).click();
         WebDriverWait wd= new WebDriverWait(driver, Duration.ofSeconds(7));
         wd.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
       // Thread.sleep(5000);
       // driver.switchTo().alert().accept();
        
        WebElement drop=driver.findElement(By.xpath("//select[@class='form-control']"));
	    Select s= new Select(drop);
	    s.selectByIndex(2);
	    driver.findElement(By.id("terms")).click();
	    driver.findElement(By.id("signInBtn")).click();
	    
	    wd.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Add ']")));
	    List<WebElement> allItems=driver.findElements(By.xpath("//button[text()='Add ']"));
	    int i;
	    for(i=0;i<allItems.size();i++)
	    {
	    	allItems.get(i).click();
	    }
	   // wd.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".nav-item.active")));
	   // driver.findElement(By.cssSelector(".nav-item.active"))
	    driver.findElement(By.cssSelector(".nav-item.active")).click();
	}

}