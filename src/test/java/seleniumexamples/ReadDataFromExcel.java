package seleniumexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Prepare the path of excel file
		String filePath="//C://Users//karkenni//Downloads";
		String fileName="cred.xlsx";
		String sheetName="Sheet1";

	    File file = new File(filePath+"\\"+fileName);

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook workBook = null;

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    if(fileExtensionName.equals(".xlsx")){

	    	workBook = new XSSFWorkbook(inputStream);

	    }
	    else if(fileExtensionName.equals(".xls")){

	    	workBook = new XSSFWorkbook(inputStream);

	    }
	    
	    Sheet sheet = workBook.getSheet(sheetName);
	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    System.out.println("Row count " +rowCount);
	    Row row = sheet.getRow(0);
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(row.getCell(0).getStringCellValue());
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(row.getCell(1).getStringCellValue());
	    driver.findElement(By.xpath("//button[@value='1']")).click();
	    
	}	
}