package cucumber.framework.page.jcadmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;

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
	
	//form tambah testimonial
	@FindBy(name = "uploadedFile")
	private WebElement upload;
	@FindBy(name = "nama")
	private WebElement nama;
	@FindBy(id = "exampleFormControlSelect9")
	private WebElement selPublish;
	@FindBy(id = "body")
	private WebElement isiTesti;
	@FindBy(id = "rating")
	private WebElement selRating;
	@FindBy(name = "mysubmit")
	private WebElement btnSubmit;
	
	
	public void tambahDataRincianBiaya() {
		this.btnHome.click();
		this.btnTestimonial.click();
		this.btnTambahhTestimonial.click();
		this.upload.click();
		this.upload.sendKeys("C:\\fakepath\\shutterstock.jpeg");
		this.nama.sendKeys("Namaku Budi");
		selPublish.click();
		Select selPublish = new Select(driver.findElement(By.id("exampleFormControlSelect9")));
		selPublish.selectByVisibleText("Active");
		this.isiTesti.sendKeys("Juara Coding the best");
		selRating.click();
		Select selRating = new Select(driver.findElement(By.id("rating")));
		selRating.selectByVisibleText("0");
		this.btnSubmit.click();
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
