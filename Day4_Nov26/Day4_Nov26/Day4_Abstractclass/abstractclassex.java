package Day4_Abstractclass;

import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class abstractclassex {
FirefoxDriver fd;
	
	public void lauchApp(String url) {
		// TODO Auto-generated method stub
		fd = new FirefoxDriver();
		fd.get(url);
	}
	
	public abstract String searchandextract(String searchopt) ;
	
	
	
	public void teardown() {
		// TODO Auto-generated method stub
		fd.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
