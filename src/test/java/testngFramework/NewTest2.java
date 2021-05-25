package testngFramework;

import org.testng.annotations.Test;

public class NewTest2 {
	 
	  @Test(groups = {"sanity","regression"},priority=1)
	  public void login() {
		  
		  System.out.println("log in  sucessfull");
	  }
	  
	  @Test(groups = {"sanity"},priority=3)
	  public void Fundtransfer() {
		  System.out.println("fund transfer successfull");
	  }
	  
	  @Test(groups = {"sanity"},priority=2)
	  public void search(){
		  
		  System.out.println("search sucessfull");
	  }
	  
	  @Test(groups = {"regression"},priority=2)
	  public void advancedsearch() {
		  
		  System.out.println("advanced search  sucessfull");
	  }
	  
	  @Test(groups = {"regression"},priority=3)
	  public void preparedreacharge() {
		  
		  System.out.println("  preparedrecharge  sucessfull");
	  }
	  
	  @Test(groups = {"regression"},priority=4)
	  public void billpayments() {
		  
		  System.out.println("billpayments sucessfull");
	  }
	  
	  @Test(groups = {"sanity","regression"},priority=10)
	  public void logout() {
		  
		  System.out.println("logout sucessfull");
	  }
}
