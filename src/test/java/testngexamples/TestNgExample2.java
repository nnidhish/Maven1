package testngexamples;
//TestNG: Copy all your assignments and put them in @Test in TestNG
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import seleniumexamples.SearchInHrmLogin;

public class TestNgExample2 {
  @Test(priority=0)
  public void testCase1() {
      System.out.println("in test case 1");

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
		driver.close();
}
  @Test(dependsOnMethods={"testCase3"})
  public void testCase2() throws InterruptedException {
      System.out.println("in test case 2");

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
	softAssert.assertEquals(inii, sm);
	driver.close();
  }

  @Test
  public void testCase3() throws InterruptedException {
      System.out.println("in test case 3");

	  System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		SearchInHrmLogin obj=new SearchInHrmLogin();	// class object
		
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
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.xpath("//li//a[@class='oxd-topbar-body-nav-tab-item']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-date-input']//input")).sendKeys("2022-09-22");
		driver.findElement(By.xpath("//textarea")).sendKeys("Not well");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.close();
  }
  @Test
  public void testCase4() throws InterruptedException {
      System.out.println("in test case 4");


		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//li//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		String act,exp;
		
		   exp="OrangeHRM";
		   act=driver.getTitle();
		 
		 
			SoftAssert s=new SoftAssert();
			s.assertEquals(act, exp);
			driver.close();
  }
  @Test
  public void testCase5() throws InterruptedException {
      System.out.println("in test case 5");

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
		driver.findElement(By.linkText("Admin")).click();
		
		search1("Anthony.Nolan",driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click(); //CLICKING ON CLEAR BUTTON
		search1("Charlie.Carter","Charlie Carter",driver);	
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click(); //CLICKING ON CLEAR BUTTON
		
		driver.close();
	}

  
  
  static void search1(String username,WebDriver d) throws InterruptedException {
		
		// WebDriver driver = new ChromeDriver();
		d.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);

	}
  static void search1(String username,String Employeename,WebDriver d) throws InterruptedException {
			
			// WebDriver driver = new ChromeDriver();
			d.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
			d.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Employeename);
			d.findElement(By.xpath("//button[@type='submit']")).click();


		}
  
  }
	

