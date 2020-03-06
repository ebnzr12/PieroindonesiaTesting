package caraBelanja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cara {

	WebDriver driver;
@Given("^buka firefox dan mulai aplikasinya$")
public void buka_firefox_dan_mulai_aplikasinya() throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\GeckoDriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.pieroindonesia.com/");
}

@Then("^click login$")
public void click_login() throws Throwable {
	driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[3]/div[1]/div/div/ul/li/a")).click();
}

@When("^masukkan email dan password")
public void masukkan_email_dan_password() throws Throwable {
	driver.findElement(By.id("email")).sendKeys("ebensiagian99@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Siregar12");
}
@Then("^masuk ke halaman utama$")
	public void masuk_ke_halaman_utama() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
}

@Then("^click cara belanja")
public void click_cara_belanja() throws Throwable{
	driver.findElement(By.xpath("/html/body/div[1]/footer/div/div[1]/div/div[2]/ul/li[2]/a")).click();
}
}
