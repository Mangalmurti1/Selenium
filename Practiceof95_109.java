import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;

public class Practiceof95 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		  driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     WebDriverWait wt= new WebDriverWait(driver,Duration.ofSeconds(3));
WebElement foot= driver.findElement(By.xpath("//body/div[6]"));
System.out.println("Size ofthe links in the footer section= "+foot.findElements(By.tagName("a")).size());
WebElement sec= foot.findElement(By.xpath("//tbody/tr/td[1]/ul"));
List<WebElement> actualLinks= sec.findElements(By.tagName("a"));
System.out.println("Links in first section of footer ="+ sec.findElements(By.tagName("a")).size()); 
//System.out.println("Links in firstsection of footer ="+sec.size());

for(int i=1;i<actualLinks.size();i++)
{
	
	String collectionOfkeys=Keys.chord(Keys.CONTROL,Keys.ENTER);
	actualLinks.get(i).sendKeys(collectionOfkeys);
	//System.out.println(actualLinks.get(i).getText());
  
}

Set<String> windo=driver.getWindowHandles();
Iterator<String> it=windo.iterator();

int count=0;
while(it.hasNext())
{
    driver.switchTo().window(it.next());
   
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(src, new File("D:\\Mahesh\\Neosoft\\multiple"+count+".png"));
   System.out.println("Screenshot taken for window = "+driver.getTitle()+"\n\n");
   System.out.println(driver.getTitle());
   count++;
   
}

	}

}
