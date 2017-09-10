package Day10;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Interactproperties {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\test.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("uat"));
		
		WebDriver fd = new FirefoxDriver();
		
		fd.get(prop.getProperty(prop.getProperty("env")));
		
		
		
		
		
	}
}









