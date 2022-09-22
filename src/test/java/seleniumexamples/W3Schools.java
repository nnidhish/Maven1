package seleniumexamples;
//"Centro comercial Moctezuma" -print name of the company using tr and td
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\nidhish\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		String text=driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
		System.out.println(text);
		
	}

}
