package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoosearch {
	FirefoxDriver fd ;
	
	void launch(String url){
		
		fd= new FirefoxDriver();
		fd.get(url);
		
	}
	
	
	String searchandextract(String searchitem){
		
		fd.findElement(By.tagName("input")).sendKeys(searchitem);		
		fd.findElement(By.cssSelector("button.sbb")).click();
		
//		String output = fd.findElement(By.xpath("//div[@class='compPagination']/span")).getText();
		
//		2nd way
		String output = fd.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		return output;
		
	}
	
	
	void teardown(){
		fd.close();
		
	}
	
	

}
