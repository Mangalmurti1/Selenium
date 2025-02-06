import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_SSL_Certificate105 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
	 /*
	    Here we are managing the BROWSER BEHAVIOUR
	     i.    If you want to open the unsecured websites i.e. not suported by https
	     ii.   If yu want to add any extension to your invoked browser.(Usually we dont see any extensions or plugin while we invoke the broswer)
	  *  iii. 
	  * 
	  */
		
		ChromeOptions op= new ChromeOptions();
	  //FirefoxOptions fo=new FirefoxOptions();
	  op.setAcceptInsecureCerts(true);
	  
	  WebDriver driver = new ChromeDriver(op);//Here we have passed object of ChromeOptions class to ChromeDriver class to capture the behaviour of chrome browser.
	  driver.manage().window().maximize();
	  
	  
	  op.addExtensions(new File("C:\\Users\\User\\Downloads\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx"));
	  driver.get("https://expired.badssl.com/");
	  System.out.println(driver.getTitle());
//	  Thread.sleep(3000);
//      driver.get("https://1-thing.in/#/timesheet");
	}

}
