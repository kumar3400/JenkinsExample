package testngFramework;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



 
public class NewTest1 {
  
	public static WebDriver driver;
	//NewTest2 newTest;
	 
	
	/*TestNG is an automation testing framework in which NG stands for "Next Generation". 
	TestNG is inspired from JUnit which uses the annotations (@).
	
	*Using TestNG, you can generate a proper report, and you can easily come to know how many test cases are passed,
	* failed, and skipped. You can execute the failed test cases separately.
	
	*/

	// This method is to navigate snapdeal URL
	@BeforeClass
	public void init() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr464\\java selenium\\chromedriver_win32\\chromedriver_win32_90\\"
				+ "chromedriver.exe");
			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 
	}

	// To log in flipkart
	@Test
	public void login() {
		driver.navigate().to("https://www.snapdeal.com");
		String url =driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.snapdeal.com/");
 		 
		

	}
		  

	@AfterClass
	public void quit() {
	
		driver.close();
		
	}
	
}
