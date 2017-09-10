package Testscript;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class script_Login {
	
	
	@Test(dataProvider="invalidLogin",dataProviderClass=Dataproviders.dp_login.class)
	public void  invalid_Login(Map hm){
		
		String uid = hm.get("username").toString();
		String pass = hm.get("pwd").toString();
		String exp = hm.get("exp_msg").toString();
		
		
		String Exp_msg="";
		
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("http://books.rediff.com/");
		fd.manage().window().maximize();
		
		fd.findElement(By.linkText("Sign In")).click();
		
		fd.findElement(By.name("logid")).sendKeys(uid);
		fd.findElement(By.name("pswd")).sendKeys(pass);
		fd.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		
		
		String Act_msg = fd.findElement(By.xpath("//b[contains(text(),'Sorry we were unable to complete this step because')]")).getText();
		
		if(Act_msg.equals(exp)){
			
			System.out.println(" Pass");
		}else{
			
			System.out.println("Fail");
		}
		
		
		
		
		
	}
	
	
	
	
	
	

}
