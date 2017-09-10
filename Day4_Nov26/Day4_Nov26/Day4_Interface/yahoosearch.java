package Day4_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoosearch implements searchinterface{


	FirefoxDriver fd;
	
	public void lauchApp(String url) {
		// TODO Auto-generated method stub
		fd = new FirefoxDriver();
		fd.get(url);
	}

	public String searchandextract(String searchopt) {
		// TODO Auto-generated method stub
		fd.findElement(By.tagName("input")).sendKeys(searchopt);		
		fd.findElement(By.cssSelector("button.sbb")).click();
		
//		String output = fd.findElement(By.xpath("//div[@class='compPagination']/span")).getText();
		
//		2nd way
		String output = fd.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		return output;
	}

	public void teardown() {
		// TODO Auto-generated method stub
		fd.close();
	}

	
	public int add(int a,int b){
		return a+b;
	}
}









