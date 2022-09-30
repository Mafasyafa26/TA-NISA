package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminLoginInvalidImpl {

	private static WebDriver driver;
	private static ExtentTest extentTest; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	private JCAdminLoginPage JCAdminLogin = new JCAdminLoginPage();
	
	public JCAdminLoginInvalidImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
	}
	
//	background
	@When("Admin membuka browser JCAdmin")
	public void admin_membuka_browser_jcadmin() {
		driver.get(Constants.URL_JCADMIN_LOGIN);
		extentTest.log(LogStatus.PASS, "Admin membuka browser JCAdmin");
	}

//	Scenario: Admin invalid login simpan
	@When("Admin klik button simpan2")
	public void admin_klik_button_simpan2() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik button simpan2");
	}

	@Then("Admin gagal login simpan2")
	public void admin_gagal_login_simpan2() {
		assertTrue(JCAdminLogin.getTxtKosong(5).contains("Oops..."));
		extentTest.log(LogStatus.PASS, "Admin gagal login simpan2");
	}

//	Scenario: Admin invalid login klik submit
	@When("Admin klik username dan password2")
	public void admin_klik_username_dan_password2() {
		JCAdminLogin.LoginPageInvalidClick();
		extentTest.log(LogStatus.PASS, "Admin klik username dan password2");
	}

	@And("Admin klik button simpan klik2")
	public void admin_klik_button_simpan_klik2() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik button simpan klik2");
	}

	@Then("Admin gagal login klik submit2")
	public void admin_gagal_login_klik_submit2() {
		assertTrue(JCAdminLogin.getTxtKosong(5).contains("Oops..."));
		extentTest.log(LogStatus.PASS, "Admin gagal login klik submit2");
	}

//	Scenario: Admin invalid login input username
	@When("Admin input username2")
	public void admin_input_username2() {
		JCAdminLogin.LoginPageInvalidUname("ucen1315@gmail.com");
		extentTest.log(LogStatus.PASS, "Admin input username2");
	}

	@And("Admin klik button simpan input uname2")
	public void admin_klik_button_simpan_input_uname2() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik button simpan input uname2");
	}

	@Then("Admin gagal login input uname2")
	public void admin_gagal_login_input_uname2() {
		assertTrue(JCAdminLogin.getTxtKosong(5).contains("Oops..."));
		extentTest.log(LogStatus.PASS, "Admin gagal login input uname2");
	}

//	Scenario: Admin invalid login input password
	@When("Admin input password2")
	public void admin_input_password2() {
		JCAdminLogin.LoginPageInvalidPass("a");
		extentTest.log(LogStatus.PASS, "Admin input password2");
	}

	@And("Admin klik button simpan input pass2")
	public void admin_klik_button_simpan_input_pass2() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik button simpan input pass2");
	}

	@Then("Admin gagal login input pass2")
	public void admin_gagal_login_input_pass2() {
		assertTrue(JCAdminLogin.getTxtKosong(5).contains("Oops..."));
		extentTest.log(LogStatus.PASS, "Admin gagal login input pass2");
	}

//	Scenario: Admin invalid login input password uppercase
	@When("Admin input username dan password upper2")
	public void admin_input_username_dan_password_upper2() {
		JCAdminLogin.LoginPageValid("ucen1315@gmail.com", "A");
		extentTest.log(LogStatus.PASS, "Admin input username dan password upper2");
	}

	@And("Admin klik button simpan input pass upper2")
	public void admin_klik_button_simpan_input_pass_upper2() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik button simpan input pass upper2");
	}

	@Then("Admin gagal login input pass upper2")
	public void admin_gagal_login_input_pass_upper2() {
		assertTrue(JCAdminLogin.getTxtSalah(5).contains("Username Atau Password Salah"));
		extentTest.log(LogStatus.PASS, "Admin gagal login input pass upper2");
	}

//	Scenario: Admin invalid login upper
	@When("Admin input upper username dan password2")
	public void admin_input_upper_username_dan_password2() {
		JCAdminLogin.LoginPageInvalid("UCEN1315@GMAIL.COM", "A");
		extentTest.log(LogStatus.PASS, "Admin input upper username dan password2");
	}

	@And("Admin klik button simpan upper2")
	public void admin_klik_button_simpan_upper2() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik button simpan upper2");;
	}

	@Then("Admin gagal login upper2")
	public void admin_gagal_login_upper2() {
		assertTrue(JCAdminLogin.getTxtSalah(5).contains("Username Atau Password Salah"));
		extentTest.log(LogStatus.PASS, "Admin gagal login upper2");
	}

//	Scenario: Admin invalid login input spasi
	@When("Admin input username dan password spasi2")
	public void admin_input_username_dan_password_spasi2() {
		JCAdminLogin.LoginPageInvalid(" ", " ");
		extentTest.log(LogStatus.PASS, "Admin input username dan password spasi2");
	}

	@And("Admin klik button simpan spasi2")
	public void admin_klik_button_simpan_spasi2() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik button simpan spasi2");
	}

	@Then("Admin gagal login input spasi2")
	public void admin_gagal_login_input_spasi2() {
		assertTrue(JCAdminLogin.getTxtSalah(5).contains("Username Atau Password Salah"));
		extentTest.log(LogStatus.PASS, "Admin gagal login input spasi2");
	}

//	Scenario: Admin invalid login user tanpa format email
	@When("Admin input username dan password tanpa format2")
	public void admin_input_username_dan_password_tanpa_format2() {
		JCAdminLogin.LoginPageInvalid("ucen1315", "a");
		extentTest.log(LogStatus.PASS, "Admin input username dan password tanpa format2");
	}

	@And("Admin klik button simpan tanpa format2")
	public void admin_klik_button_simpan_tanpa_format2() {
		JCAdminLogin.btnSimpan();
		extentTest.log(LogStatus.PASS, "Admin klik button simpan tanpa format2");
	}

	@Then("Admin gagal login tanpa format2")
	public void admin_gagal_login_tanpa_format2() {
		assertTrue(JCAdminLogin.getTxtSalah(5).contains("Username Atau Password Salah"));
		extentTest.log(LogStatus.PASS, "Admin gagal login input tanpa format2");
	}

}
