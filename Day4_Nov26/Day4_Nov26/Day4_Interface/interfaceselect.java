package Day4_Interface;

public class interfaceselect {
	
	public static void main(String[] args) {
		
		
//		searchinterface bs = new bingsearch();
//		bs.lauchApp("http://www.bing.com/");
//		System.out.println(bs.searchandextract("selenium"));
//		bs.teardown();
//		
//		
//		searchinterface ys = new yahoosearch();
//		ys.lauchApp("https://search.yahoo.com/");
//		System.out.println(ys.searchandextract("selenium"));
//		ys.teardown();
//		
		
//		--------------------------------------------------------
		
		searchinterface st;
		String app = "bing";
		
		if(app.equals("yahoo")){
			st = new yahoosearch();
			st.lauchApp("https://search.yahoo.com/");
			
			
		}else{
			st =new bingsearch();
			st.lauchApp("http://www.bing.com/");
			
		}
		
		System.out.println(st.searchandextract("selenium"));
		st.teardown();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
