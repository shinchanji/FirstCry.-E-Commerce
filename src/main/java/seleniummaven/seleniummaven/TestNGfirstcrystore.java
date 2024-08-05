package seleniummaven.seleniummaven;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@Test
public class TestNGfirstcrystore {
	
	WebDriver driver=new ChromeDriver();
	String driverPath = "C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	
	@BeforeTest
	void navigate() throws InterruptedException {
		driver.get("https://firstcrystore.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().window().minimize();
	   // driver.quit();
	}
	@Test(priority=1)
	void account() {
		WebElement accountlog=driver.findElement(By.xpath("//span[normalize-space()='Account']"));
		           accountlog.click();
		           
	}
	@Test(priority=2)
	void login() {
		WebElement usname=driver.findElement(By.xpath("//input[@name='email']"));
		           usname.sendKeys("nigambrijesh540@gmail.com");
	}
	@Test(priority=3)
	void pass() {
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		           password.sendKeys("Pgl@11072003");
	}
	@Test(priority=4)
	void singinbutton() throws InterruptedException {
		WebElement singinbutton =driver.findElement(By.xpath("//button[@type='submit']"));
		           singinbutton.click();
		           Thread.sleep(4000);
		           Alert singbutton = driver.switchTo().alert();
				      singbutton.accept();
		
		
		   
	}
	@Test(priority=5)
	void Accessories() throws InterruptedException {
		WebElement Accessories =driver.findElement(By.xpath("//div[@class='top-cotegories hover-product-list y-gap']"));
		           Accessories.click();
		           
	}
	
	@Test(priority=6)
	void Breastpump() {
		WebElement Breastpump =driver.findElement(By.xpath("//li[normalize-space()='Breast Pump']"));
                   Breastpump.click();
                   
	        }
	@Test(priority=7)
	void babybedwithnet() {
		WebElement babybedwithnet =driver.findElement(By.xpath("//li[normalize-space()='Baby Bed With Net']"));
		           babybedwithnet.click();
                  
	
	}
	@Test(priority=8)
	void BabyCradleAutomaticSwing() {
		WebElement BabyCradleAutomaticSwing =driver.findElement(By.xpath("//li[normalize-space()='Baby Cradle Automatic Swing']"));
	               BabyCradleAutomaticSwing.click();
                   
	
	}
	@Test(priority=9)
	void BabyhugCarSeat() {
		WebElement BabyhugCarSeat =driver.findElement(By.xpath("//li[normalize-space()='Babyhug Car Seat']"));
		           BabyhugCarSeat.click();
                   
	
	}
	@Test(priority=10)
   void CradleSwing() {
		WebElement CradleSwing=driver.findElement(By.xpath("//li[normalize-space()='Cradle Swing']"));
		           CradleSwing.click();
                  
	}
      @Test(priority=11)
      void ElectricBabySwing() {
    	  WebElement ElectricBabySwing=driver.findElement(By.xpath("//li[normalize-space()='Electric Baby Swing']"));
                     ElectricBabySwing.click();
                    
      }
      @Test(priority=12)
      void Babypalna()  {
    	  WebElement Babypalna=driver.findElement(By.xpath("//li[normalize-space()='Baby palna']"));
    	             Babypalna.click();
    	            
      	}
      @Test(priority=13)
      void BabyBouncerandRocker()  {
    	  WebElement BabyBouncerandRocker=driver.findElement(By.xpath("//li[normalize-space()='Baby Bouncer and Rocker']"));
    	             BabyBouncerandRocker.click();
    	          
      }
      @Test(priority=14)
      void BabyBoosterChair()  {
    	  WebElement BabyBoosterChair=driver.findElement(By.xpath("//li[normalize-space()='Baby Booster Chair']"));
    	             BabyBoosterChair.click();
    	             driver.navigate().refresh();
    	             
    	        }
      @Test(priority=15)
      void AddtoCart()   {
    	  
    	  WebElement AddtoCart=driver.findElement(By.xpath("//button[@class=\"btn cart-btn\"][@fdprocessedid=\"185m7\"]"));
    	             AddtoCart.click();
    	   WebElement adc=driver.findElement(By.xpath("//button[@class='btn btn-primary px-3 ripple-surface']"));
    	   adc.click();
    	               
         
      }

      @Test(priority=16)
      void Cart()  {
    	  WebElement Cart=driver.findElement(By.xpath("//span[normalize-space()='Cart']"));
    	             Cart.click();
    	             driver.navigate().refresh();
      }
      @AfterTest
      void close() {
    	  driver.quit();
      }
           		}
  
	

