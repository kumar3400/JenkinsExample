package testngFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1 {
	
	//Note:testng always execute with alphabetic order
	
	//using alphabetic order
	
	@Test
	public void testB() throws InterruptedException {
		
		Assert.assertEquals("Gmail", "Gmail");
		
		Thread.sleep(5000);
	}
	
	@Test
	public void testA() {
		
		Assert.assertEquals("yahoo", "yahoo");
	}
	
	//If You want to control the Test execution process then use priority attribute.
	
	//using priority
	@Test (priority=1)
	public void Abcd() {
		
		Assert.assertEquals("Gmail", "Gmail");
	}

	@Test (priority=2)
	public void Efg() {
		
		Assert.assertEquals("yahoo", "yahoo");
		
	}
	@Test (priority=4, enabled= false)//to skip the test case we use (enabled=false)
	public void hij() {
		
		Assert.assertEquals("Google", "Google");
	}
	
	//using depends on methods
	@Test(priority=3)
	public void login(){
		System.out.println("Login Successful");
		}
		@Test (dependsOnMethods = {"login"})//means it will run depend login method after it will run
		public void search(){
			Assert.assertEquals("Gmail", "Gmail");
		System.out.println("Search Successful");
		}
		@Test (dependsOnMethods = {"search"})//it will run after search
		public void advancedSearch(){
		//Assert.assertEquals("Google", "Gmail");
			Assert.assertEquals("Google", "Google");
		System.out.println("Advanced Search Successful");
		}
		@Test (dependsOnMethods = {"advancedSearch"},alwaysRun=true)//it will execute after advance search
		//(alwaysRun=true) it means if before method is fail also it wont skip it will execute
		public void logout(){
		System.out.println("Logout Successful");
		}
}

