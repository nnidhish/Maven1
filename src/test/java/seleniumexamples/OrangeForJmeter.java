package seleniumexamples;
import java.util.concurrent.TimeUnit;

//Write HRM Login using XPATH for all the fields
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OrangeForJmeter  {
	
	
	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Info")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='radio']")).click();

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"ramesh",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"s",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"sae",Keys.ENTER);

//keys is keyboard actions class
		driver.findElement(By.xpath("//form//div[@class='oxd-grid-3 orangehrm-full-width-grid']//input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"ram",Keys.ENTER);
	

		
driver.findElement(By.xpath("//button[@type='submit']")).click();

		
									
	}}
		