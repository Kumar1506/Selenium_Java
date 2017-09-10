package Day10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		String string = "324";
//		Launch app
		  FirefoxDriver fd = new FirefoxDriver();
		  fd.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		  fd.manage().window().maximize();
//		  immplicit wait
		  fd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
//		enter amount
		  fd.findElement(By.id("one")).sendKeys("10000");
		
//		Enter rate of intr=erest
		  fd.findElement(By.id("two")).sendKeys("10");
		
//		enter tenure
		  fd.findElement(By.id("three")).sendKeys("120");
		
//		Click on calcuate
		  fd.findElement(By.name("B1")).click();  
		  
		
//		  Explicit wait
		  WebDriverWait wait = new WebDriverWait(fd, 60);
		  wait.until(ExpectedConditions.visibilityOf(fd.findElement(By.id("four"))));
		  
		  
//		extract EMI
		  String output = fd.findElement(By.id("four")).getAttribute("value");
		  
		System.out.println(output);
//		cloase app
		
		fd.close();
		
		
		
		
		
		
		
	}

}
