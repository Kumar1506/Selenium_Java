package Day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmaps {
	
	
	public static void main(String[] args) {
		
		Map<String, String> hm = new HashMap<String, String>();
		
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
