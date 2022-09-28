package seleniumexamples;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class XpathSibling {
	@Test


public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
dr.get("https://www.educba.com/");
dr.manage().window().maximize();
//dr.findElement(By.xpath("//li[@id='mega-menu-item-138330']//following-sibling::li")).click();
String sw=dr.findElement(By.xpath("//li[@id='mega-menu-item-138330']//following-sibling::li")).getText();
//li[@id='mega-menu-item-138328']//preceding-sibling::li
//div[@class='widget-area footer-widgets-4 footer-widget-area']//following-sibling::div
//dr.findElement(By.xpath("//li[@id='mega-menu-item-138328']//preceding-sibling::li//div//form//input[@type='text']")).sendKeys("hello");
System.out.println(sw);
Thread.sleep(1000);
String cURL= dr.getCurrentUrl();
System.out.println(cURL);
//dr.close();
}
}