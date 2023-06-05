package doctor_consult_stepdefinitions_1;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.pages.DoctorsPage;
import com.pages.LandingPage;
import com.pages.OnlineDoctorconsultPage;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Doctor_consult_page_steps_1 extends Utility {
//	WebDriver driver;

	public LandingPage ldp;
	public OnlineDoctorconsultPage odcp;
	public DoctorsPage dp;
	
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		odcp = new OnlineDoctorconsultPage();
		dp = new DoctorsPage();

	}
	
	@Given("Chrome is opened and Apollo247 app is opened")
	public void chrome_is_opened_and_apollo247_app_is_opened() throws Exception {

		objectMethod();
		Thread.sleep(5000);
		String actualtitle = ldp.validateLandingPageTitle();
		String expectedtitle = "Apollo 247 - Online Doctor Consultation & Book Lab Tests at Home";
		assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle); 

//		ldp.notification_close();
	    ldp.captureScreenshot();
	    Thread.sleep(2000);
	    
	    logger = report.createTest("test01");
	    logger.log(Status.INFO, "Validating landing page title");


		
		
	
	}
	@When("User clicks on Consult Section")
	public void user_clicks_on_consult_section() throws Exception {
		objectMethod();
	    Thread.sleep(5000);
	    ldp.OnlineDoctorconsultPageNavigation();
	    Thread.sleep(5000);
	    
	    
//	    String actualText = ldp.textCapture();
//	    String expectedText = "Online Doctor Consultation";
//	    assertEquals(expectedText, actualText);
//		System.out.println(actualText); 
//
//		Thread.sleep(2000);
	    
	}
	@Then("User navigates on the Consult Page")
	public void user_navigates_on_the_consult_page() throws InterruptedException {
		Thread.sleep(2000);
		

	}


	@When("User clicks on popular cities")
	public void user_clicks_on_popular_cities() throws InterruptedException, IOException {
		objectMethod();
//		Click on the delhi button
	    dp.delhi_button();
	    Thread.sleep(5000);
		

	}
	@Then("User naviagtes to Doctors Details Page")
	public void user_naviagtes_to_doctors_details_page() throws InterruptedException {
		Thread.sleep(2000);


	}
	@Then("Doctors detail fields are visible to user")
	public void doctors_detail_fields_are_visible_to_user() throws InterruptedException {
		Thread.sleep(2000);


	}
	




	@When("User clicks on sort by Field")
	public void user_clicks_on_sort_by_field() throws IOException, InterruptedException {
		objectMethod();
	    Thread.sleep(5000);
	    dp.filter();
	    Thread.sleep(5000);

		

	}
	@When("User selects Price- Low to High")
	public void user_selects_price_low_to_high() throws IOException, InterruptedException {
		objectMethod();
		dp.lowhigh();
	    Thread.sleep(3000);

		


	}
	@Then("Application sorts the doctors list based on price")
	public void application_sorts_the_doctors_list_based_on_price() {

	}
	
	@Then("User clicks on Book Hospital Visit Button")
	public void user_clicks_on_book_hospital_visit_button() throws IOException, InterruptedException {
		objectMethod();

		dp.book_hospital();
	    Thread.sleep(4000);

	   
	}


	}











	




	
	
	
	
	


