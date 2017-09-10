package Day5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplewindow {
	
	public static void main(String[] args) {
		
		WebDriver fd = new FirefoxDriver();
		  fd.get("http://in.rediff.com/");
		fd.manage().window().maximize();
		
//		get parent handle
		String parent = fd.getWindowHandle();
		
		Set<String> windowHandles = fd.getWindowHandles();
		
		Iterator<String> it = windowHandles.iterator();
		
		while(it.hasNext()){
			
			String handle = it.next();
			if(!handle.equals(parent)){
				
				fd.switchTo().window(handle);
				System.out.println(fd.getCurrentUrl());
				System.out.println(fd.getTitle());
				fd.close();
				fd.switchTo().window(parent);
				
				
			}
				
			
		}
		
		
		
		
		
		
		
		
	}
	
	
}
