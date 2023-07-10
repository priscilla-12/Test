package Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public WebDriver driver;
	
	
		@Before
		public void BeforeHook() throws InterruptedException {
			System.out.println("Browser Opened");
			Thread.sleep(5000);
			
			
		}
			
			@After
			public void AfterHook()  {
				
				System.out.println("Browser Closed");
		
	}
	
	

}
