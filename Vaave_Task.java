package kalyan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vaave_Task {
public static void main(String[] args) throws Exception {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://corp-prd.vaave.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//a[text()='Login '])[1]")).click();
	
	// login
	
	driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("vamshi.k@vaave.com",Keys.TAB,"Vaave_123");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@class,'form-control btn-plain')]")).click();
	Thread.sleep(2000);

	//flash message (Success / Failure)
	System.out.println(driver.findElement(By.xpath("//div[@id='flash-messages']")).getText());
	
	
}
}
