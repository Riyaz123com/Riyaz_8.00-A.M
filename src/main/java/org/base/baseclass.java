package org.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
     
    public static WebDriver driver;
//	public static WebDriver launch() {
//		
//	WebDriverManager.chromedriver().setup();	
//		 return driver=new ChromeDriver();
//		
//	}
	
	public static void launchurl(String url) {
           
		if (url.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();	
			  driver=new ChromeDriver();			
		}
		
		else if (url.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();	
			  driver=new ChromeDriver();			
		}
	}
		public static void linkurl(String go) {
			driver.get(go);
			driver.manage().window().maximize();						
		}
		
		public static void time(long sec) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);					
		}
		
		public static void sendkeys(WebElement e,String vals) {
             e.sendKeys(vals);
			
		}
		
		public static void sendkeys1(WebElement r,String valsu) {
            r.sendKeys(valsu);			
		}
		
		public static void clkk(WebElement k) {
           k.click();			
		}
		
		public static String getattribute(WebElement pss) {
          String rrt = pss.getAttribute("values");
			System.out.println(rrt);
			return rrt;
		}
		
		public static String currenturl() {
              String tl = driver.getCurrentUrl();
			  System.out.println(tl);
			return tl;			  
		}
		
		public static void mov(WebElement e) {
            Actions a=new Actions(driver);
            a.moveToElement(e);			
		}
		
		public static void butnn(WebElement w) {
            w.click();			
		}
		
		public static void slct(WebElement bo,int num) {
           Select s=new Select(bo);
			s.selectByIndex(num);
		}
		
		public static void javscr(WebElement ww,String ee) {
          JavascriptExecutor js=(JavascriptExecutor)driver;
          js.executeScript("arguments[0].setAttribute('value','riyaz')", ww);          
		}
	   
		public static void snps(WebElement ys,String st) {
        JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value','charu')", ys);
		}
		
		public static void screenshot() throws IOException {
          TakesScreenshot ts=(TakesScreenshot) driver;
			
          File ss = ts.getScreenshotAs(OutputType.FILE);           
          File f=new File("C:\\Users\\riyazuddin\\eclipse-workspace\\Riyaz\\mavencls\\Riyaz.png");
          FileUtils.copyFile(ss, f);          
		}
		
		public static void ssparticular(WebElement ui) throws IOException {
             File parti = ui.getScreenshotAs(OutputType.FILE);
	        File ff=new File("C:\\Users\\riyazuddin\\eclipse-workspace\\Riyaz\\mavencls\\parti.png");
             FileUtils.copyFile(parti, ff);
		}
		
		public static void jsclk(WebElement az) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", az);			
		}
		
		public static void scroll(WebElement scl) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
                    js.executeScript("arguments[0].scrollIntoView(true)", scl);
			       
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

