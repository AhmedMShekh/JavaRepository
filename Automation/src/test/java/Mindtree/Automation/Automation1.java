package test.java.Mindtree.Automation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {
	
public static void main(String[] args) {
	
	
	//opening chrome browser through automated test software
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet115\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//navigate to urbanladder platform
	driver.get("https://www.urbanladder.com/");
	
	//Signing up for Urbanladder platform
	driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
	driver.findElement(By.xpath("//a[@class='signup-link authentication_popup']")).click();
	driver.findElement(By.xpath("//input[@class='textfield email required input_authentication email-suggest']")).sendKeys("M1083081@mindtree.com");
	driver.findElement(By.xpath("//input[@class='textfield required input_authentication']")).sendKeys("Furniture@1122");
	driver.findElement(By.xpath("//input[@value='Sign Up']")).click();
}
}
