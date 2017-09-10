package Day6;

public class dbdriver {
	
public static void main(String[] args) throws ClassNotFoundException, Exception {
	
	dbdynamic db = new dbdynamic();
	int getcount = db.getcount("Ravi", 5);
	System.out.println(getcount);
}
	
}
