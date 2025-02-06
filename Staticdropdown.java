import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(2000);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s =new Select(staticdropdown);
		s.selectByIndex(3);
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		s.selectByVisibleText("AED");
		System.out.println(s.getFirstSelectedOption().getText());
		//Here in static dropdown we dont have option to deselects the selected options because we are 
		//selecting the only one option at a time. Deselects could be only possible when we are selecting the multiple options at a time.
		
	}
 
}
