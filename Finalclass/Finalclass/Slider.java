package Misc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

public static void main(String[] args) throws Exception {

// Initiate browser
WebDriver driver=new FirefoxDriver();

// maximize browser
driver.manage().window().maximize();

// Open webpage
driver.get("http://emicalculator.net/");

// Add 5 seconds wait
Thread.sleep(5000);

// Create object of actions class
Actions act=new Actions(driver);

// find element which we need to drag
WebElement drag=driver.findElement(By.xpath("//div[@id ='loanamountslider']/span"));

// find element which we need to drop
//WebElement drop=driver.findElement(By.id("droppable"));
//double mov = Double.parseDouble(drag.getAttribute("style").replace("left: ","").replace("%","").replace(";",""));
int x = (drag.getLocation().getX())/100;
System.out.println(x);
// this will drag element to destination
act.dragAndDropBy(drag, (int) (x+10) , 0).build().perform();

}

}