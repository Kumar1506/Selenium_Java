package Day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Day7.ExcelRW;


public class dataprovider {
	
	@Test(dataProvider="test")
	public void sum(Map mp){
		
		String a= mp.get("num1").toString();
		String b=mp.get("num2").toString();
		
		String exp_res= mp.get("Exp").toString();
		
		double numa = Double.parseDouble(a);
		double numb= Double.parseDouble(b);
		
		double act_res = numa+ numb;
		
		if(act_res==Double.parseDouble(exp_res)){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		
		
		
		
	}
	
	
//dataataprovider
	@DataProvider(name="test")
	public Iterator<Object[]> adddata() throws Exception{
		
		
		ExcelRW excelRW = new ExcelRW(System.getProperty("user.dir") + "\\src\\main\\resources\\sum.xlsx");
		
		int rowcount = excelRW.rowcount("Sheet1");
		int colcount = excelRW.Colcount("Sheet1");
		
//		create list
		ArrayList<Object[]> al = new ArrayList<Object[]>();

//		iterate thru rows
		for(int i = 1 ; i<=rowcount;i++){
//			create map
			Map<String, String> hmap = new HashMap<String,String>();
//			iterate thru columns
			for(int j = 0;j<colcount;j++){

			String key = excelRW.readcellval("Sheet1", 0, j);
			String val = excelRW.readcellval("Sheet1", i, j);
			
			hmap.put(key, val);
			
			}
//			Store map
//			object array to hold map
			Object[] x = new Object[1];			
			x[0]=hmap;
			
//			add to list
			al.add(x);
			
		}
		
		
		  return al.iterator();
		
		
		
		
	}
	
	
	
	
	

}
