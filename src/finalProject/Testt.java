package finalProject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testt extends parameeter {

	@Test()
	public void signUp(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Almahdi"+Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Tawalbeh");
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("mahdi.tawalbeh2016@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mahdi@12345");
		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("Mahdi@12345");
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mahdi.tawalbeh2016@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Mahdi@12345");
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		
		String act=driver.getTitle();
		String exp="My Account";
		
		ass.assertEquals(act, exp);
		ass.assertAll();
	}

	@Test(invocationCount = 10)
	public void searchBar() throws InterruptedException {
		
		String [] item= {"Jacket","t-shirt","jeans for men","jeans for women","pants"};
		
		int randomitem= rand.nextInt(0,5);
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(item[randomitem]);
		Thread.sleep(20);
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);

		System.out.println(item[randomitem]);
		
		
		
	}

	@Test(priority = 1)
	public void addFiveItems() throws InterruptedException {
		// add first element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/a/span/span/img")).click();
		String[] elem1Size= {"//*[@id=\"option-label-size-143-item-166\"]","//*[@id=\"option-label-size-143-item-167\"]","//*[@id=\"option-label-size-143-item-168\"]","//*[@id=\"option-label-size-143-item-169\"]","//*[@id=\"option-label-size-143-item-170\"]"};
		String [] elem1Color= {"//*[@id=\"option-label-color-93-item-50\"]","//*[@id=\"option-label-color-93-item-56\"]","//*[@id=\"option-label-color-93-item-57\"]"};
		int randomSize1=rand.nextInt(0,5);
		int randomColor1 =rand.nextInt(0,3);
		String clickSize1=elem1Size[randomSize1];
		String clickColor1=elem1Color[randomColor1];
				driver.findElement(By.xpath(clickSize1)).click();
				driver.findElement(By.xpath(clickColor1)).click();
				driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("3");
				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
				Thread.sleep(3000);
		driver.navigate().back();
				Thread.sleep(3000);
		
///	    Add second element
		driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/a/span/span/img")).click();
		String[] elem2Size = { "//*[@id=\"option-label-size-143-item-166\"]",
				"//*[@id=\"option-label-size-143-item-167\"]", "//*[@id=\"option-label-size-143-item-168\"]",
				"//*[@id=\"option-label-size-143-item-169\"]", "//*[@id=\"option-label-size-143-item-170\"]" };
		String[] elem2Color = { "//*[@id=\"option-label-color-93-item-57\"]",
				"//*[@id=\"option-label-color-93-item-59\"]", "//*[@id=\"option-label-color-93-item-60\"]" };
		int randomSize2 = rand.nextInt(0, 5);
		int randomColor2 = rand.nextInt(0, 3);
		String clickSize2 = elem2Size[randomSize2];
		String clickColor2 = elem2Color[randomColor2];
			driver.findElement(By.xpath(clickSize2)).click();
			driver.findElement(By.xpath(clickColor2)).click();
			driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("2");
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
			Thread.sleep(3000);
			
			driver.navigate().back();
			Thread.sleep(3000);
			
////			//add third element
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div/a/span/span/img")).click();
			String [] elem3Siz={ "//*[@id=\"option-label-size-143-item-166\"]",
					"//*[@id=\"option-label-size-143-item-167\"]", "//*[@id=\"option-label-size-143-item-168\"]",
					"//*[@id=\"option-label-size-143-item-169\"]", "//*[@id=\"option-label-size-143-item-170\"]" };
			int randomSize3=rand.nextInt(0,5);
			driver.findElement(By.xpath(elem3Siz[randomSize3])).click();
			driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-52\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("4");
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);

///			//add fourth element
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/a/span/span/img")).click();
			String [] elem4Size= { "//*[@id=\"option-label-size-143-item-166\"]",
					"//*[@id=\"option-label-size-143-item-167\"]", "//*[@id=\"option-label-size-143-item-168\"]",
					"//*[@id=\"option-label-size-143-item-169\"]", "//*[@id=\"option-label-size-143-item-170\"]" };
			String [] elem4Color= {"//*[@id=\"option-label-color-93-item-49\"]","//*[@id=\"option-label-color-93-item-52\"]","//*[@id=\"option-label-color-93-item-53\"]"};
			int randomSize4=rand.nextInt(0,5);
			int randomColor4=rand.nextInt(0,3);
			driver.findElement(By.xpath(elem4Size[randomSize4])).click();
			driver.findElement(By.xpath(elem4Color[randomColor4])).click();
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);

///			//add fifth element
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/a/span/span/img")).click();
			driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("5");
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);

		
	}

	@Test(priority = 2)
	public void checkOutPage() throws InterruptedException  {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mahdi.tawalbeh2016@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Mahdi@12345");
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
		Thread.sleep(7000);
		driver.findElement(By.name("company")).sendKeys("null");
		driver.findElement(By.name("street[0]")).sendKeys("abu hamzeh");
		driver.findElement(By.name("street[1]")).sendKeys("street1");
		driver.findElement(By.name("street[2]")).sendKeys("albalad center");
		driver.findElement(By.name("city")).sendKeys("irbid");
		driver.findElement(By.name("postcode")).sendKeys("21110");
		WebElement country =driver.findElement(By.name("country_id"));
		Select select2 = new Select(country);
		select2.selectByVisibleText("Jordan");
		driver.findElement(By.name("telephone")).sendKeys("+962772828080");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
		Thread.sleep(3000);
	}
	
	
		@Test (priority = 3)
		public void placeOrder() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")).click();
			Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]/a")).click();
		Thread.sleep(5000);
		WebElement price1Path=driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[4]/td"));
		String price1Text=price1Path.getText().replace("$", "");
		double finalPrice=Double.parseDouble(price1Text);
		System.out.println(finalPrice);
		double exp=467.0;
		ass.assertEquals(finalPrice, exp);
		ass.assertAll();
		
	
	}
	
	@Test()
	public void reOrderFiveTimes() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("login[username]")).sendKeys("mahdi.tawalbeh2016@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("Mahdi@12345");
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		Thread.sleep(5000);
		
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span")).click();
			driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/a[2]")).click();
			Thread.sleep(3000);
			
		}
		
		
	}
	
	@Test()
	public void makeSurebill() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("login[username]")).sendKeys("mahdi.tawalbeh2016@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("Mahdi@12345");
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
		WebElement bill1=driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[4]"));
		WebElement bill2=driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[2]/td[4]"));
		WebElement bill3=driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[3]/td[4]"));
		WebElement bill4=driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[4]/td[4]"));
		WebElement bill5=driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[5]/td[4]"));
		String bill1Text= bill1.getText().replace("$", "");
		String bill2Text= bill2.getText().replace("$", "");
		String bill3Text= bill3.getText().replace("$", "");
		String bill4Text= bill4.getText().replace("$", "");
		String bill5Text= bill5.getText().replace("$", "");
		double dbill1=Double.parseDouble(bill1Text);
		double dbill2=Double.parseDouble(bill2Text);
		double dbill3=Double.parseDouble(bill3Text);
		double dbill4=Double.parseDouble(bill4Text);
		double dbill5=Double.parseDouble(bill5Text);
		double act=dbill1+dbill5+dbill4+dbill3+dbill2;
		double exp=1511.0;
		assertEquals(act, exp);
		ass.assertAll();
		



		
	}
	}


