package Day7;

public class Encapsul {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	private String Agestatus(){
		
		String status;
		if(age>18){
			status="Major";
		}else{
			status="Minor";
		}
		
		return status;
		
	}
	
	
   public String Agestat(){
	   return Agestatus_new();
	   
   }
	
	
	
	private String Agestatus_new(){
		
		String status;
		if(age>20){
			status="Major";
		}else{
			status="Minor";
		}
		
		return status;
		
	}
	
	
	
	

}
