package Day6;

public class Arrayss {

	public static void main(String[] args) {
		
		String x = "your order number is 49";
		
		String[] ar = x.split(" ");
		
		System.out.println(ar[4]);
		
		String s = x.split("number")[1].trim().split(" ")[1];
//		Second way
//		String[] split = x.split("number");
//		String s2 = split[1].trim();
//		String o2 = s2.split(" ")[1];
		
		
		System.out.println(s);
		
		
		String[] ar2 = x.split("is");
		System.out.println(ar2[1].trim());
		
		
//		list
//		ls.get(0)
////		ar
//		
//		ar[0]
//		
		
		
	}
	
	
}
