package Day4_Abstractclass;

import Day4_inheritance_interface.bingsearch;
import Day4_inheritance_interface.searchinterface;
import Day4_inheritance_interface.yahoosearch;

public class driver {
	
public static void main(String[] args) {
	

	yahoosearch ys = new yahoosearch();
	ys.lauchApp("https://search.yahoo.com/");
	System.out.println(ys.searchandextract("selenium"));
	ys.teardown();
	
	
	bingsearch bs = new bingsearch();
	bs.lauchApp("http://www.bing.com/");
	System.out.println(bs.searchandextract("selenium"));
	bs.teardown();
	
}
	
	
	

}
