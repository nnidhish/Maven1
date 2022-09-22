package seleniumexamples;
//Write HRM Login using XPATH for all the fields
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("C://nidhish/WebTable.html");
		
		
		driver.findElement(By.xpath("//table//tbody/tr[5]/td[1]/input")).click();// selects selenium option

	}

}
