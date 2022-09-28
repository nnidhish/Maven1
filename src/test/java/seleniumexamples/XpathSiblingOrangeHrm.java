package seleniumexamples;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class XpathSiblingOrangeHrm {
	@Test


public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
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
driver.manage().window().maximize();
driver.findElement(By.linkText("Admin")).click();

String sw=driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent']//preceding-sibling::li")).getText();
System.out.println(sw);
Thread.sleep(1000);
String cURL= driver.getCurrentUrl();
System.out.println(cURL);
//dr.close();
}
}