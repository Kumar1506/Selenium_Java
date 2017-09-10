package Day7;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autodialog {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("http://image.online-convert.com/convert-to-jpg");
		fd.manage().window().maximize();
		
		fd.findElement(By.id("file")).click();
		
		Thread.sleep(8000);
//		  hardcoded file path
//		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\dialogupload_Dec.exe");
		
//		  parameterised path
		String path = "Desert.jpg";
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\dialogupload_Dec_dynamic.exe C:\\Users\\DELL\\Pictures\\" + path);
		
		
		
		
	}
	
}
