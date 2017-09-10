package Day4_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class crossbrowser {

	public static void main(String[] args) {
		
//		Launch app
//		firefox
//		  FirefoxDriver fd = new FirefoxDriver();
		
//		chrome
//		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
//		ChromeDriver fd = new ChromeDriver();
		
//		IE
//		System.setProperty("webdriver.ie.driver", "E:\\drivers\\IEDriverServer.exe");
//		WebDriver fd = new InternetExplorerDriver();
		
		String btype ="ch";
		WebDriver fd = null;
		
		if(btype.equals("ie")){
			System.setProperty("webdriver.ie.driver", "E:\\drivers\\IEDriverServer.exe");
			fd = new InternetExplorerDriver();
		}else if(btype.equals("ch")){
			System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
			fd = new ChromeDriver();
		}else if(btype.equals("ff")){
			fd = new FirefoxDriver();
		}
		
		
		
		  fd.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		enter amount
		  fd.findElement(By.id("one")).sendKeys("10000");
		
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
