package flm_practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_browser {
	public static void main(String[] args) {

		System.out.println("enter valid Browser name: ");
		Scanner sc = new Scanner(System.in);
		String browser = sc.next();

		WebDriver driver = null;
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			System.setProperty("webdriver.edge.driver", "D:\\Selenium Files\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("invalid browser enter valid browser name");

		}
		if (driver != null) {
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
		}

		sc.close();
	}
}
