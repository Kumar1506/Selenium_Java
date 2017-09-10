package Day4_Abstractclass;

import org.openqa.selenium.By;

public class yahoosearch extends abstractclassex {

	@Override
	public String searchandextract(String searchopt) {
		// TODO Auto-generated method stub
		fd.findElement(By.tagName("input")).sendKeys(searchopt);		
		fd.findElement(By.cssSelector("button.sbb")).click();
		
//		String output = fd.findElement(By.xpath("//div[@class='compPagination']/span")).getText();
		
//		2nd way
		String output = fd.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		return output;
	}

}
