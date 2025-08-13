package kalyan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Adactin_hotel_page {
public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver-win32\\chromedriver.exe");
	
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://adactinhotelapp.com/index.php");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0806",Keys.TAB,"reyaz123");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='login']")).click();
	
	//location
	new Select(driver.findElement(By.xpath("//select[@name='location']"))).selectByVisibleText("Sydney");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
	//select hotel
	driver.findElement(By.xpath("//input[@name='radiobutton_3']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	//book a hotel
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Kalyan", Keys.TAB,"krishna",Keys.TAB,"Hyderabad",Keys.TAB,"8695869587423659");
	
	new Select(driver.findElement(By.xpath("//select[@name='cc_type']"))).selectByVisibleText("American Express");
	
	new Select(driver.findElement(By.xpath("//select[@name='cc_exp_month']"))).selectByValue("2");
	
	new Select(driver.findElement(By.xpath("//select[@name='cc_exp_year']"))).selectByVisibleText("2030");
	
	driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("845",Keys.TAB,Keys.ENTER);
	System.out.println("Pleasewait while we are processing your hotel booking...");
	System.out.println(driver.findElement(By.xpath("//input[@name='order_no']")).getText());
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='logout']")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//td[@class='reg_success']")).getText());
	Thread.sleep(2000);
	driver.quit();
}
}
