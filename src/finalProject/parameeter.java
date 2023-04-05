package finalProject;

import java.util.Random;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;


public class parameeter {
	
	WebDriver driver;
	SoftAssert ass =new SoftAssert();
	Random rand =new Random();
	@BeforeTest
	public void Setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");  
		driver = new ChromeDriver(options);
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
	}
	
	@AfterTest 
	public void endTest() {
		
	}
	
}
