import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // ChromeDriver driver = new ChromeDriver();
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/");
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
    driver.close();
	}

}
