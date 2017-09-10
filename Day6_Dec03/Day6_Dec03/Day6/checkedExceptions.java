package Day6;

public class checkedExceptions {
	
	
	public static void main(String[] args)  {
		int a = 5;
		int x= 0;
		try{
		Thread.sleep(1000);
		}catch(NullPointerException e){
			System.out.println(e.toString());
		}catch(ArithmeticException e){
			System.out.println(e.toString());
		}catch(Exception e){
			System.out.println(e.toString());
		}finally{
			
			System.out.println(" thank you");
		}
//		try{
//		System.out.println(a/x);
//		}catch(Exception e){
//			System.out.println(e.toString());
//		}
		System.out.println(a + x);
		System.out.println(x);
		
		
		
		
	}

}
