import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AutoPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      System.out.println("Here we have used parent to child & sibling traverse = "+ driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());      
	  System.out.println("\n Below we have used to travse from parent to child and vise versa = "+driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]/parent::div/button[2]")).getText());	
	}

}
