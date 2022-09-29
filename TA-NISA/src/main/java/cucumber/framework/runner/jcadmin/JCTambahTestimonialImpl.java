package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.hrms.LoginPage;
import cucumber.framework.page.jcadmin.JCAdminLoginPage;
import cucumber.framework.page.jcadmin.JCAdminTestimonial;
import cucumber.framework.runner.hrms.sceneoutlinefix.SceneOutlineHooks;
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
	
	@Given("Admin login dan membuka halaman testimonial")
	public void admin_login_dan_membuka_halaman_testimonial() {
		JCAdminTes.goToHome();
	    JCAdminTes.goToTestimonial();
	}

	@When("Admin klik tombol tambah")
	public void admin_klik_tombol_tambah() {
		JCAdminTes.goToTambahTesti();
	}

	@And("^Admin mengisi form dengan publish (.*)$")
	public void admin_mengisi_form_dengan_publish_active(String stat) {
		JCAdminTes.tambahDataTestimonialPublish(stat);
	}

	@And("Admin menekan tombol simpan")
	public void admin_menekan_tombol_simpan() {
		JCAdminTes.clickSimpan();
	}

	@Then("Admin menambah testimonial active valid")
	public void admin_menambah_testimonial_active_valid() {
		assertTrue(JCAdminTes.getTxtTestimonial().contains("List Testimonial"));
	}

}
