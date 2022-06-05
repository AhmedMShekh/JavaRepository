package test.java.Mindtree.Automation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation2_2{
	
public static void main(String[] args) throws InterruptedException {
	
	
	//opening chrome browser through automated test software
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet115\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	//navigate to nobroker platform
	driver.get("https://www.nobroker.in/");
	
	//Sign in for nobroker platform
	driver.findElement(By.xpath("//div[@class='nb__19hcF']")).click();
	driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).sendKeys("9066154058");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"login-signup-form-login-radio-password\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"login-signup-form__password-input\"]")).sendKeys("ahme1686");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
	//more operations
	driver.findElement(By.xpath("//*[@id=\"listPageSearchLocality\"]")).sendKeys("BASE");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"listPageSearchLocality\"]")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"listPageSearchLocality\"]")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();
	
	
	
	
	//driver.findElement(By.xpath("div[@class=\"mr-1.5p relative tp:mr-0 nb__2xxq-\"]")).click();
	//driver.findElement(By.xpath("//table.tbody.div[@class='overlay jx_ui_Widget']")).click();
	//driver.findElement(By.id("//span[@id=\"saveSearch\"]")).click();
	//driver.findElement(By.xpath("button[@class=\"btn btn-primary\"")).click();
	//driver.close();
	
}
}