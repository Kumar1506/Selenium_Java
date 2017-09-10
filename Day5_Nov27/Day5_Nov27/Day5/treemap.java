package Day5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class treemap {
	
	
public static void main(String[] args) {
		
		Map<String, String> hm = new TreeMap<String, String>();
		
		hm.put("USA", "Washington");
		hm.put("INDIA","New Delhi");
		hm.put("RUSSIA", "Moscow");
		hm.put("CHINA", "Beijing");
		hm.put("INDIA", "Delhi");
		
		
		Iterator<String> it = hm.keySet().iterator();
		
		while(it.hasNext()){
			
			String next = it.next();
			
			System.out.println("key is " + next + " value is : " + hm.get(next));
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	

}
