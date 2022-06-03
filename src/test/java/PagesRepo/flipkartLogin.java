package PagesRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseRunner.BaseClass;

public class flipkartLogin  extends BaseClass{
	public flipkartLogin() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")
	private WebElement loginbtn;
	
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}
	
}
