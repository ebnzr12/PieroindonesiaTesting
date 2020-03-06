package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
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

@When("^masukkan email dan password satu")
public void masukkan_email_dan_password_satu() throws Throwable {
	driver.findElement(By.id("email")).sendKeys("ebensiagian99@yahoo.co.id");
	driver.findElement(By.id("pass")).sendKeys("Siregar12");
}

@When("^masukkan email dan password dua")
public void masukkan_email_dan_password_dua() throws Throwable {
	driver.findElement(By.id("email")).sendKeys("ebensiagian99@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Siregar124444");
}
	
@When("^masukkan email dan password tiga")
public void masukkan_email_dan_password_tiga() throws Throwable {
	driver.findElement(By.id("email")).sendKeys("11ebensiagian99@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("ffSiregar12");
}



}
