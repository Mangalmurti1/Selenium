import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class EleEnableDisable63 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		//driver.findElement(By.id("hrefDecAdt")).click();
		 //Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"4 Adult");
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.findElement(By.xpath("//a[@value='BLR']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']")).click();
		 System.out.println("Before selecting the radio button i.e. Round Trip = "+driver.findElement(By.id("Div1")).getDomAttribute("Style"));		
	     driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	     System.out.println("After selecting the radio button i.e. Round Trip = "+driver.findElement(By.id("Div1")).getDomAttribute("Style"));
	     if(driver.findElement(By.id("Div1")).getDomAttribute("Style").contains("1"))
	     {
	    	 
	    	System.out.println("Return Date is enabled");
	    	Assert.assertTrue(true);
	     }
	     else
	     {
	    	 Assert.assertFalse(false);
	     }
	}


}
