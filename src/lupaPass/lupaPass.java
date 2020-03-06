package lupaPass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lupaPass {
	WebDriver driver;
@Given("^buka firefox dan mulai aplikasinya$")
public void buka_firefox_dan_mulai_aplikasinya() throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\GeckoDriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://pieroindonesia.com/customer/account/create");
}

@Then("^click lupa password")
public void clic_lupa_password() throws Throwable{
	driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[6]/div[1]/div[1]/div/form/fieldset/div[4]/div[2]/a")).click();
}

@When("^isi email")
public void isi_email() throws Throwable{
	driver.findElement(By.id("email_address")).sendKeys("ebensiagian99@gmail.com");
}

@Then("^get the link")
public void get_the_link() throws Throwable{
	driver.findElement(By.cssSelector(".submit")).click();
}

@When("^isi email1")
public void isi_email1() throws Throwable{
	driver.findElement(By.id("email_address")).sendKeys("ebensiagian99@gmail;,com");
}

@When("^isi email2")
public void isi_email2() throws Throwable{
	driver.findElement(By.id("email_address")).sendKeys("ebensiagigmail.com");
}

@When("^isi email3")
public void isi_email3() throws Throwable{
	driver.findElement(By.id("email_address")).sendKeys("ebnzr23@gmail.com");
}

@When("^isi email4")
public void isi_email4() throws Throwable{
	driver.findElement(By.id("email_address")).sendKeys("ebensiagian9009@gmail.com");
}

}
