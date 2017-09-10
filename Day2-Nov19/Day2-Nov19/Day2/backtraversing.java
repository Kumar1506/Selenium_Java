package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class backtraversing {
	
	
	public static void main(String[] args) {
		
//		
//		String string = "324";
//		Launch app
		  FirefoxDriver fd = new FirefoxDriver();
		  fd.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		enter amount
//		 
//		  fd.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/span/div/div[2]/div[1]/div[3]/input")).sendKeys("10000");
		  
//		  backward traversing
//		fd.findElement(By.xpath("//input[@name='interest']/../../../div[1]/div[3]/input")).sendKeys("10000");
//		forward traversing
		  fd.findElement(By.xpath("//input[@name='interest']/../../../div[1]//input")).sendKeys("10000");
		  
		  
//		Enter rate of intr=erest
		  fd.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/span/div/div[2]/div[2]/div[3]/input")).sendKeys("10");
		
//		enter tenure
		  fd.findElement(By.id("three")).sendKeys("120");
		
//		Click on calcuate
		  fd.findElement(By.name("B1")).click();  
		  
		
//		extract EMI
		  String output = fd.findElement(By.id("four")).getAttribute("value");
		  
		System.out.println(output);
//		cloase app
		
		fd.close();
		
		
		
		
	}
	
	

}
