package demo;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		WebElement singleIframe = driver.findElement(By.cssSelector("[src=\"SingleFrame.html\"]"));
		
		driver.switchTo().frame(singleIframe);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ADNAN");
		
		Thread.sleep(2000);
		
		// **Nested Frame Handling**
		
		 driver.switchTo().defaultContent();
		 

		driver.findElement(By.cssSelector("[href='#Multiple']")).click();
		
		Thread.sleep(2000);
		
		// Switch to parent iframe
		
	WebElement parentIframe = driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']"));
	driver.switchTo().frame(parentIframe);	
	
	
	     // Switch to inner iframe
		WebElement innerIframe = driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']"));
		driver.switchTo().frame(innerIframe);
		
		driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("Neasted iframe");
		
		
Thread.sleep(2000);
		
		
		
		 driver.switchTo().defaultContent();
		
		
	}
	
}


