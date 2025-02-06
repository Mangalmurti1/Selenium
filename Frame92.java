import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://jqueryui.com/droppable/");
		  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); //switch from webpage inside to the frame
		  System.out.println(driver.findElement(By.id("draggable")).getText());
		  WebElement source=driver.findElement(By.id("draggable"));
		  WebElement target=driver.findElement(By.id("droppable"));	  
		  Actions a= new Actions(driver);
		  a.dragAndDrop(source, target).build().perform();
		  driver.switchTo().defaultContent();//switch from frame to web page window
		  driver.findElement(By.linkText("Draggable")).click();
		  
		  
		  
	}

}
