package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhnadle {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#");
		driver.manage().window().maximize();
		
		String win = driver.getWindowHandle();
		

		driver.findElement(By.xpath("(//a[@class='button e.g. button_hilite button_pale small_button'])[1]")).click();
		
		
		String tile = driver.findElement(By.cssSelector("[charset=\"UTF-8\"]")).getText();
		
	   System.out.println(tile);
	   
	   Thread.sleep(5000);
	   
	   driver.switchTo().window(win);
		
		
	}

}
