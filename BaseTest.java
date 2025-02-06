package MaheshSelenium.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import maheshSelenium.pageobjects.Landingpage;

public class BaseTest {

	public WebDriver driver;
	public Landingpage lp;
	public WebDriver initializeDriver() throws IOException
	{
				
		Properties prop= new Properties();
		FileInputStream fs= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\main\\java\\maheshSelenium\\resources\\GlobalData.properties");
		prop.load(fs);
		String browsername= prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver= new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver= new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	    return driver;	
	}
	
	@BeforeMethod
	public Landingpage launchApplication() throws IOException
	{
		driver= initializeDriver();
	    lp= new Landingpage(driver);
        lp.Goto();
        return lp;
  
	}
	@AfterMethod
	public void browserClose()
	{
		driver.close();
		}
	
	
	
}
