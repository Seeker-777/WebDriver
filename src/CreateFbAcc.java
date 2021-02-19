import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFbAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","/home/shashikumartecn/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		WebElement createlnk = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
		
		createlnk.click();	
		
		WebElement firstname = driver.findElement(By.xpath("//input[@type='text' and @name='firstname' ]"));
		
		firstname.sendKeys("Seeker");
		
		WebElement lstname = driver.findElement(By.xpath("//input[@type='text' and @name='lastname' ]"));
		
		lstname.sendKeys("Hunt");
		
		WebElement email_mobile = driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__' ]"));
		
		email_mobile.sendKeys("seeker.sk147@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password' and @name='reg_passwd__' ]"));
		
		pwd.sendKeys("93715@");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month' and @name='birthday_month' ]"));
		
		Select ddmonth = new Select(month);
		
		ddmonth.selectByVisibleText("Mar");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day' and @name='birthday_day' ]"));
				
		Select ddday = new Select(day);
				
		ddday.selectByValue("10");
				
		WebElement year = driver.findElement(By.xpath("//select[@id='year' and @name='birthday_year' ]"));
						
		Select ddyear = new Select(year);
						
		ddyear.selectByValue("1997");
						
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value='2' ]"));
								
		gender.click();
		
		
		WebElement c_email_mobile = driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"reg_email_confirmation__\"]"));
		
		c_email_mobile.sendKeys("seeker.sk147@gmail.com");
		
		
								
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit' ]"));
		
		submit.click();
				
				
				
				
				
				
				
				
				
			
		
		
		


	}

}
