package phptravel1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hotels {
	WebDriver driver;
	 void browserOpen() throws InterruptedException {

	        // BasicConfigurator.configure();

	       	System.setProperty("webdriver.chrome.driver","D:\\SakthiArun\\cromedriver\\chromedriver.exe"); 
			driver = new ChromeDriver(); 

	      // driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        Thread.sleep(1000);
	    }
	 void hotel() throws Exception {
		 driver.get("http://www.phptravels.net/");
		 driver.findElement(By.id("s2id_autogen3")).click();
		 Thread.sleep(1000);
		WebElement input= driver.findElement(By.xpath(".//*[@id='select2-drop']/div/input"));
		 input.sendKeys("aus");
		 
		 Thread.sleep(1000);
		// WebElement input1= driver.findElement(By.xpath(".//*[@id='select2-drop']/ul/li/ul/li[5]/div"));
		// System.out.println(input1.getText());
		 WebElement d4= driver.findElement(By.xpath(".//*[@id='select2-drop']/ul"));
		
			Actions act=new Actions(driver);
			
			act.moveToElement(d4).sendKeys(Keys.ARROW_DOWN).click().build().perform(); 
			
			//.click().build().perform();
		Thread.sleep(2000);
	   /*	 List <WebElement> loc = driver.findElements(By.xpath(".//*[@id='select2-drop']/ul"));
		 
		 	// String locations=driver.findElement(By.xpath(".//*[@id='select2-drop']/ul/li/ul/li[2]/div")).getText();
	 String locations="Austin, United States";
			        System.out.println( loc.size()); 
			        for(int j=0;j<=10;j++) {
			        	String location2=	loc.get(j).getText();
			        	
			        	Thread.sleep(1000);
			        	System.out.println(location2);
			        	if (locations.equals(location2)) {
			        		loc.get(j).click();
							 break;
		}
			        }
		 
		/* String location = "Manaus, Brazil";
		 
		 for(int i=1;i<12;i++) {
			 WebElement locations1= driver.findElement(By.xpath(".//*[@id='select2-drop']/ul/li/ul/li[5]/div"));
			 String locations=driver.findElement(By.xpath(".//*[@id='select2-drop']/ul/li/ul/li[5]/div")).getText();
				if (location.equals(locations)) {
					 locations1.click();
					 break;
}
		 
		 
		 
		 }*/ 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 WebElement d1	= driver.findElement(By.xpath(".//*[@id='adults']"));
		 d1.click();
		 Select selct=new Select(d1);
		 
		 selct.selectByIndex(3);
		 WebElement d2=driver.findElement(By.id("child"));
		 d2.click();
		 Select sel=new Select(d2);
		 sel.selectByIndex(2);
		 
		 
	 }
	 public static void main(String []args) throws Exception {
		 Hotels a=new Hotels();
		 a.browserOpen();
		 a.hotel();
		 
	 }
	 
	 
	 
}
