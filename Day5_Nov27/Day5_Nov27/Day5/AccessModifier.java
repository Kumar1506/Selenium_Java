package Day5;

public class AccessModifier {
	
	private String pri = "private";
	protected String pro = "protected";
	String def = "default";
	public String pub = "public";
	
	
	
	private void primethod(){
		System.out.println("this mehod is private");
	}
	
	protected void promethod(){
		System.out.println("this mehod is protected");
	}
	void defmethod(){
		System.out.println("this mehod is default");
	}
	public void pubmethod(){
		System.out.println("this mehod is public");
	}
	
//	public static void main(String[] args) {
//		
//		AccessModifier am = new AccessModifier();
//		
////		accessing variables within class
//		System.out.println(am.pri);
//		System.out.println(am.pro);
//		System.out.println(am.def);
//		System.out.println(am.pub);
//		
////		accessing methods within class
//		am.primethod();
//		am.promethod();
//		am.defmethod();
//		am.pubmethod();
//		
//	}
	
	
	
	

}
