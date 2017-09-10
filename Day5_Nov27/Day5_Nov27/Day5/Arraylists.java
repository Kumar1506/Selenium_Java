package Day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylists {
	
	
	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
	
		al.add("mango");
		al.add("apple");
		al.add("orange");
		al.add("pineapple");
		al.add("grapes");
		al.add("apple");
		
		
		al.remove("pineapple");
		
//		for loop
		for(int i = 0;i<al.size();i++){
			
			System.out.println(al.get(i));
		}
		System.out.println("---------------");
//		for each
		for(String xyz: al){
			System.out.println(xyz);
			
		}
		
		System.out.println("--------------------");
//		iterator
		Iterator<String> it = al.iterator();
		
		while(it.hasNext()){
			
			
			String next = it.next();
			
			System.out.println(next);
			
			}
		
		
		
		
		
	}
}






