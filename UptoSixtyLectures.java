import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class UptoSixtyLectures {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		System.out.println("Current URL of thepage where we were land = "+driver.getCurrentUrl());
		System.out.println("Title of the page is = " +driver.getTitle());
		
		/*PART 01
		 First we have to enter the username and random password to login. Once it got failed then we will get suggested pass
		 by the system and use that for new login attempt.So, that we can login to the system successfully.
	    */
        String p="rutuja",u="Mahesh";
        UptoSixtyLectures upto = new UptoSixtyLectures();
        upto.flow(driver,p,u);
		
        Thread.sleep(2000);
        String Text=driver.findElement(By.xpath("//p[@class='error']")).getText();//xapth
        
        if(Text!=null)
        {
        	System.out.println("You failed to login to the system and here we got the below error message=\n "+Text);
        }
        
        p=upto.GetPassWord(driver);
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        Thread.sleep(2000);
        upto.flow(driver,p,u);
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'successfully')]")).getText(),"You are successfully logged in.");
        driver.findElement(By.cssSelector(".logout-btn")).click();
        
        System.out.println("Congratulations!!!! "+u+" finally you successfully logged in to the system");  
        upto.DropDown(driver);
        
        }
	
  public String GetPassWord(WebDriver driver) throws InterruptedException
  {
	  String password;
	  driver.findElement(By.linkText("Forgot your password?")).click();// LinkText 
      Thread.sleep(2000);
      driver.findElement(By.xpath("//form/div/button[2]")).click();//parent to child 
      //String PassText= driver.findElement(By.xpath("//p[text()=\"Please use temporary password 'rahulshettyacademy' to Login.\"]")).getText();//Locate element by using its whole text
      String PassText= driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();//by using cssselector
      System.out.println("Fetched text is="+PassText);
      String all[]=PassText.split("'");
      password = all[1]; 
      return password;
    	  
  }
  public  void flow(WebDriver driver,String p, String u)
  {
	  driver.findElement(By.id("inputUsername")).sendKeys(u); //id
      driver.findElement(By.name("inputPassword")).sendKeys(p);//name
      driver.findElement(By.cssSelector("input#chkboxOne")).click();//cssselector Using ID attribute
      driver.findElement(By.cssSelector("button.signInBtn")).click();// cssselector  using class attribute 
	  
  }
  public void DropDown(WebDriver driver) throws InterruptedException
  {
	 driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
	 WebElement drop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	 Select s= new Select(drop);
	 s.selectByIndex(2);
	 s.selectByContainsVisibleText("USD");
	 driver.findElement(By.id("divpaxinfo")).click();
	 int i=1;
	 while(i<=4)
	 {
	 driver.findElement(By.id("hrefIncAdt")).click();
	 i++;
	 }
	 driver.findElement(By.id("hrefDecAdt")).click();
	 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"4 Adult");
	 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	 driver.findElement(By.xpath("//a[@value='BLR']")).click();
	 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']")).click();
	 driver.findElement(By.id("autosuggest")).sendKeys("Br");
     List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
     
     for(WebElement sel:options)
     {
    	if(sel.getText().equalsIgnoreCase("Gibraltar"))
    	{
    		sel.click();
    		break;
    	}
     }
	 
     System.out.println("Before checking the checkbox = "+driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
     driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
     System.out.println("After checking the checkbox = "+driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
     Thread.sleep(2000);
     //driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).clear();
     driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();//here i have unchecked the already selected checkbox
     System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());	  
     
     
  
  }
  
}

