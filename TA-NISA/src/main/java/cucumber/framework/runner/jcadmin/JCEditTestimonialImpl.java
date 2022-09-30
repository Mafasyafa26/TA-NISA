package cucumber.framework.runner.jcadmin;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminTestimonial;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCEditTestimonialImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCEditTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
		
	}
	//INI BACKGROUND
	@When("Admin login dan membuka halaman testimonials")
	public void admin_login_dan_membuka_halaman_testimonial() {
	    JCAdminTes.goToHome();
		JCAdminTes.goToTestimonial();
		extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman testimonials");
	}

	@And("Admin klik tombol edit testimonial pertama")
	public void admin_klik_tombol_edit_testimonial_pertama() {
	    JCAdminTes.editClickDataPertama();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol edit testimonial pertama");
	}
	//INI AKHIR BACKGROUND
	
	@When("Admin mengedit nama peserta")
	public void admin_mengedit_nama_peserta() {
		System.out.println("INI DARI ADMIN EDIT NAMA");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editNamaPeserta();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "Admin mengedit nama peserta");
	}

	@And("Admin menekan tombol simpan edit nama peserta")
	public void admin_menekan_tombol_simpan_edit_nama_peserta() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan edit nama peserta");
	}

	@Then("Admin berhasil edit nama peserta")
	public void admin_berhasil_edit_nama_peserta() {
		
	    System.out.println("nama peserta sudah diedit");
	}

//	@When("^Admin mengedit harga awal dengan (.*)$")
//	public void admin_mengedit_harga_awal_dengan_harga_awal(String hargaSekarang) {
//	    // edit harga awal 
//		JCAdminRB.editHargaAwal(hargaSekarang);
//	}
//
//	@When("Admin menekan tombol simpan edit harga awal")
//	public void admin_menekan_tombol_simpan_edit_harga_awal() {
//	    //admin menekan tombol simpan edit harga 
//		System.out.println("admin simpan edit harga awal");
//		
//	}
//
//	@Then("Admin mengedit harga awal")
//	public void admin_mengedit_harga_awal() {
//	    System.out.println("admin mengedit harga awal");
//	}

}
