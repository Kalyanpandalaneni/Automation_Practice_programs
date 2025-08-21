package kalyan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_QA {
	
	public static void removeAds(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.querySelectorAll('iframe, #fixedban, .Advertisement').forEach(e => e.remove());");
	}
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/automation-practice-form");
		removeAds(driver);

		System.out.println(driver.findElement(By.xpath("//h1[text()='Practice Form']")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys ("Kalyan", Keys. TAB, "Pandalaneni", Keys. TAB, "pandalanenikalyan123@gmail.com");

	 Thread.sleep(2000);

	 driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
	 Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9110352589"); 

	

	 //Dob

	driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).click();
	driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	Thread.sleep(1000);
	new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByIndex(1);
	new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText("1998");
	
	driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, February 1st, 1998']")).click();
	
	driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
	driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("D:\\realselenium\\Practice\\screenshotediting.png");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("1-40/A, kurada, Gudlavalleru, Krishna district");
	Thread.sleep(2000);
	
		Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Select State']")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//div[text()='Rajasthan']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Select City']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Jaipur']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']")).getText());
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Close']")).click();
	Thread.sleep(2000);
	driver.quit();

}
}