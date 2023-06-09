package ExcelReader_stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.aventstack.extentreports.Status;

import com.utility.Config;
import com.utility.ExcelReader;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.DoctorsPage;
import com.pages.LandingPage;
import com.pages.OnlineDoctorconsultPage;

public class ExcelReader_valid_Steps extends Utility {

	public LandingPage ldp;
	public OnlineDoctorconsultPage odcp;
	public DoctorsPage dp;
	ExcelReader reader;

	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		odcp = new OnlineDoctorconsultPage();
		dp = new DoctorsPage();

	}

	@Given("Chrome is opened and Apollo247 app is opened")
	public void chrome_is_opened_and_apollo247_app_is_opened() throws Exception {
		objectMethod();
		Utility.implicitWait();
		String actualtitle = ldp.validateLandingPageTitle();
		String expectedtitle = "Apollo 247 - Online Doctor Consultation & Book Lab Tests at Home";
		assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle);
		Thread.sleep(7000);
		ldp.notification_close();
		System.out.println(ldp.elementDispaly());
		ldp.captureScreenshot();
		logger = report.createTest("test02");
		logger.log(Status.INFO, "Chrome is opened and Apollo247 app is opened");

	}

	@When("User clicks on Consult Section")
	public void user_clicks_on_consult_section() throws Exception {
		objectMethod();
		Thread.sleep(5000);
		ldp.OnlineDoctorconsultPageNavigation();
		Thread.sleep(5000);
		logger.log(Status.INFO, "Chrome is opened and Apollo247 app is opened");

	}

	@Then("User navigates on the Consult Page")
	public void user_navigates_on_the_consult_page() throws InterruptedException {
		Thread.sleep(2000);
		logger.log(Status.INFO, "Chrome is opened and Apollo247 app is opened");

	}

	@When("User clicks on popular cities")
	public void user_clicks_on_popular_cities() throws InterruptedException, IOException {
		objectMethod();
//		Click on the delhi button
		dp.delhi_button();
		Thread.sleep(3000);
		logger.log(Status.INFO, "User clicks on popular cities");

	}

	@Then("Doctors detail fields are visible to user")
	public void doctors_detail_fields_are_visible_to_user() throws Exception {
		Thread.sleep(2000);
		dp.captureScreenshot();
		logger.log(Status.INFO, "Doctors detail fields are visible to user");

	}

	@When("User clicks on sort by Field")
	public void user_clicks_on_sort_by_field() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(5000);
		dp.filter();
		logger.log(Status.INFO, "User clicks on sort by Field");

	}

	@When("User selects Price- Low to High")
	public void user_selects_price_low_to_high() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(3000);

		dp.lowhigh();
		Thread.sleep(3000);
		logger.log(Status.INFO, "User selects Price- Low to High");

	}

	@Then("Application sorts the doctors list based on price")
	public void application_sorts_the_doctors_list_based_on_price() {

	}

	@Then("User Clicks on the Book Hospital Visit button")
	public void user_clicks_on_the_book_hospital_visit_button() throws IOException, InterruptedException {
		objectMethod();
		dp.book_hospital();
		Thread.sleep(4000);
		logger.log(Status.INFO, "User Clicks on the Book Hospital Visit button");

	}

	@When("User enters contact number from sheetname {string} and rownumber {int}")
	public void user_enters_contact_number_from_sheetname_and_rownumber(String SheetName, Integer rowNumber)
			throws InterruptedException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {

		Thread.sleep(10000);
		objectMethod();
		reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(Config.excelPath, SheetName);

		String Mobile = testData.get(rowNumber).get("contact");
		dp.login_page(Mobile);

		Thread.sleep(5000);
		logger.log(Status.INFO, "User enters contact number from sheetname {string} and rownumber {int}");

	}

	@Then("User click on arrow button")
	public void user_click_on_arrow_button() throws IOException, InterruptedException {
		objectMethod();
		dp.arrow_first();
		Thread.sleep(4000);
		logger.log(Status.INFO, "User click on arrow button");

	}

	@Then("User enters OTP and clicks on arrow button")
	public void user_enters_otp_and_clicks_on_arrow_button() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(15000);
		dp.arrow_second();
		Thread.sleep(15000);
		logger.log(Status.INFO, "User enters OTP and clicks on arrow button");

	}

	@Then("It shows Booking Details option with Payment checkout page")
	public void it_shows_booking_details_option_with_payment_checkout_page() throws Exception {
		objectMethod();
		dp.book_hospital_final();
		ldp.captureScreenshot();
		Thread.sleep(5000);
		ldp.captureScreenshot();
		Thread.sleep(7000);
		logger.log(Status.INFO, "It shows Booking Details option with Payment checkout page");

		System.out.println("********** USER HAS BOOKED THE APPOINTMENT ************");

	}

	@Then("User enters Wrong OTP sheetname {string} and rownumber {int} and clicks on arrow button")
	public void user_enters_wrong_otp_sheetname_and_rownumber_and_clicks_on_arrow_button(String SheetName,
			Integer RowNumber) throws IOException, InterruptedException, InvalidFormatException {
		Thread.sleep(7000);
		objectMethod();
		reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(Config.excelPath, SheetName);

		String otp = testData.get(RowNumber).get("otp");
		dp.invalidotp(otp);
		Thread.sleep(5000);
		System.out.println("User Entered Wrong OTP For login");

		logger.log(Status.INFO, "User enters contact number from sheetname {string} and rownumber {int}");

	}

	@Then("User is not able to login sucessfully")
	public void user_is_not_able_to_login_sucessfully() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(5000);
		logger.log(Status.INFO, "User is not able to login sucessfully");

	}

}
