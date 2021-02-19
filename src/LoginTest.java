import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LoginTest obj = new LoginTest();
	obj.setup();
	obj.login();
	obj.close();
		
		
	}

	
	
	
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","/home/shashikumartecn/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		
	}
	public void login() {
		
		WebElement linklogin = driver.findElement(By.linkText("Log in"));
		
		linklogin.click();
		
		
		WebElement editUsername = driver.findElement(By.name("user_login"));
		
		editUsername.sendKeys("abc@xyz.com");
		
		WebElement editPwd = driver.findElement(By.name("user_pwd"));
		
		editPwd.sendKeys("124");
		
		WebElement chkBox = driver.findElement(By.className("rememberMe"));
		
		chkBox.click();
		
		WebElement btnPwd = driver.findElement(By.name("btn_login"));
		
		btnPwd.sendKeys("abc@xyz.com");
		
		
	}
	public void close() {
	
		driver.quit();
	
}
}
