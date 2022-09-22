package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewFacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9050529%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIzra90M2g-gIV0ZNmAh2crwnjEAAYASAAEgIm9vD_BwE");
		/*try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}*/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		
		WebElement ele=driver.findElement(By.name("birthday_day"));//return type of this is of type Web element
		Select s=new Select(ele);
		
		//First name and surname using xpath
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc"); 
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("def");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abcd@gmail.com");

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abc@12345");
		
//birthday
		
		//driver.findElement(By.name("birthday_day"));
		//*[@id="day"]/option[4]
		//driver.findElement(By.xpath("//*[@id=\"day\"]/option[4]")).click(); //or 
		s.selectByVisibleText("4");
		Thread.sleep(1000);
		//driver.findElement(By.name("birthday_month"));
		//*[@id="day"]/option[4]
		//driver.findElement(By.xpath("//*[@id=\"month\"]/option[11]")).click();
		WebElement ele2=driver.findElement(By.name("birthday_month"));
		Select s2=new Select(ele2);
		s2.selectByVisibleText("Nov");

		//driver.findElement(By.name("birthday_year"));
		//driver.findElement(By.xpath("//*[@id=\"year\"]/option[23]")).click();
		WebElement ele3=driver.findElement(By.name("birthday_year"));
		Select s3=new Select(ele3);
		s3.selectByVisibleText("2000");

	
//gender
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
