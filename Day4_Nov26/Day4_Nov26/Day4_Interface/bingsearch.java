package Day4_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bingsearch implements searchinterface{
	FirefoxDriver fd;
	public void lauchApp(String url) {
		// TODO Auto-generated method stub
		fd = new FirefoxDriver();
		fd.get(url);
	}

	public String searchandextract(String searchopt) {
		// TODO Auto-generated method stub
		fd.findElement(By.id("sb_form_q")).sendKeys(searchopt);
		fd.findElement(By.id("sb_form_go")).click();
		return fd.findElement(By.className("sb_count")).getText();
	}

	public void teardown() {
		// TODO Auto-generated method stub
		fd.close();
	}

	
	public String gettitle(){
		return fd.getTitle();
		
	}


}










