import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindow126 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String>window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		
	     String parentWindow=it.next();
	     String childWindow=it.next();
	     
	     driver.get("https://courses.rahulshettyacademy.com/courses");
	     driver.switchTo().window(childWindow);
	     Thread.sleep(5000);
	   //  List<WebElement>courses=
	    	String fetched=	 driver.findElements(By.cssSelector("div[role='heading']")).get(3).getText();
	    	System.out.println(fetched);
	    	driver.switchTo().window(parentWindow);
	    	WebElement scr= driver.findElement(By.cssSelector("input[name='name']"));
	    	scr.sendKeys(fetched);
	    	/*
	    	 *Below code is used to take screenshot of perticular webElement 
	    	 *this new fetaure came from selenium v4
	    	 */
	    	File ele= scr.getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(ele, new File ("Taken.png"));
	    	/*NOTE: Below is screenshot capture method to capture the whole screen's screenshot
	    	 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	 FileUtils.copyFile(src, new File("screenshot.png"));
	    	 */
	    	
	    	/*
	    	 Below code will fetch the height and width of the perticular webelement in pixels.
	    	 */
	    	System.out.println("Height of the Name editbox is = "+scr.getRect().getDimension().getHeight());
	    	System.out.println("Width of the name editbox is = "+ scr.getRect().getDimension().getWidth());
//	    List<String>few= courses.stream().map(s->s.getText()).collect(Collectors.toList());
//	    few.stream().forEach(s->System.out.println(s));
//	    System.out.println(few.size());
	     
	} 

}
