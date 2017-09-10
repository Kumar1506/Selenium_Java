package Dataproviders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import genericlibrary.ExcelRW;

import org.testng.annotations.DataProvider;

public class dp_login {
	
	
	@DataProvider(name="invalidLogin")
	public static Iterator<Object[]> dp_invalidLogin() throws Exception{
		
		ExcelRW excelRW = new ExcelRW(System.getProperty("user.dir") + "\\src\\main\\resources\\Test_Data.xlsx");
		
		int rowcount = excelRW.rowcount("Login");
		int colcount = excelRW.Colcount("Login");
				
//				list create
				List<Object[]> al = new ArrayList<Object[]>();
		for(int i = 1;i<=rowcount;i++){
			
			String flag=excelRW.readcellval("Login", i, 2);
			String script=excelRW.readcellval("Login", i, 1);
			if(flag.equals("Y") && script.equals("InvalidLogin")){
//			map
			Map<String, String> hmap = new HashMap<String,String>();
//			object array
			Object[] x=new Object[1];
			
			for(int j=0;j<colcount;j++){
				
				String key = excelRW.readcellval("Login", 0, j);
				String value = excelRW.readcellval("Login", i, j);			
				hmap.put(key,value);
				
			}			
			
//			add object array
			x[0]=hmap;
			al.add(x);
			}
		}
		
		return al.iterator();
		
		
	}
	
	
	

}
