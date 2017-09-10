package Day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hashsets {
	
public static void main(String[] args) {
		
		 Set<String> al = new HashSet<String>();
	
		al.add("mango");
		al.add("apple");
		al.add("orange");
		al.add("pineapple");
		al.add("grapes");
		al.add("apple");
		al.add("grapes");
		
		int size = al.size();
		System.out.println(size);
		
		System.out.println(al.contains("grapes"));
////		for loop
//		for(int i = 0;i<al.size();i++){
//			
//			System.out.println(al.);
//		}
//		System.out.println("---------------");
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
