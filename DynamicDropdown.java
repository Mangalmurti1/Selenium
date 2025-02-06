import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");		
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//In below step, we have used indexing in the xpath because with the same xpath selenium found two 
		//element i.e. one from Departure City and one from Arrival city.
	    //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//In the below step we have used parent to child xpath traversing
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']")).click();
	}

}
