package Day6;

public class arithmetic {
	
	
	int div(int a, int b) throws Exception{
		
		int c = 0;
		
		if(b==0){
			
			throw new Exception("oh my god you are dividing by zero");
		}else{
			
			c = a/b;
			
		}
		
		
		return c;
		
		
		
	}

}
