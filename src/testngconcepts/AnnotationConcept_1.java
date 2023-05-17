package testngconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationConcept_1 {
	
  @BeforeSuite
  public void bs() {
	
   System.out.println("before suite annotation");
	  
             }
  @BeforeTest
  public void bt() {
	  
	  System.out.println("before test annotation");
  }
  @BeforeClass
  public void  bc () {
	  
	System.out.println("before class annotation");  
	  
  }
  @BeforeMethod
  public void bm() {
	  
	  System.out.println("before method annotation");
	  
  }
  @Test
  public void loginTest() {
	 System.out.println("Login test passed"); 
  }
  @AfterMethod
  public void am() {
	  System.out.println("after method annotation");
	  
  }
  @AfterClass
  public void ac() {
	  
	 System.out.println("after class annotation"); 
	  
}
  @AfterTest
  public void at() {
	  System.out.println("after test annotation");
	  
  }
 @AfterSuite
 public void as() {
	 
	 System.out.println("after suite annotation");
	 
 }




}
