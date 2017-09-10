package Day4_Interface;

public class interfacedriver {
	
	public static void main(String[] args) {
		
		
		bingsearch bs = new bingsearch();
		bs.lauchApp("http://www.bing.com/");
		System.out.println(bs.searchandextract("selenium"));
		System.out.println(bs.gettitle());
		bs.teardown();
		
		
		
		
		searchinterface ys = new yahoosearch();
		ys.lauchApp("https://search.yahoo.com/");
		System.out.println(ys.searchandextract("selenium"));
		ys.teardown();
		
		
		
		
	}	
	

}
