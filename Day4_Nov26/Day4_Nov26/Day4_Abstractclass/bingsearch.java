package Day4_Abstractclass;

import org.openqa.selenium.By;

public class bingsearch extends abstractclassex {

	@Override
	public String searchandextract(String searchopt) {
		// TODO Auto-generated method stub
		fd.findElement(By.id("sb_form_q")).sendKeys(searchopt);
		fd.findElement(By.id("sb_form_go")).click();
		return fd.findElement(By.className("sb_count")).getText();
	}

}
