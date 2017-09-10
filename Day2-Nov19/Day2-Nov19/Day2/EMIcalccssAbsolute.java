package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EMIcalccssAbsolute {
	
	
	public static void main(String[] args) {
		
//		
//		String string = "324";
//		Launch app
		  FirefoxDriver fd = new FirefoxDriver();
		  fd.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		enter amount
		  fd.findElement(By.cssSelector("html>body form#aspnetForm div#wrapper div#body_content div.right span#PgGeneral1_A_Cont_lblContent div.dynamicPg div.frmbody div.drow div.pdDiv3 input#one")).sendKeys("10000");
		
//		Enter rate of intr=erest
		  fd.findElement(By.id("two")).sendKeys("10");
		
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
