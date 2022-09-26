package seleniumexamples;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://www.jqueryui.com/");
		   driver.manage().window().maximize();
		   //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.findElement(By.linkText("Draggable")).click();
		   driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		   //Thread.sleep(20000);
		   Actions mouse=new Actions(driver);
		   mouse.dragAndDropBy(driver.findElement(By.id("draggable")),100,100).build().perform();
		   Thread.sleep(10000);
mouse.dragAndDropBy(driver.findElement(By.id("draggable")), 200, 150).build().perform();

}

}