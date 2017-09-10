package Day7;

public class EXcelrwdriver {
	
	
	public static void main(String[] args) throws Exception {
		
		
		ExcelRW ex = new ExcelRW("C:\\Users\\DELL\\Desktop\\Ageexp.xlsx");
		
		int rowcount = ex.rowcount("Agesheet");
		
		for(int i = 1;i<=rowcount;i++){
			
			String rv = ex.readcellval("Agesheet", i, 1);
			
			if(Double.parseDouble(rv)>18){
				
				ex.writecell("Agesheet", i, 2, "Major");
			}else{
				ex.writecell("Agesheet", i, 2, "Minor");
				
			}
			
			
			
		}
		
		ex.saveandclose("C:\\Users\\DELL\\Desktop\\Ageexp.xlsx");
		
		
		
	}

}
