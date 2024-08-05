package seleniummaven.seleniummaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UncodemyTesting {
	WebDriver driver=new ChromeDriver();
	String driverPath = "C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	
	@BeforeTest
	void navigate() throws InterruptedException {
		driver.get("https://uncodemy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		//driver.manage().window().maximize();
	}
	@Test(priority=1)
	void Categories() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Categories=driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		Actions a= new Actions(driver);
		a.moveToElement(Categories).perform();
		//Categories.click();
	}
	@Test(priority=2)
	void Fullstuckdevelopment() throws InterruptedException {
		WebElement FullStuckDevelopment=driver.findElement(By.xpath("//a[normalize-space()='Full-Stack-Development']"));
		FullStuckDevelopment.click();
		Thread.sleep(1000);
	}
//	Under the Full-Stuck-Development module Testing 
//	String parentwindow= driver.getWindowHandle();
//	System.out.println(parentwindow);
//    @Test(priority=3)
//			void FullstuckdeveloperwithnodeJS() throws InterruptedException {
//				WebElement FullstuckdeveloperwithJS=driver.findElement(By.xpath("//a[normalize-space()='Full Stack With NodeJs']"));
//				FullstuckdeveloperwithJS.click();
//				Thread.sleep(1000);
//			}
//			@Test(priority=4)
//			void Pythonfullstuckdeveloper() throws InterruptedException {                                                                     
//				WebElement Pyhtonefullstuckdeveloper=driver.findElement(By.xpath("//a[normalize-space()='Python Full Stack']"));
//				Pyhtonefullstuckdeveloper.click();
//				Thread.sleep(1000);
//			}
//There is a bug Java Full Stuck in React 
			@Test(priority=5)
			void Javafullstuckusingreact() throws InterruptedException {                                                                     
				WebElement Javafullstuckusingreact=driver.findElement(By.xpath("//a[normalize-space()='Java Full Stuck Using React']"));
				Javafullstuckusingreact.click();
				Thread.sleep(1000);
			}
			@Test(priority=6)
			void WebDesigning() throws InterruptedException {                                                                     
				WebElement WebDesigning=driver.findElement(By.xpath("//a[normalize-space()='Web Designing']"));
				WebDesigning.click();
				Thread.sleep(1000);
			}

	@Test(priority=3)
	void Datascience() throws InterruptedException {
		WebElement dataScience=driver.findElement(By.xpath("//a[normalize-space()='Data Science']"));
	    dataScience.click();
	    Thread.sleep(1000);
	}
	@Test(priority=4)
	void softwaretesting() throws InterruptedException {
		WebElement Softwaretesting=driver.findElement(By.xpath("//a[normalize-space()='Software Testing']"));
		Softwaretesting.click();
		Thread.sleep(1000);
	}
	@Test(priority=5)
	void cloudtools() throws InterruptedException {
		WebElement cloudtool=driver.findElement(By.xpath("//a[normalize-space()='Cloud Tools']"));
		           cloudtool.click();
		           Thread.sleep(1000);
	}
//	@Test(priority=6)
//	void DigitMarketing() throws InterruptedException {
//		WebElement DigitalMarketing=driver.findElement(By.xpath("//a[normalize-space()='Digital Marketing']"));	
//		DigitalMarketing.click();
//		Thread.sleep(1000);
//		}
//	@Test(priority=7)
//	void JavaTechnology() throws InterruptedException {
//		WebElement JavaTechnology=driver.findElement(By.xpath("//a[normalize-space()='Java Technology+']"));
//		JavaTechnology.click();
//		Thread.sleep(1000);
//	}
//	@Test(priority=8)
//	void NetworkSecurity() throws InterruptedException {
//		WebElement NetworkSecurity = driver.findElement(By.xpath("//a[normalize-space()='Network & Security']"));
//	    NetworkSecurity.click();
//	    Thread.sleep(1000);
//	    }
//	@Test(priority=9)
//	void Programming() throws InterruptedException {
//		WebElement Programming=driver.findElement(By.xpath("//a[normalize-space()='Programming Language']"));
//	    Programming.click();
//	    Thread.sleep(500);
//	}
//	@Test(priority=10)
//	void CADTraining() throws InterruptedException {
//		WebElement CADTraining=driver.findElement(By.xpath("//a[normalize-space()='CAD Training']"));
//	    CADTraining.click();
//	    Thread.sleep(1000);
//	    }
//	@Test(priority=11)
//	void GraphicDesgin() throws InterruptedException {
//		WebElement GraphicDesgin=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[10]/a[1]"));
//		GraphicDesgin.click();
//		Thread.sleep(1000);
//	}	
	//String parentwindow=driver.getWindowHandle();
	//System.out.println("parentwindow");
	
}
