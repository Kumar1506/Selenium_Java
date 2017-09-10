package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("https://www.carwale.com/");
		fd.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> yeslist = fd.findElements(By.id("btnYes"));
		if(yeslist.size() > 0){
				
			fd.findElement(By.id("btnYes")).click();
		}
//		fd.findElement(By.xpath("//li[.='Used cars']")).click();
		
		fd.findElement(By.xpath("//li[text()='Used cars']")).click();
		List<WebElement> options = fd.findElements(By.xpath("//ul[@id='minPriceList']/li"));
		
//		1 way for loop
//		for(int i =0;i<options.size();i++){
//			
//			System.out.println("text is" + options.get(i).getText());
//			System.out.println("attribute is " +  options.get(i).getAttribute("data-min-price"));
//			
//			
//		}
		
//		2nd way of for loop
		for(WebElement xyz: options){
			System.out.println(xyz);
			System.out.println("the values is " + xyz.getText());
			
			if(xyz.getText().equals("4 Lakh")){
				
				xyz.click();
				break;
				
			}
			 
			
		}
		
		
		
		
	}
	

}
