package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
public class Alerts {
	
	
	public static void main(String[] args) {
		
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("https://bookshopofindia.com/booknotfound.asp");
		fd.manage().window().maximize();
		
		fd.findElement(By.name("btnSubmit")).click();
		
         Alert alert = fd.switchTo().alert();
         
        System.out.println(alert.getText());
        
        alert.accept();
        
        fd.switchTo().defaultContent();
         
         
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
