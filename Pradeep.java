import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Pradeep {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		String from="bagdora";
		String to="Agartala";
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(3));
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[text()='From']")).click();
		
	    wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='From']")));
		
		// cities  .css-1dbjc4n.r-knv0ih.r-1k1q3bj.r-ql8eny.r-1dqxon3
		
		//List<WebElement> cities= driver.findElements(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-ov7bg.r-z2wwpe.r-utggzx.r-atwnbb.r-cfp7ip"));
	    List<WebElement>source=driver.findElements(By.cssSelector(".css-76zvg2.r-cqee49.r-ubezar.r-1kfrs79"));
	   // int count=0;
	    
	    for(int i=1;i<source.size();i++)
	    {
	    	
	    	System.out.println( source.get(i).getText());
	    }
	    
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("D:\\Mahesh\\Neosoft\\screenshot1.png"));
	    
//		for(int s=1;s<source.size();s++)
//		{
//			
//			if(source.get(s).getText().contains(from))
//			{
//				wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.c1ssSelector(".css-76zvg2.r-cqee49.r-ubezar.r-1kfrs79")));
//				source.get(s).click();
//				break;
//			}
//			//count=count+1;
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
//		List<WebElement> dest=driver.findElements(By.cssSelector(".css-76zvg2.r-cqee49.r-ubezar.r-1kfrs79"));
//		wt.until(ExpectedConditions.visibilityOfAllElements(dest));
//		
//	    for(int d=1;d<dest.size();d++)
//	    {
//	    	//wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".css-76zvg2.r-cqee49.r-ubezar.r-1kfrs79")));
//	    	if(dest.get(d).getText().contains(to))
//	    	{
//	    		
//	    		dest.get(d).click();
//	    	}
//	    }
		//System.out.println("Total count is = "+count);
	    
	   // WebElement calender=driver.findElement(By.cssSelector("//div[@data-testid='undefined-calendar-picker']"));
	    
//	    List<WebElement> months=driver.findElements(By.cssSelector(".css-1dbjc4n.r-k8qxaj"));
//	    for(int m=0;m<months.size();m++)
//	    {
//	    System.out.println(months.get(m).getText());
//	    }
	   // driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
	}
}
 