package Day3;

public class Calcdriver {

	
	public static void main(String[] args) {
//		Ram code
		simpleCalc simpleCalc = new simpleCalc();
		
		System.out.println("Add result is " + simpleCalc.add(3, 5));
		System.out.println("multiplication resulkt is " + simpleCalc.multiply(4, 5));
		System.out.println("Conversion result is " + simpleCalc.ktog(5));
		
		
		
//		Shyam code
		Scientificcalc scientificcalc = new Scientificcalc();
		System.out.println("Add result is " + scientificcalc.add(3, 5));
//		System.out.println("Add result is " + scientificcalc.add(3, 5,6));
		System.out.println("multiplication resulkt is " + scientificcalc.multiply(4, 5));
		System.out.println("power result is " + scientificcalc.mathpow(4, 2));
		
		
	}
}








