package kalyan;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reelo {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://dev.reelo.io/login");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("pandalanenikalyan123@gmail.com", Keys.TAB, "Kalyan123@");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='button-text']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Campaigns']")).click();

		Thread.sleep(4000);
		// select template

		// display element click intercepted exception
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames: " + frames.size());

		WebElement element = driver.findElement(By.xpath("//div[@class='template-2 draft-templates draft-campaign']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//div[@class='template-2 draft-templates draft-campaign']")));
		 * element.click();
		 */

		Thread.sleep(2000);
		// select sms
		driver.findElement(By.xpath("//div[text()='SMS']")).click();
		Thread.sleep(2000);

		// customise and send
		driver.findElement(By.xpath("//span[text()='Customise and Send']")).click();

		// Deselect email
		Thread.sleep(2000);

		// next
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
		button.click();

		// driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);

		// customize campaign
		WebElement campaignTitle = driver.findElement(By.xpath("//input[@class='field-input']"));

		// Select all text and delete
		campaignTitle.sendKeys(Keys.CONTROL + "a");
		campaignTitle.sendKeys(Keys.DELETE);

		// Now type your new title
		campaignTitle.sendKeys("Sip Into Something Natural its kalyan ");

		// next step 2
		Thread.sleep(2000);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
		button1.click();
		// next step 3
		Thread.sleep(2000);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
		button2.click();
		Thread.sleep(2000);
		// next step 4
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
		button3.click();

		// next step 5
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
		button4.click();

		Thread.sleep(2000);
		// text campaign

		driver.findElement(By.xpath("//span[text()='Test campaign']")).click();

		Thread.sleep(2000);
		// next step 6
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Test message sent successfully']")).getText());
		
		Thread.sleep(2000);
		
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save and exit']")));
		button5.click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains(@class,'m  sb-button--secondary')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		Thread.sleep(2000);

		driver.quit();
	}
}