package cucumber.framework.page.jcadmin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class JCAdminLoginPage {
	
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;

	public JCAdminLoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
//	validasi
	@FindBy(xpath = "//span[normalize-space()='husaini al banna']")
	private WebElement txtName;
	@FindBy(xpath = "//h2[@id='swal2-title']")
	private WebElement txtKosong;
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement btnKosong;
	@FindBy(xpath = "//p[@class='alert alert-warning']")
	private WebElement txtSalah;

	//scenario
		public void LoginPage(String username, String password) {
			this.username.sendKeys(username); //step
			Utils.delay(1, strDelay);
			this.password.sendKeys(password);
			Utils.delay(1, strDelay);
			this.btnSimpan();
		}
		
		public void LoginPageValid(String username, String password) {
			this.username.sendKeys(username); //step
			Utils.delay(1, strDelay);
			this.password.sendKeys(password);
			Utils.delay(1, strDelay);
		}

		public String getTxtName(int delays) {
			return new WebDriverWait(driver, Duration.ofSeconds(15))
					.until(ExpectedConditions.visibilityOf(txtName)).getText();
		}
		
		public void btnSimpan() {
			this.btnLogin.click();
		}
		
		
}
