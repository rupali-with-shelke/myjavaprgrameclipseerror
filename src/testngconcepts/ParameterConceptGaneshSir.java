package testngconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterConceptGaneshSir {
	
	
	WebDriver driver;
	@Parameters("url")
	@BeforeMethod
	public void initialiation(String website) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(website);
	}
	@Parameters({"username","password"})
	@Test
	public void validateLoginTest(String UID,String PWD) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys("UID");
		driver.findElement(By.name("password")).sendKeys("PWD");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}

}
