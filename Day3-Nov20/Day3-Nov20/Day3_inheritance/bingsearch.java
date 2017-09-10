package Day3_inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bingsearch extends baseclass{

	
	
	
	
	String bingsearchandextract(String searchoption){
		
		
		fd.findElement(By.id("sb_form_q")).sendKeys(searchoption);
		fd.findElement(By.id("sb_form_go")).click();
		return fd.findElement(By.className("sb_count")).getText();
			
		
	}
	
	

	
	
}
