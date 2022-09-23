package seleniumexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "C:\\nidhish\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
				driver.get("https://www.google.com/");
			
			driver.close();
	}

}
