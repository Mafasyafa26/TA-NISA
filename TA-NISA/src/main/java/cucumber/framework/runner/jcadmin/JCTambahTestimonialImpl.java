package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminLoginPage;
import cucumber.framework.page.jcadmin.JCAdminTestimonial;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCTambahTestimonialImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCTambahTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
		
	}
	
	//background
	@Given("Admin login dan membuka halaman testimonials tambah")
	public void admin_login_dan_membuka_halaman_testimonials_tambah() {
		JCAdminTes.goToHome();
	    JCAdminTes.goToTestimonial();
	    extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman testimonials tambah");
	}

	@When("Admin klik tombol tambah testimonial tambah")
	public void admin_klik_tombol_tambah_testimonial_tambah() {
		JCAdminTes.goToTambahTesti();
		extentTest.log(LogStatus.PASS, "Admin klik tombol tambah testimonial tambah");
	}
	//background

	//publish active
	@When("^(.*)Admin mengisi form dengan rating (.*) active$")
	public void admin_mengisi_form_dengan_rating_angka_rating_active(String strKodeTest,String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialPublishActive(strRate);
		extentTest.log(LogStatus.PASS, "Admin mengisi form dengan rating "+strRate+ " publish active");
	}

	@And("^(.*) Admin menekan tombol simpan testimonial active$")
	public void admin_menekan_tombol_simpan_testimonial_active(String strKode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan testimonial active");
	}

	@Then("^(.*) Admin menambah testimonial active valid$")
	public void admin_menambah_testimonial_active_valid(String strKode) {
		assertTrue(JCAdminTes.getTxtTestimonial().contains("List Testimonial"));
		extentTest.log(LogStatus.PASS, "Admin menambah testimonial active valid");
	}

//	publish no active
	@When("^(.*)Admin mengisi form dengan rating (.*) noactive$")
	public void admin_mengisi_form_dengan_rating_angka_rating_noactive(String strKodeTest,String strRate) {
		Utils.fullScroll();
		JCAdminTes.tambahDataTestimonialPublishNoActive(strRate);
		extentTest.log(LogStatus.PASS, "Admin mengisi form dengan rating "+strRate+ " publish noactive");
	}

	@And("^(.*) Admin menekan tombol simpan testimonial no active$")
	public void admin_menekan_tombol_simpan_testimonial_no_active(String strKode) {
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan testimonial active");
	}

	@Then("^(.*) Admin menambah testimonial noactive valid$")
	public void admin_menambah_testimonial_noactive_valid(String strKode) {
		assertTrue(JCAdminTes.getTxtTestimonial().contains("List Testimonial"));
		extentTest.log(LogStatus.PASS, "Admin menambah testimonial noactive valid");
	}
	
}