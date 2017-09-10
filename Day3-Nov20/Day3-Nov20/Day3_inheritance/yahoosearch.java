package Day3_inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoosearch extends baseclass{


	
	String searchandextract(String searchitem){
		
		fd.findElement(By.tagName("input")).sendKeys(searchitem);		
		fd.findElement(By.cssSelector("button.sbb")).click();
		
//		String output = fd.findElement(By.xpath("//div[@class='compPagination']/span")).getText();
		
//		2nd way
		String output = fd.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		return output;
		
	}
	
	

}
