package Day3_inheritance;

public class driver {
	
	
	public static void main(String[] args) {
		
		yahoosearch ys = new yahoosearch();
		ys.launch("https://search.yahoo.com/");
		
		System.out.println(ys.searchandextract("selenium"));
		
		ys.teardown();
		
		
//		--------------------------
		
		bingsearch bs = new bingsearch();
		bs.launch("http://www.bing.com/");
		
		System.out.println(bs.bingsearchandextract("selenium"));
		
		bs.teardown();
		
		
	}
	
}
