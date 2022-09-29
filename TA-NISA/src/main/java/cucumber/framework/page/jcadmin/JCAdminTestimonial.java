package cucumber.framework.page.jcadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class JCAdminTestimonial extends JCAdminLoginPage {
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;

	public JCAdminTestimonial() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		super.LoginPage("ucen1315@gmail.com", "a");
	}
	@FindBy(linkText = "Home")
	private WebElement btnHome;
	@FindBy(linkText = "Testimonial")
	private WebElement btnTestimonial;
	@FindBy(linkText = "Tambahh")
	private WebElement btnTambahhTestimonial;
	@FindBy(xpath = "//h3[normalize-space()='List Testimonial']")
	private WebElement txtLaman;
	
	//form tambah testimonial
	@FindBy(css = "input[name='uploadedFile']")
	private WebElement upload;
	@FindBy(name = "nama")
	private WebElement nama;
	@FindBy(id = "exampleFormControlSelect9")
	private WebElement selPublish;
	@FindBy(name = "body")
	private WebElement isiTesti;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[5]/div[1]/select[1]")
	private WebElement selRating;	
	
	@FindBy(xpath = "//input[@name='mysubmit']")
	private WebElement btnSubmit;
	
	public void goToHome() {
		this.btnHome.click();
	}
	public void goToTestimonial() {
		this.btnTestimonial.click();
	}
	
	public void goToTambahTesti() {
		this.btnTambahhTestimonial.click();
	}
	
	public void tambahDataTestimonialPublish(String statss){
		this.upload.click();
//		uploadFile();
//		this.upload.click();
//		this.upload.sendKeys("C:\\fakepath\\shutterstock.jpeg");
//		this.nama.sendKeys("Budi");
//		Select selPublish = new Select(this.selPublish);
//		selPublish.selectByVisibleText(statss);
		Utils.delay(3, strDelay);
//		this.isiTesti.sendKeys("Juara Coding the best");
//		Utils.delay(3, strDelay);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		selRating.click();
//		pilihRating(2);
	}
	
	public void uploadFile() {
		 //identify element and click
	      upload.click();
		StringSelection s = new StringSelection("C:\\Users\\NEXSOFT\\Downloads\\shutterstock.jpeg");
	      // Clipboard copy
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	      // Robot object creation
	      Robot rbt;
		try {
			rbt = new Robot();
		      //pressing ctrl+v
		      rbt.keyPress(KeyEvent.VK_CONTROL);
		      rbt.keyPress(KeyEvent.VK_V);
		      //releasing ctrl+v
		      rbt.keyRelease(KeyEvent.VK_CONTROL);
		      rbt.keyRelease(KeyEvent.VK_V);
		      //pressing enter
		      rbt.keyPress(KeyEvent.VK_ENTER);
		      //releasing enter
		      rbt.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickSimpan() {
		//scroll + click simpan
		this.btnSubmit.click();
		Utils.delay(2, strDelay);
		try {
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_TAB);
			rbt.keyRelease(KeyEvent.VK_TAB);
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.delay(4, strDelay);
	}
	
	public String getTxtTestimonial() {
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(txtLaman)).getText();
	}
	
	public void pilihRating(int nilaiRate) {
		try {
			Robot rbt = new Robot();
			for (int i= 0; i<nilaiRate;i++) {
				rbt.keyPress(KeyEvent.VK_DOWN);
				rbt.keyRelease(KeyEvent.VK_DOWN);
			}
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
//	driver.get("https://dev.ptdika.com/web_jc_v2/index.php/admin#");
//    driver.findElement(By.linkText("Home")).click();
//    driver.findElement(By.linkText("Testimonial")).click();
//    driver.findElement(By.linkText("Tambahh")).click();
//    driver.findElement(By.name("uploadedFile")).click();
//    driver.findElement(By.name("uploadedFile")).clear();
//    driver.findElement(By.name("uploadedFile")).sendKeys("C:\\fakepath\\shutterstock.jpeg");
//    driver.findElement(By.name("nama")).click();
//    driver.findElement(By.name("nama")).clear();
//    driver.findElement(By.name("nama")).sendKeys("Siapa");
//    driver.findElement(By.id("exampleFormControlSelect9")).click();
//    driver.findElement(By.xpath("//option[@value='1']")).click();
//    driver.findElement(By.name("body")).click();
//    driver.findElement(By.name("body")).clear();
//    driver.findElement(By.name("body")).sendKeys("Sangat bagus");
//    driver.findElement(By.id("rating")).click();
//    new Select(driver.findElement(By.id("rating"))).selectByVisibleText("2");
//    driver.findElement(By.xpath("//option[@value='2']")).click();
//    driver.findElement(By.name("mysubmit")).click();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div[2]/div/div/div/div")).click();
	
	
}
