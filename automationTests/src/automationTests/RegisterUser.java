package automationTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;		


public class RegisterUser {

	public static void main(String[] args) {

	/* Register to use facebook and validate
	 * user was created successfully by checking
	 * successful redirect and by logging in using
	 * valid credentials in LoginPage program
	 */
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	
	// Go to facebook.com
	driver.get("http://www.facebook.com");
	
	// Enter Name
	driver.findElement(By.id("u_0_e")).sendKeys("Carla");
	driver.findElement(By.id("u_0_g")).sendKeys("Auto");
	
	// Enter Email : user will have to enter email twice.
	driver.findElement(By.id("u_0_j")).sendKeys("brightview14741@gmail.com");
	//add wait time?
	driver.findElement(By.id("u_0_m")).sendKeys("brightview14741@gmail.com");
	
	// Enter Password
	driver.findElement(By.id("u_0_q")).sendKeys("t35tP@55Word");

	// Select DOB : Month
	Select dateOBMon = new Select(driver.findElement(By.name("birthday_month")));
	dateOBMon.selectByVisibleText("Dec");
	
	// Select DOB : Day
	Select dateOBDay= new Select(driver.findElement(By.name("birthday_day")));
	dateOBDay.selectByVisibleText("1");
	
	// Select DOB : Year
	Select dateOBYYYY = new Select(driver.findElement(By.name("birthday_year")));
	dateOBYYYY.selectByVisibleText("1987");
	
	// Select Gender : Select Female, Male, or Custom
		// Female : 
		// driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click(); //for Female 
	
		// Male :
		// driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click(); 
	
			// Custom : Custom has additional fields to fill
	 			driver.findElement(By.xpath("//*[contains(text(),'Custom')]")).click();  
	 
				 // Select your pronoun : Select from DD
				 	// Click the DD menu to display options
					driver.findElement(By.xpath("//*[contains(text(), 'Select your pronoun')]")).click();
					
						// Pronoun DD options :
						driver.findElement(By.xpath("//*[contains(text(), 'She: ')]")).click();
						// driver.findElement(By.xpath("//*[contains(text(), 'He: ')]")).click();
						// driver.findElement(By.xpath("//*[contains(text(), 'They: ')]")).click();
			
						// Manually enter gender option : text input from user, use send keys 
						driver.findElement(By.id("u_0_w")).sendKeys("girlie");

			
			
				
	/* Second Step of Registration : User confirms their DOB after clicking 
	 * submit in a pop-up before continuing to next page. Next page prompts
	 * the user to enter a code that was sent to the email address provided.
	 */
	
		
			
	// Submit Registration
	driver.findElement(By.id("u_0_y")).click();

			
	
	/* Did the user complete registration successfully?
	 * Enter validation code to verify registration was successful
	 * How : Is user routed to another page? Identiy a key element on
	 * the regirstion page to serve as validation.
	 */
		
	
	
	
	// driver.quit();
	
	}
	
}
