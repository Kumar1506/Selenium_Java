package Day4_inheritance_interface;

import org.openqa.selenium.firefox.FirefoxDriver;

public class intermediateclass implements searchinterface {
	FirefoxDriver fd;
	
	public void lauchApp(String url) {
		// TODO Auto-generated method stub
		fd = new FirefoxDriver();
		fd.get(url);
	}

	public String searchandextract(String searchopt) {
		// TODO Auto-generated method stub
		return null;
	}

	public void teardown() {
		// TODO Auto-generated method stub
		fd.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
