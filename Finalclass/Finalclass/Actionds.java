package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionds {
	
	
	public static void main(String[] args) {
		
		  FirefoxDriver fd = new FirefoxDriver();
		  fd.get("https://www.burbank.com.au/victoria");
		  fd.manage().window().maximize();
		  
		  Actions act = new Actions(fd);
		  
		  act.moveToElement(fd.findElement(By.id("p_lt_ctl01_Submenunav_lblaboutburbank"))).perform();
		  act.moveToElement(fd.findElement(By.xpath("//li[@id='p_lt_ctl01_Submenunav_about_awards']/a/span[1]"))).click().build().perform();
		
		
		
		
		
	}

}
