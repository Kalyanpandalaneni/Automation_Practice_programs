package flm_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flm_practice_amazon_links {
public static void main(String[] args) throws Exception {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement link=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div[5]"));
	
	
    List<WebElement>alllinks= link.findElements(By.tagName("a"));
    System.out.println(alllinks.size());
    
    for(int i=0;i<alllinks.size();i++)
    {
    	WebElement links=alllinks.get(i);
    	System.out.println(links.getText());
    	System.out.println(links.getDomAttribute("href"));
    	links.click();
    	System.out.println(driver.getTitle());
    	System.out.println(driver.getCurrentUrl());
    	driver.navigate().back();
Thread.sleep(2000); 
    	link=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div[5]"));
    	alllinks= link.findElements(By.tagName("a"));
    }
    Thread.sleep(2000);
    driver.quit();
}
}
