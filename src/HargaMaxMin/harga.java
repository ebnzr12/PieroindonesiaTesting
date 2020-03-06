package HargaMaxMin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class harga {
	WebDriver driver;
@Given("^buka firefox dan mulai aplikasinya$")
public void buka_firefox_dan_mulai_aplikasinya() throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\GeckoDriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://pieroindonesia.com/customer/account/create");
}

@When("^saya sudah login$")
public void saya_sudah_login() throws Throwable {
	driver.findElement(By.id("email")).sendKeys("ebensiagian99@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Siregar12");
}

@Then("^bisa login$")
public void bisa_login() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
}

@Then("^click men$")
public void click_men() throws Throwable {
	driver.findElement(By.className("menu-link")).click();
}

@Then("^masukkan harga min dan max$")
public void masukkan_harga_min_dan_max() throws Throwable {
	driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div/div[2]/dl/dd[2]/div/form/div/div[1]/input")).sendKeys("200000");
	driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div/div[2]/dl/dd[2]/div/form/div/div[2]/input")).sendKeys("300000");
}

@Then("^sepatu ditampilkan$")
public void sepatu_ditampilkan() throws Throwable{
	driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div/div[2]/dl/dd[2]/div/form/div/button")).click();
}


@Then("^masukkan harga min dan max2$")
public void masukkan_harga_min_dan_max2() throws Throwable {
	driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div/div[2]/dl/dd[2]/div/form/div/div[1]/input")).sendKeys("bbbbb");
	driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div/div[2]/dl/dd[2]/div/form/div/div[2]/input")).sendKeys("aaaa");
}
}
