package testngFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class sample {
	
	
	public static WebDriver driver ;
	
	
	@BeforeTest
	public void browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr464\\java selenium\\chromedriver_win32\\chromedriver_win32_90\\"
				+ "chromedriver.exe");
		driver = new ChromeDriver();
	
	}
	
	
	
	@Test
	 public void Verifytitle() {
	driver.get("https://www.gmail.com");
	String pagetitle  =driver.getTitle();
	Assert.assertEquals(pagetitle,"Gmail");

}
	
	@Test
	public void verify() {
	 
		driver.get("https://www.javatpoint.com/super-keyword");
		String pagetitle  =driver.getTitle();
		Assert.assertEquals(pagetitle,"Super Keyword in Java- Javatpoint");
		
	}
	
     @AfterTest
	public void closebrowser() {
		 
		driver.close();
	}
	 
	
	 
	
	
	
}