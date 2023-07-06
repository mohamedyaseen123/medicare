package pom;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class NewTest {
  @Test
  
	  public void login_page() {
			
			WebDriver driver;
			
			{
				System.setProperty("webdriver.chrome.driver", "/home/yaseenyazoutloo/Downloads/chromedriver_linux64.zip");
				 driver = new ChromeDriver();

				driver.get("http://http://localhost:9001/medicare/");
				System.out.println("Succesfull run the condition");
				
  }

}
