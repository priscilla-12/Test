package TestRunner;


	import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\priscilla.d\\eclipse-workspace\\CucumberSample\\src\\test\\java\\Features\\Loginherokuapp.feature",
			glue={"StepDefinitions","Hooks"},
			tags = "@tag3",
			dryRun=false,		
			plugin= {"pretty"},
			monochrome = true
			//tags = {'@Regression'}
			
			)

	public class Runner1 {
		public void click_on_dropdown_menu() {
		}
		
		
		public void select_value() {
			
		}
		public void select_option1(String string) {
			
		}
		public void select_option2(String string) {
			
		}
		public void Navigate_back() {
			
		}
		public void Checkbox_value() {
			
		}
		public void click_Checkboxes_Link(DataTable dataTable) {
			
		}
		
		public void Click_on_file_Upload_upload_a_file() {
			
		}
		public void file_uploaded() {
			
		}
		}
	


	