import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterWebTableUsingStream121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	String name="c";
	String exact="Carrot";
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys(name);
		List<WebElement>veg=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		System.out.println("As per your input i.e."+name+" system displayed total "+veg.size()+" values \n");
		
		
		veg.stream().filter(s->s.getText().contains(exact)).map(s->s.findElement(By.xpath("following-sibling::td[1]")).getText()).forEach(s->System.out.println(exact +" present in the displayed options and its price is "+s));
		//Stream price =veg.stream().filter(s->s.getText().contains(exact)).map(s->s.findElement(By.xpath("//tbody/tr/td[1]/following-sibling::td[1]")).getText());
		
		//System.out.println(price);
	}

}
