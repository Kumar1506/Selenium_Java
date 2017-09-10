package Day10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	


	public static void main(String[] args) throws Exception {
		
		FirefoxDriver fd = new FirefoxDriver();
		  fd.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		fd.manage().window().maximize();
		
		
		
		TakesScreenshot sc=(TakesScreenshot)fd;
		File screenshotAs = sc.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotAs, new File("E:\\DecFramework\\Screenshot\\snappshot.png"));
		
		
		
		
	}

}
