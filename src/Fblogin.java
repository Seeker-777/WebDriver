import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/shashikumartecn/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		
		WebElement username = driver.findElement(By.xpath("//*[@type='text' and @name='email' and @id='email']"));
		
		username.sendKeys("abc@xyz.com");
		
		WebElement editPwd = driver.findElement(By.xpath("//*[@type='password' and @name='pass' and @id='pass']"));
		
		editPwd.sendKeys("124");
		
		WebElement btn = driver.findElement(By.xpath("//button[@name='login' and @type='submit']"));
		
		btn.click();
		

		

	}

}
