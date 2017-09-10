package Day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class closeandquit {
	
	
	public static void main(String[] args) throws InterruptedException  {
		

		FirefoxDriver fd = new FirefoxDriver();
		fd.get("http://in.rediff.com/");
		
		Thread.sleep(5000);
		
		
		fd.close();
		
//		fd.quit();
		
		
		
		
		
		
	}

}
