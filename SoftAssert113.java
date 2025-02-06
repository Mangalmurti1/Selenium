import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SoftAssert113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		SoftAssert ass=new SoftAssert();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String actual=driver.getTitle();
        String expected = "PRactice Page";
        ass.assertEquals(actual, expected,"First Assertion Failed");
        String buttonTextActual= driver.findElement(By.id("confirmbtn")).getDomAttribute("Value");
        String buttonTextExpected= "Confirm";
        ass.assertEquals(buttonTextActual, buttonTextExpected, "Second Assertion Failed");
        ass.assertAll();
	}

}
