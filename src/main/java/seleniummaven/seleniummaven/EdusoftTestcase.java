package seleniummaven.seleniummaven;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EdusoftTestcase {

	WebDriver driver=new ChromeDriver();
	String driverPath = "C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	
	@BeforeTest
	void navigate() throws InterruptedException {
		driver.get("https://topsoftwarecourses.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=1)
	void Applynow() throws InterruptedException {
		WebElement Applynow=driver.findElement(By.xpath("//button[@class='navbar-button btnOpenForm']"));
		Applynow.click();
		Thread.sleep(1000);
	}
	@Test(priority=2)
	void Name() throws InterruptedException {
		WebElement Name=driver.findElement(By.xpath("//div[@class='input-group']//input[@id='FullName']"));
		           Name.sendKeys("Brijesh nigam");
		           Thread.sleep(1000);
	}
	@Test(priority=3)
	void Email() throws InterruptedException {
		WebElement Email=driver.findElement(By.xpath("//div[@class='input-group']//input[@id='Email']"));
		           Email.sendKeys("nigambrijesh540@gmail.com");
		           Thread.sleep(1000);
	}
	@Test(priority=4)
	void Number() throws InterruptedException {
		WebElement Number =driver.findElement(By.xpath("//div[@class='input-group']//input[@id='Contact']"));
		           Number.sendKeys("8755838077");////div[@class='input-group']//input[@id='Contact']
		           Thread.sleep(1000);
//		Thread.sleep(4000);
//		Alert singbutton = driver.switchTo().alert();
//		      singbutton.accept();
	}
	@Test(priority=5)
	void Course() throws InterruptedException {
		WebElement Course =driver.findElement(By.xpath("//div[@class='input-group']//input[@id='Course']"));
		           Course.sendKeys("Software testing");
		           Thread.sleep(1000);
	}
	
	@Test(priority=6)
	void Location() throws InterruptedException {
		WebElement Location =driver.findElement(By.xpath("//div[@class='input-group']//input[@id='Location']"));
                   Location.sendKeys("Agra"); 
                   Thread.sleep(1000);
                   
	        }
	@Test(priority=7)
	void Applybutton() throws InterruptedException {
		WebElement Applybutton =driver.findElement(By.xpath("//div[@class='border-bottom']//button[@class='buttonn']"));
		           Applybutton.click();
		           Thread.sleep(1000);
                  
	
	}
	@Test(priority=8)
	void Ourcourses() throws InterruptedException {
		WebElement Ourcourses =driver.findElement(By.xpath("//li[@class='services drop-li']"));
	               Ourcourses.click();
	               Thread.sleep(1000);
                   
	
	}
	@Test(priority=9)
	void Datascience() throws InterruptedException {
		WebElement Datascience =driver.findElement(By.xpath("//a[@href='/Data-science.html']"));
		Datascience.click();
		Thread.sleep(1000);
                   
	
	}
	@Test(priority=10)
   void Dataanalyst() throws InterruptedException {
		WebElement Dataanalyst=driver.findElement(By.xpath("//a[normalize-space()='Data analyst']"));
		Dataanalyst.click();
		Thread.sleep(1000);
                  
	}
      @Test(priority=12)
      void Fullstuckdev() {
    	  WebElement Fullstuckdev=driver.findElement(By.xpath("//a[@href='/Full-Stack.html']"));
                     Fullstuckdev.click();
                    
      }
      @Test(priority=13)
      void Softwaretesting()  {
    	  WebElement SoftwareTesting=driver.findElement(By.xpath("//a[@href='/Software-Testing.html']"));
    	             SoftwareTesting.click();
    	            
      	}
//      @Test(priority=13)
//      void BabyBouncerandRocker()  {
//    	  WebElement BabyBouncerandRocker=driver.findElement(By.xpath("//li[normalize-space()='Baby Bouncer and Rocker']"));
//    	             BabyBouncerandRocker.click();
//    	          
//      }
//      @Test(priority=14)
//      void BabyBoosterChair()  {
//    	  WebElement BabyBoosterChair=driver.findElement(By.xpath("//li[normalize-space()='Baby Booster Chair']"));
//    	             BabyBoosterChair.click();
//    	            
//    	             
//    	            
//      }
              
}
