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

public class JCSearchEditTestimonialImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCSearchEditTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
	}
	
//	background
	@When("Admin login dan membuka halaman testimonials search edit")
	public void admin_login_dan_membuka_halaman_testimonials_search_edit() {
		JCAdminTes.goToHome();
		JCAdminTes.goToTestimonial();
		extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman testimonials search edit");
	}

//	search edit gambar
	@When("TE051P Admin mengetikkan nama peserta search edit")
	public void te051p_admin_mengetikkan_nama_peserta_search_edit() {
		JCAdminTes.searchEditNamaPeserta();
		extentTest.log(LogStatus.PASS, "TE051P Admin mengetikkan nama peserta search edit");
	}

	@And("TE051P Admin menekan enter pada keyboard search edit")
	public void te051p_admin_menekan_enter_pada_keyboard_search_edit() {
		JCAdminTes.tekanEnter();
		extentTest.log(LogStatus.PASS, "TE051P Admin menekan enter pada keyboard search edit");
	}

	@And("TE051P Data ditemukan dan admin klik data search edit")
	public void te051p_data_ditemukan_dan_admin_klik_data_search_edit() {
	    JCAdminTes.editClickDataSearch();
	    extentTest.log(LogStatus.PASS, "TE051P Data ditemukan dan admin klik data search edit");
	}

	@And("TE051P Admin mengedit ulang gambar peserta search edit")
	public void te051p_admin_mengedit_ulang_gambar_peserta_search_edit() {
	    JCAdminTes.editGambarSearch();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE051P Admin mengedit ulang gambar peserta search edit");
	}

	@And("TE051P Admin menekan tombol simpan gambar search edit")
	public void te051p_admin_menekan_tombol_simpan_gambar_search_edit() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE051P Admin menekan tombol simpan gambar search edit");
	}

	@Then("TE051P Admin berhasil edit gambar search edit")
	public void te051p_admin_berhasil_edit_gambar_search_edit() {
		extentTest.log(LogStatus.PASS, "TE051P Admin berhasil edit gambar search edit");
	}
	
//	search edit nama
	@When("TE052P Admin mengetikkan nama peserta search edit nama")
	public void te052p_admin_mengetikkan_nama_peserta_search_edit_nama() {
		JCAdminTes.searchEditNamaPeserta();
		extentTest.log(LogStatus.PASS, "TE052P Admin mengetikkan nama peserta search edit nama");
	}

	@And("TE052P Admin menekan enter pada keyboard search edit nama")
	public void te052p_admin_menekan_enter_pada_keyboard_search_edit_nama() {
		JCAdminTes.tekanEnter();
		extentTest.log(LogStatus.PASS, "TE052P Admin menekan enter pada keyboard search edit nama");
	}

	@And("TE052P Data ditemukan dan admin klik data search edit nama")
	public void te052p_data_ditemukan_dan_admin_klik_data_search_edit_nama() {
		JCAdminTes.editClickDataSearch();
	    extentTest.log(LogStatus.PASS, "TE052P Data ditemukan dan admin klik data search edit nama");
	}

	@And("TE052P Admin mengedit ulang nama peserta search edit nama")
	public void te052p_admin_mengedit_ulang_nama_peserta_search_edit_nama() {
		JCAdminTes.editNamaPesertaSearch();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE052P Admin mengedit ulang nama peserta search edit nama");
	}

	@And("TE052P Admin menekan tombol simpan nama search edit nama")
	public void te052p_admin_menekan_tombol_simpan_nama_search_edit_nama() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE052P Admin menekan tombol simpan nama search edit nama");
	}

	@Then("TE052P Admin berhasil edit nama search edit nama")
	public void te052p_admin_berhasil_edit_nama_search_edit_nama() {
		extentTest.log(LogStatus.PASS,"TE052P Admin berhasil edit nama search edit nama");
	}
	
//	search edit isi
	@When("TE053P Admin mengetikkan nama peserta search edit isi")
	public void te053p_admin_mengetikkan_nama_peserta_search_edit_isi() {
		JCAdminTes.searchEditNamaPeserta();
		extentTest.log(LogStatus.PASS, "TE053P Admin mengetikkan nama peserta search edit isi");
	}

	@And("TE053P Admin menekan enter pada keyboard search edit isi")
	public void te053p_admin_menekan_enter_pada_keyboard_search_edit_isi() {
		JCAdminTes.tekanEnter();
		extentTest.log(LogStatus.PASS, "TE053P Admin menekan enter pada keyboard search edit isi");
	}

	@And("TE053P Data ditemukan dan admin klik data search edit isi")
	public void te053p_data_ditemukan_dan_admin_klik_data_search_edit_isi() {
		JCAdminTes.editClickDataSearch();
	    extentTest.log(LogStatus.PASS, "TE053P Data ditemukan dan admin klik data search edit isi");
	}

	@And("TE053P Admin mengedit ulang isi testimonial search edit isi")
	public void te053p_admin_mengedit_ulang_isi_testimonial_search_edit_isi() {
		JCAdminTes.editIsiTestiSearch();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE053P Admin mengedit ulang isi testimonial search edit isi");
	}

	@And("TE053P Admin menekan tombol simpan search edit isi")
	public void te053p_admin_menekan_tombol_simpan_search_edit_isi() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE053P Admin menekan tombol simpan search edit isi");
	}

	@Then("TE053P Admin berhasil edit isi search edit isi")
	public void te053p_admin_berhasil_edit_isi_search_edit_isi() {
		extentTest.log(LogStatus.PASS, "TE053P Admin berhasil edit isi search edit isi");
	}
	
}