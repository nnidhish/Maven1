package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumber1 {
			
	private static WebDriver driver = null;

		
		@Given("browser is open and application is in login page")
		public void browser_is_open_and_application_is_in_login_page() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
		}

		@When("user enters user name and password")
		public void user_enters_user_name_and_password() {
			
		    // Write code here that turns the phrase above into concrete actions
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();

		}

		@Then("home page is displayed")
		public void home_page_is_displayed( ) {
		    // Write code here that turns the phrase above into concrete actions
		   String act,exp;
		   exp="PIM";
		   act=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText();
		 
		 
			SoftAssert s=new SoftAssert();
			s.assertEquals(act, exp);		  
		    
		}
		@Then("user is logged out")
		public void user_is_logged_out() {
			driver.findElement(By.xpath("//li//p[@class='oxd-userdropdown-name']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			String act,exp;
			
			   exp="OrangeHRM";
			   act=driver.getTitle();
			 
			 
				SoftAssert s=new SoftAssert();
				s.assertEquals(act, exp);
				
		}
	

}
