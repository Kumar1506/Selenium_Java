package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linktext {
	
	public static void main(String[] args) {
		
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("http://www.gmail.com");
		
//		link text
//		fd.findElement(By.linkText("Create account")).click();
		
		
//		partial link text
		fd.findElement(By.partialLinkText("account")).click();
		
		
		
	}
	

}
