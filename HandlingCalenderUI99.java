import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCalenderUI99 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String year="2027";
		String month="6";
		String day="15";
		
		String [] actual= {month,day,year};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		
		
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
		
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
		
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		
		driver.findElements(By.cssSelector("button.react-calendar__tile")).get(Integer.parseInt(month)-1).click();
		
		driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
		
		List<WebElement> date=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		
		for(int i=0;i<date.size();i++)
		{
		// System.out.println(date.get(i).getDomAttribute("value"));
		 Assert.assertEquals(date.get(i).getDomAttribute("value"), actual[i]);
		 
		}	
	
	}
		

	}



	
