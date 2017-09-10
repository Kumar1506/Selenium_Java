package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frames {
	
	public static void main(String[] args) {
		
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("http://propertiesindia.com/");
		fd.manage().window().maximize();
		
		WebElement frm = fd.findElement(By.xpath("//iframe[@src='search/about.php']"));
		
		fd.switchTo().frame(frm);
		
		fd.findElement(By.xpath("//input[@id='bar_category' and @value='R']")).click();
		System.out.println(fd.findElement(By.xpath("//input[@id='bar_category' and @value='R']")).isSelected());
		
		fd.switchTo().defaultContent();
		
		
		
	}

}
