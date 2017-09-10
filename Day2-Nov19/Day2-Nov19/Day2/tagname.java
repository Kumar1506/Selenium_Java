package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagname {

	public static void main(String[] args) {
		
		
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("https://search.yahoo.com/");
		
		fd.findElement(By.tagName("input")).sendKeys("selenium");
		
		fd.findElement(By.cssSelector("button.sbb")).click();
		
		
		
		
	}
	
	
	
}
