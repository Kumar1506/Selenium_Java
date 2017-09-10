package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EMIcalccssRelative {
	
	
	public static void main(String[] args) {
		
//		
//		String string = "324";
//		Launch app
		  FirefoxDriver fd = new FirefoxDriver();
		  fd.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		enter amount
		  
//		  fd.findElement(By.cssSelector("input[name='principal']")).sendKeys("10000");
//		OR operation
		  fd.findElement(By.cssSelector("input[name='principal'],input[id='one']")).sendKeys("10000");
		  
		  
//		Enter rate of intr=erest
//		  fd.findElement(By.cssSelector("div[class='frmbody']>div:nth-of-type(2)>div[class='pdDiv3']>input")).sendKeys("10");
		  fd.findElement(By.cssSelector("div[class='frmbody']>div:nth-of-type(2) input")).sendKeys("10");
//		enter tenure
//		  and operation
		  fd.findElement(By.cssSelector("input[name='instalment'][id='three']")).sendKeys("120");
		
		  
//		Click on calcuate
		  fd.findElement(By.name("B1")).click();  
		  
		
//		extract EMI
		  String output = fd.findElement(By.id("four")).getAttribute("value");
		  
		System.out.println(output);
//		cloase app
		
		fd.close();
		
		
		
		
	}
	
	

}
