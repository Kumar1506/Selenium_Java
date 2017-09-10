package Day4_inheritance_interface;

public class driver {
	
	
	public static void main(String[] args) {
		
		yahoosearch ys = new yahoosearch();
		ys.lauchApp("https://search.yahoo.com/");
		System.out.println(ys.searchandextract("selenium"));
		ys.teardown();
		
		
		searchinterface bs = new bingsearch();
		bs.lauchApp("http://www.bing.com/");
		System.out.println(bs.searchandextract("selenium"));
		bs.teardown();
		
		
	}
	

}
