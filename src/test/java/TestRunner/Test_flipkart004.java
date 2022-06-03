package TestRunner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseRunner.BaseClass;
import PagesRepo.flipkartLogin;
import Utilites.ReadConfig;

public class Test_flipkart004 extends BaseClass{
	ReadConfig readConfig = new ReadConfig();
	
	
	@Test(priority=1)
	private void loginalityTest() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);       
		
		driver.get(readConfig.TestURL());
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
	driver.findElement(By.className("_1_3w1N")).click();
//		flipkartLogin lgn= new flipkartLogin();
//		
//		WebElement button=driver.findElement(By.xpath("//*[@id=\\\"container\\\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a"));
//		lgn.setLoginbtn(button);
//		lgn.getLoginbtn().click();
//		WebElement emailidBox=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
//		emailidBox.click();
//		
//		emailidBox.sendKeys(readConfig.emailId());
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(readConfig.PassWord());
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
//		
//		Assert.assertEquals(driver.getCurrentUrl(),readConfig.TestURL());


	}
	
//	@Test(priority=2)
//	private void add_infinix() {
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.get(readConfig.TestURL());
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img")).click();
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[2]/div[1]/div/div/div/div[1]/div/div[5]/div/a/div/img")).click();
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();		
//	}
//	
//	@Test(priority=3)
//	private void givingLiveLocation() {
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/button")).click();
//		WebElement element=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[2]/div/div[2]/input"));
//		element.click();
//		element.sendKeys("231217");
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[2]/div/div[2]/div")).click();
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/form/button/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/button")).click();
////		adding new address .
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[1]/button")).click();
//		String url=driver.getCurrentUrl();
//		
////		confirming live location.
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/button")).click();
//		
//	}
//	@Test(priority=4)
//	private void changeAddress() {
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		
//		driver.findElement(By.name("name")).sendKeys(readConfig.UserName());
//		driver.findElement(By.name("name")).sendKeys(readConfig.phoneNumber());
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[3]/div[2]/input")).sendKeys(readConfig.locality());
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[7]/div/div/label[2]/div[1]")).click();
////		save and deliver
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/label/div[2]/div/form/div/div[8]/button[1]")).click();
//	}	
	

}

