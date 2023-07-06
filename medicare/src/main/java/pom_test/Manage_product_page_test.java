package pom_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom.Login_admin_page;
import pom.Login_page;
import pom.Manage_product_page;

public class Manage_product_page_test {
	@Test
	public void Manageproductpage() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/yaseenyazoutloo/Downloads/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:9001/medicare/");
	
	PageFactory.initElements(driver, Login_page.class);
	Thread.sleep(3000);
	Login_page.Login.click();
	
	PageFactory.initElements(driver, Login_admin_page.class);

	Thread.sleep(3000);
	Login_admin_page.Email.sendKeys("vk@gmail.com");
	Login_admin_page.Password.sendKeys("admin");
	Login_admin_page.Login.click();
	
	Thread.sleep(2000);
	Login_admin_page.Manage_Product.click();
	
	PageFactory.initElements(driver, Manage_product_page.class);
	
	Manage_product_page.Name.sendKeys("Metaformin 500mg");
	Manage_product_page.Brand.sendKeys("Bisacodyl tablets");
	Manage_product_page.Description.sendKeys("Dulcolax® is a proven laxative brand that provides relief of occasional constipation with different products that include the active ingredients bisacodyl, docusate sodium, and magnesium hydroxide.");
	Manage_product_page.Unit_Price.clear();
	Thread.sleep(2000);
	Manage_product_page.Unit_Price.sendKeys("30");
	Manage_product_page.Quantity.clear();
	Thread.sleep(2000);
	Manage_product_page.Quantity.sendKeys("1");
	Thread.sleep(5000);
	Manage_product_page.Upload_a_file.sendKeys("/home/yaseenyazoutloo/Downloads/download.jpeg");
	Manage_product_page.Save.click();
	Thread.sleep(3000);
	
	Manage_product_page.Name.sendKeys("Neurobion Forte");
	Manage_product_page.Brand.sendKeys("Zuellig Pharma");
	Manage_product_page.Description.sendKeys("Neurobion Forte Tablet 30's is a vitamin supplement that helps improve the health of the nervous system, improves metabolism, and strengthens the immune system and various bodily functions.");
	Manage_product_page.Unit_Price.clear();
	Thread.sleep(2000);
	Manage_product_page.Unit_Price.sendKeys("15");
	Manage_product_page.Quantity.clear();
	Thread.sleep(2000);
	Manage_product_page.Quantity.sendKeys("1");
	Thread.sleep(5000);
	Manage_product_page.Upload_a_file.sendKeys("/home/yaseenyazoutloo/Downloads/download (1).jpeg");
	Manage_product_page.Save.click();
	Thread.sleep(10000);
	
	}
}

