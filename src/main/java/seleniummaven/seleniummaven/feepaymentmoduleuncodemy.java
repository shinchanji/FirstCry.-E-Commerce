package seleniummaven.seleniummaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class feepaymentmoduleuncodemy {
	WebDriver driver=new ChromeDriver();
	String driverPath = "C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	
	@BeforeTest
	void navigate() throws InterruptedException {
		driver.get("https://uncodemy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		String parentwindow= driver.getWindowHandle();
		System.out.println(parentwindow);
	}
	
@Test(priority=1)
void Feepayment() {
	 WebElement Feepayment = driver.findElement(By.xpath("//a[@class=\"pam cls\"]"));
	            Feepayment.click();
}
@Test(priority=2)
void Name() {
	WebElement Name=driver.findElement(By.xpath("//input[@name='name']"));
	           Name.sendKeys("Brijesh Nigam");
}
@Test(priority=3)//input[@name='email']
void Email() {
	WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
	           Email.sendKeys("nigambrijesh540@gmail.com");
      }
 @Test(priority=4)
 void Phone() {//input[@name="phone"]
	 WebElement Phone= driver.findElement(By.xpath("//input[@name='phone']"));
	            Phone.sendKeys("8755838077");
 }
 @Test(priority=5)
 void Course() {
	  WebElement Course= driver.findElement(By.xpath("//input[@name='course']"));
	             Course.sendKeys("Software Testing");//input[@name="course"]
 }
  @Test(priority=6)
	void Amount() {
	     WebElement Amount= driver.findElement(By.xpath("//input[@fdprocessedid=\"ul2zsf\"]"));
	                Amount.sendKeys("22000");//input[@placeholder="Enter Amount"]
  }
  @Test(priority=7)
   void Submit(){
	    WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
	               submit.click();
  }
  @Test(priority=8)
  void Supportmail() {
	  
       WebElement Supportemail=driver.findElement(By.xpath("//div[contains(text(),'info@uncodemy.com')]"));
                  Supportemail.click(); 
	 }
  @Test(priority=9)
  void Contact() {
	  WebElement Contact=driver.findElement(By.xpath("//div[contains(text(),'+91 7701928515)]"));
	             Contact.click();
  }
}
 

