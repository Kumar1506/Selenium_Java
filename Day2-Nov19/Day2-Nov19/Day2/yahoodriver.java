package Day2;

public class yahoodriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		yahoosearch ys = new yahoosearch();
		ys.launch("https://search.yahoo.com/");
		
		String result = ys.searchandextract("python");
		System.out.println(result);
		
		ys.teardown();
		
		
	}

}
