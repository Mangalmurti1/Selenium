import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebTableSorting117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		//wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".products")));
		
	    /*
	      TASK 01:
	      Go to above URL click on that first column so that system can arrange the veggies in sorted order
	      Get those veggies in list i.e. original list of veggies
	      Apply sort on original list
	      compare both the list's using assertion.
	     */
//		driver.findElement(By.xpath("//thead/tr/th[1]")).click();		
//		List<WebElement>original= driver.findElements(By.xpath("//tbody/tr/td[1]"));	
//		List<String> just =original.stream().map(s->s.getText()).collect(Collectors.toList());		
//		List<String>second= just.stream().sorted().collect(Collectors.toList());
//		Assert.assertEquals(just,second);
		
		/*
		  TASK 02:
		  Fetch the price of given vegetable i.e. Almond (Hint:Almond is present in the first page of list of veggies so, you will get it at first instance )
		  We already have list of webElement i.e. original 
		  - so, convert it into stream  i.e. original.stream()
		  - apply filter which will traverse each element in a stream and get the text i.e. name of veggies i.e. filter(s->s.getText())
		  - Once it got the text then we check whether it contains our expected vegetable using .contains() ie.e filter(s->getText().contains("Almond"))
		  - Once system successfully fetch expected veggies i.e Almond then we should map that name by finding new webelement i.e.
		    map(s->s.findElement(By.xpath("")).getText())
		  - Once system successfully fetched the price of the Almond then , we store price in new collection i.e.
		    .collect(Collectors.toList()) 
		  - Finally above whole result will be captured in a one List i.e. List<String> price. 
		 */
//		List<String> price;
//		String veg="Cherry";
//		int clickCount=1;
//		do {
//			//driver.findElement(By.xpath("//thead/tr/th[1]")).click();
//			List<WebElement>original1= driver.findElements(By.xpath("//tbody/tr/td[1]"));	
//		price = original1.stream().filter(s -> s.getText().contains(veg))
//			    .map(s ->driver.findElement(By.xpath("//tbody/tr/td[2]")).getText()) // Extract price from the current element
//			    .collect(Collectors.toList());
//		price.forEach(s->System.out.println("Price of the "+veg+" is = "+s));
//
//		/*
//		 TASK 03:
//		 Fetch the price of the Rice (Hint: Rice is not present in the first page so, code it accordingly)
//		 */
//		
//		if(price.size()<1)
//		{
//			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
//			clickCount++;
//		}
//		}
//		while(price.size()<1);
//		System.out.println("Size of the price is = "+price.size());
//		System.out.println("We are on the "+ clickCount +" page");
//		
		driver.findElement(By.xpath("//thead/tr/th[1]")).click();
		List<WebElement>li=driver.findElements(By.xpath("//tbody/tr/td[1]"));
	   List<String>originalList=li.stream().map(s->s.getText()).collect(Collectors.toList());
	 //  originalList.stream().forEach(s->System.out.println("Original list if String = "+s+"\n"));
	   //Stream<WebElement>sort=
			   List<String>fi=originalList.stream().sorted().collect(Collectors.toList());
			   //	    Stream<String>sort= originalList.stream().sorted();
         // Assert.assertEquals(originalList,fi);
          Assert.assertEquals(originalList,fi);
          List<String>price;
          
         do
         {
         List<WebElement>li2=driver.findElements(By.xpath("//tbody/tr/td[1]")); 
         price= li2.stream().filter(s->s.getText().contains("Wheat")).map(s->s.findElement(By.xpath("following-sibling::td[1]")).getText()).collect(Collectors.toList());          
	     price.stream().forEach(s->System.out.println(s));
	     
	     if(price.size()<1)
	     {
	     driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
	     }
         }while(price.size()<1);
         
	     }
}
