import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7After102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/home");
		  driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1. Grab the total rows present in the table 'Web Table Example' with header row.
		List<WebElement>rows=driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println("Total rows of table 'Web Table Example' is = "+rows.size());
		
		//2. Grab the total colums present in the table 'Web Table Example'.
		int Column= driver.findElements(By.cssSelector(".table-display th")).size();
		System.out.println("Total rows of table 'Web Table Example' is = "+Column);
		
		//3.Fetch the second record from the table 'Web Table Example'
	    List<WebElement> secondRow=driver.findElements(By.cssSelector(".table-display tr:nth-child(3)"));
	    for(int i=0;i<secondRow.size();i++)
	    {
	    	System.out.println("Contents of the second row are = "+secondRow.get(i).getText());
	    }
	}

}
