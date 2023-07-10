package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1 {
	public WebDriver driver;
	
	
	@Given("Open the browser")
	public void open_the_browser() {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	
	
	}
	
	
	@When("Enter the URL {string}")
	public void enter_the_URL(String url) {
		driver.get(url);
	    
	}
	@When("Click on dropdown Menu")
	public void click_on_dropdown_menu() {
		driver.findElement(By.linkText("Dropdown")).click();
		
	}
	
	@When("select a value from the dropdown")
	public void select_value() throws InterruptedException {
		Select se = new Select(driver.findElement(By.xpath("//*[@id='dropdown']")));
		se.selectByIndex(1);
		Thread.sleep(2000);
	}	
	@When("select options option1 {string}")
	public void select_option1(String string) throws InterruptedException {
		//driver.findElement(By.xpath("//*[@id='dropdown']"));
		Select select= new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText(string);
        Thread.sleep(3000);
		
	}
	
	@When("select options option2 {string}")
	public void select_option2(String string) throws InterruptedException {
		//driver.findElement(By.xpath("//*[@id='dropdown']"));
		Select select= new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText(string);
        Thread.sleep(3000);
		
	}
		@When("Navigate back to browser")
		public void Navigate_back() throws InterruptedException {
			driver.navigate().back();
			Thread.sleep(2000);
			
		}
		@When("click Checkboxes Link")
		public void click_Checkboxes_Link(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			List<List<String>>data = dataTable.cells();
			driver.findElement(By.xpath("//a[text()=" +"'"+data.get(0).get(0)+"'"+ "]")).click();
			Thread.sleep(2000);
			
		}
		
		
//		@When("select Checkboxes Value")
//		public void select_checkbox_values(DataTable Values) throws InterruptedException{
//			List<List<String>> data=Values.cells();
//			driver.findElement(By.linkText("Checkboxes")).click();
//			driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();
//			driver.close();	}
		
		@When("select Checkboxes Value")
		public void Checkbox_value() throws InterruptedException {
			driver.findElement(By.linkText("Checkboxes")).click();
			driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
			Thread.sleep(2000);
			
		}
//		@When("Enter the URL {string}")
//		public void enter_the_URL1(String url) {
//			driver.get(url);

//	}
		
		@When("Click on file Upload upload a file")
		public void Click_on_file_Upload_upload_a_file() throws InterruptedException {
			driver.findElement(By.linkText("File Upload")).click();
			Thread.sleep(2000);
			
			WebElement uploadElement = driver.findElement(By.id("file-upload"));
			uploadElement.sendKeys("E:\\Image 1.jpg");
			Thread.sleep(2000);
			
		}	
		@Then("File Uploaded Sucessfully")
		public void file_uploaded() {
			System.out.println("File Uploaded Successfully");
		}
	
		@After
		public void AfterHook()  {
			driver.close();
			System.out.println("Browser closed");

		}
}