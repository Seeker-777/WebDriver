
import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver","/home/shashikumartecn/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		List col = (List) driver.findElement(By.xpath("//*[@id='customers']/tbody/tr/th"));
		
		System.out.println("total Columns:"+ col.size());
		
		List rows = (List) driver.findElement(By.xpath("//*[@id='customers']/tbody/tr"));
		
		System.out.println("total Columns:"+ rows.size());	
				
//Element which needs to drag.   
        
        WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));    
     
         //Element on which need to drop.    
        
         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
         
       //Using Action class for drag and drop.        
         Actions act =new Actions(driver);        
        
         act.dragAndDrop(From, To).build().perform();
		WebElement cellIneed = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[5]/td[2]"));
        
        System.out.println("Required Value : " + cellIneed.getText());
		
		
	}

}
