package pom;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_page {
	
	@Test
	public void login_page() {
	
	WebDriver driver;
	
	{
		System.setProperty("webdriver.chrome.driver", "/home/yaseenyazoutloo/Downloads/chromedriver.exe");
		 driver = new ChromeDriver();

		driver.get("http://localhost:9001/medicare/");
		System.out.println("Succesfull run the condition");
		
	}
}
}
