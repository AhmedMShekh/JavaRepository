package test.java.Mindtree.Automation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation2_1{
	
public static void main(String[] args) {
	
	
	//opening chrome browser through automated test software
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet115\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	//navigate to nobroker platform
	driver.get("https://www.nobroker.in/");
	
	//Signing up for nobroker platform
	driver.findElement(By.xpath("//div[@class='nb__19hcF']")).click();
	driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).sendKeys("9066154058");
	//driver.findElement(By.id("//input[@id=\"login-signup-form__name-input\"]")).sendKeys("Ahmed");
	driver.findElement(By.xpath("//input[@id=\"login-signup-form__name-input\"]")).sendKeys("Ahmed");
	driver.findElement(By.xpath("//input[@id='login-signup-form__email-input']")).sendKeys("shekhahmed604@gmail.com");
	driver.findElement(By.xpath("//button[@id='signUpSubmit']")).click();
	//driver.close();
	
}
}
