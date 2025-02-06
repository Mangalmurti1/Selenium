import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WindowSwitchAssignment90 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  
  /* Task is:
   * Goto to website https://the-internet.herokuapp.com/
   * click on the option 'Multiple Wondows' which will redirect user to new window i.e. Second window (website https://the-internet.herokuapp.com/ is the first window) where we have another redirectable link 
   * i.e. 'Click Here' just click on it which will again redirect you to new window i.e. Third window
   * In third window, we can see 'New Window' text which we need grab and display it in console
   * Now come back to second window where we can see 'Opening a new window' text which we need grab and display it in console 
   */
  driver.get("https://the-internet.herokuapp.com/");
  Thread.sleep(1000);
  driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
  driver.findElement(By.xpath("//a[text()='Click Here']")).click();
  Set<String> windows=driver.getWindowHandles();
  Iterator<String> it=windows.iterator();
   String OriginalWindow=it.next();
    
   String nextFirstWindow=it.next();
   
   driver.switchTo().window(nextFirstWindow);   
  
  
     
   System.out.println("This is the text from SECOND webpage = "+driver.findElement(By.xpath("//div/h3")).getText());
   driver.switchTo().window(OriginalWindow);
   System.out.println("This is the text from THIRD webpage = "+driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
  
	}

} 
