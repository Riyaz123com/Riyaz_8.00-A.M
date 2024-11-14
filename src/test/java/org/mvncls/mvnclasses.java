package org.mvncls;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.base.baseclass;
import org.loginpage.loginpagee;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mvnclasses extends baseclass{

	public static void main(String[] args) throws IOException {
		
		launchurl("chrome");
		linkurl("https://www.facebook.com/");
		time(10);
		currenturl();
		loginpagee lo=new loginpagee();
		
		
		      	           				           
	 	javscr(lo.getTxt(), "riyaz");	 	 
	 	
	 	
	 	sendkeys(lo.getPass(), "charu");
		
//		WebElement pss = driver.findElement(By.id("pass"));

//	 	sendkeys1(lo.getPass(), "charu");
	 	
	 	 	
//		  WebElement clk = driver.findElement(By.name("login"));
//	 	clkk(lo.getLgin());
//		   
//		  WebElement scrll = driver.findElement(By.xpath("//a[text()='Help']"));
//		  scroll(scrll);
		  
	 	List<WebElement> crton = lo.getCrton(); 
	 	   WebElement fh = crton.get(1);
	 	clkk(fh);
	 	
	 	
	 	List<WebElement> newtxt = lo.getNewtxt();
	 	   WebElement hj = newtxt.get(1);
	 	sendkeys(hj, "razia");
	 	 		 	
	 	sendkeys(lo.getNewpss(),"habiba");
		  
	 	sendkeys(lo.getNummm(),"naeer");
	 	getattribute(lo.getNummm());
	 	
	 	
	}
}
