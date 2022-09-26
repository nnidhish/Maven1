package seleniumexamples;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
public class HrmForgotPassword  {
	
	
	 
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
		
		String inii=driver.getTitle();
		
		driver.findElement(By.xpath("//body//div//form[@class='oxd-form']//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);

		String sm=driver.getTitle();
		
		
		Assert.assertEquals(inii,sm,"OrangeHRM");
		SoftAssert softAssert=new SoftAssert();
		System.out.print("After Assertion");
		

		
		
		
	}}