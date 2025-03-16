package demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

    public static void main(String[] args) throws EncryptedDocumentException, IOException {
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the test login page
        driver.get("https://practicetestautomation.com/practice-test-login/");
        
        // Load the Excel file
        FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Assignmnet\\src\\test\\resources\\data1\\DD.xlsx");
        Workbook book = WorkbookFactory.create(file);

        // Read data from Excel file
        String username = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        String password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();

        // Perform login
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        // Close resources
       // book.close();
       // file.close();

        // Optional: Close the browser after execution
      //  driver.quit();
    }
}



