package Day3_inheritance;

import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	
	FirefoxDriver fd;
	
	void launch(String url){
		
		fd = new FirefoxDriver();
		fd.get(url);
		
	}



	void teardown(){
	
		fd.close();
	
}

	
	
	
	
	
	
	
	

}
