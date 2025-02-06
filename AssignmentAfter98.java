import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentAfter98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement check = driver.findElement(By.id("checkBoxOption2"));
		check.click();
     
		//1.check any checkbox and grab the label of selected checkbox in a variable
		WebElement label=driver.findElement(By.xpath("//label[@for='benz']"));
		String option= label.getText();
		System.out.println("Lebel of the selected checkbox  = "+option+"\n");		
		
		//2. select the option from select dropdown if its matches with value stored in option variable above.
		WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		List<WebElement> allDropdownoptions=s.getOptions();
	    
		
		for(int i=0;i<allDropdownoptions.size();i++)
		{
						
			if(allDropdownoptions.get(i).getText().equals(option))
			{
				allDropdownoptions.get(i).click();				
			    break;
			}
		}
		
		/*3.Store the selected dropdown option in variable i.e. drop and send to alert textbox and click on alert button
         and if alert message has the value of the drop then accept it.
		*/
		String drop= s.getFirstSelectedOption().getText();
		driver.findElement(By.id("name")).sendKeys(drop);
		driver.findElement(By.id("alertbtn")).click();
		String alert=driver.switchTo().alert().getText();
		System.out.println("Grabbed alert message is = "+alert);
		
		if(driver.switchTo().alert().getText().contains(drop))
		{
			driver.switchTo().alert().accept();
		}
		else
		{
		driver.switchTo().alert().dismiss();
		}
		driver.close();
	}

}            /*   OR
Complete the Assignment and post the working code here.

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Assignment {
public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://qaclickacademy.com/practice.php");

        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

        Select s=new Select(dropdown);

        s.selectByVisibleText(opt);

        driver.findElement(By.name("enter-name")).sendKeys(opt);

        driver.findElement(By.id("alertbtn")).click();

     String text=  driver.switchTo().alert().getText();

     if(text.contains(opt))

     {

    System.out.println("Alert message success");

     }

     else

    System.out.println("Something wrong with execution");

}  
     //  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   

       

       



}
             */
