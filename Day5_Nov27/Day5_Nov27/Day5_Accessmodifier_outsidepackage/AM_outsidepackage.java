package Day5_Accessmodifier_outsidepackage;

import Day5.AccessModifier;

public class AM_outsidepackage {
	
public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();
		
//		accessing variables  class in same package
//		System.out.println(am.pri);
//		System.out.println(am.pro);
//		System.out.println(am.def);
		System.out.println(am.pub);
		
//		accessing methods class in same package
//		am.primethod();
//		am.promethod();
//		am.defmethod();
		am.pubmethod();
		
	}
	
	
	
	
	
	

}
