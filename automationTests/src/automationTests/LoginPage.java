package automationTests;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

	public static void main(String[] args) {
	
		
	/* Login to Facebook and validate user has logged in
	 * the the correct account by navigating to profile
	 * page.
	 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
				
		// This gets rid of the notification alert that pops up.
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		//add key and value to map as follow to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();
		
		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);

		
	/* Step 1 : Login to facebook with valid credentials
	 * Enter username, password and click Login
	 */
		
		// Go to facebook.com
		driver.get("http://www.facebook.com");

		// Enter username
		driver.findElement(By.id("email")).sendKeys("brightview14741@gmail.com");

		// Enter password
		driver.findElement(By.id("pass")).sendKeys("T35tP@55Word");

		// Click login
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']")).click();

		
		
		
	/* Step 2 : Validate login was successful
	 * (1) : Login is validated by locating the user's name after login. If the user's name is
	 * located on the left side of the navigation window, print TEST PASSED : Login Successful. 
	 * If user name is not listed on the left side of the navigation window, print TEST FAILED : Login Failed.
	 */

		boolean isLoginSuccessful = driver.findElement(By.id("bluebarRoot")).getText().contains("Carla");
		if (isLoginSuccessful) {
			System.out.println("TEST PASSED : Login Successful. User's name is shown on homepage.");
		} else {
			System.out.println("TEST FAILED : Login Failed User's name is not shown on homepage.");
		}

		
		
		
	/*
	 * (2a) : Navigate to user profile page to validate login was successful. 
	 * Navigate to Profile page and check if profile belongs to user by going to the
	 * URL of the user. User has a unique URL and if the user has logged in, they should
	 * be able to navigate to that page and view certain information (i.e., About Page, etc.)
	 */

		
		System.out.println("Validation #2 in Progress...");

		// 1 - Navigate to User Profile
		driver.get("https://www.facebook.com/raelyb");
		
		// 2 - Verify navigation is to correct profile by checking name shown.
		boolean goToProfileSuccessful = driver.findElement(By.id("timeline_top_section")).getText().contains("Carla");
		if (goToProfileSuccessful) {
			System.out.println("TEST V2 PASSED : Profile Navigation Successful. User's profile is shown.");
		} else {
			System.out.println("TEST V2 FAILED : Profile Navigation Unsuccessful. User's profile is not shown.");
		}
		
		
		/* (2b) : Click ABOUT ME page and navigate through tabs (i.e., Place You've Lived)
		 * PLACES YOU'VE LIVED : Search for ADD A PLACE and click it
		 * Search for text PLACES YOU'VE LIVED as this would not be present if the
		 * user was not logged in and looking at their own profile
		 */
						
		// Navigate to ABOUT ME Page
		
		// Locates text that contains PLACES YOU'VE LIVED
		
		// While on PLACES YOU'VE LIVED, search for text and  ADD A PLACE text link and click it.


		
		
	}

}
