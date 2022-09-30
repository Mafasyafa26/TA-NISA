package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminTestimonial;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminLoginValidImpl {

	private static WebDriver driver;
	private static ExtentTest extentTest; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	private JCAdminTestimonial JCAdminTes = new JCAdminTestimonial();
	
	public JCAdminLoginValidImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
	}
	
//	bg
	@When("Admin membuka browser JC")
	public void admin_membuka_browser_jc() {
		System.out.println("========ADMIN BUKAA==============");
		driver.get(Constants.URL_JCADMIN_LOGIN);
		extentTest.log(LogStatus.PASS, "Admin membuka browser JC");
	}
	
//	user valid
	@When("Admin input valid username dan password")
	public void admin_input_valid_username_dan_password() {
	    JCAdminTes.LoginPageValid("ucen1315@gmail.com", "a");
		extentTest.log(LogStatus.PASS, "Admin input valid username dan password");
	}

	@And("Admin klik button simpan")
	public void admin_klik_button_simpan() {
	    JCAdminTes.btnSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik button simpan");
	}

	@Then("Admin berhasil login")
	public void admin_berhasil_login() {
		assertTrue(JCAdminTes.getTxtName(5).contains("banna"));
		extentTest.log(LogStatus.PASS, "Admin berhasil login");
	}

//	user valid upper
	@When("^Admin input (.*) dan (.*) upper&")
	public void admin_input_username_dan_password_upper(String user, String pass) {
	    JCAdminTes.LoginPageValid(user, pass);
		extentTest.log(LogStatus.PASS, "Admin input username dan password upper");
	}

	@And("Admin klik button simpan upper")
	public void admin_klik_button_simpan_upper() {
	    JCAdminTes.btnSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik button simpan upper");
	}

	@Then("Admin berhasil login upper")
	public void admin_berhasil_login_upper() {
		assertTrue(JCAdminTes.getTxtName(5).contains("banna"));
		extentTest.log(LogStatus.PASS, "Admin berhasil login upper");
	}

//	user valid uplow
	@When("^Admin input (.*) dan (.*) uplow$")
	public void admin_input_username_dan_password_uplow(String usern, String passw) {
		JCAdminTes.LoginPageValid(usern, passw);
		extentTest.log(LogStatus.PASS, "Admin input username dan password upper");
	}

	@And("Admin klik button simpan uplow")
	public void admin_klik_button_simpan_uplow() {
		JCAdminTes.btnSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik button simpan upper");
	}

	@Then("Admin berhasil login uplow")
	public void admin_berhasil_login_uplow() {
		assertTrue(JCAdminTes.getTxtName(5).contains("banna"));
		extentTest.log(LogStatus.PASS, "Admin berhasil login upper");
	}

	
}
