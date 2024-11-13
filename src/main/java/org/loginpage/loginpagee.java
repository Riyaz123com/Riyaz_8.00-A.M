package org.loginpage;


import java.util.List;

import org.base.baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpagee extends baseclass {

	public loginpagee() {
       PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txt;
		
	@FindBy(id="pass")
     private WebElement pass;
	     	
	@FindBy(name="login")
	 private WebElement lgin;

	public WebElement getTxt() {
		return txt;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLgin() {
		return lgin;
	}

	@FindBy(xpath="//a[@role='button']")
	private  List<WebElement>  crton;

	public List<WebElement> getCrton() {
		return crton;
	}
	
	@FindAll({@FindBy(name="firstname"),@FindBy(xpath="//input[@type='text']")})
	private List <WebElement> newtxt;
	
	@FindAll({@FindBy(name="reg_passwd__"),@FindBy(xpath="//input[@type='password']")})
	private WebElement newpss;

	public List<WebElement> getNewtxt() {
		return newtxt;
	}

	public WebElement getNewpss() {
		return newpss;
	}

	@FindBy(name="reg_email__")
	 private WebElement nummm  ;

	public WebElement getNummm() {
		return nummm;
	}
	
	
	
	
	
}

