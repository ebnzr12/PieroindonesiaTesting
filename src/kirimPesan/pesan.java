package kirimPesan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class pesan {
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

@Then("^click hubungi kami$")
public void click_hubungi_kami() throws Throwable{
	driver.findElement(By.xpath("/html/body/div[1]/footer/div/div[1]/div/div[1]/ul/li[3]/a")).click();
}


@Then("^isi form$")
public void isi_form() throws Throwable{
	driver.findElement(By.xpath("//*[@id=\"telephone\"]")).sendKeys("082249882450");
	driver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys("barangnya bagus, trendy semua.");
}


@Then("^pesan terkirim")
public void pesan_terkirim() throws Throwable{
	driver.findElement(By.cssSelector("button.action:nth-child(2)")).click();
}

@Then("^isi form1$")
public void isi_form1() throws Throwable{
	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ebensiagian99@gml.m");
	driver.findElement(By.xpath("//*[@id=\"telephone\"]")).sendKeys("082249882450");
	driver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys("Barangnya bagus, trendy semua");
}

@Then("^isi form2$")
public void isi_form2() throws Throwable{
	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ebensiagin@gmail.co");;
	driver.findElement(By.xpath("//*[@id=\"telephone\"]")).sendKeys("082249882450");
	driver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys("Barangnya bagus, trendy semua");
}

@Then("^isi form3$")
public void isi_form3() throws Throwable{
	driver.findElement(By.xpath("//*[@id=\"telephone\"]")).sendKeys("0822498824501");
	driver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys("Barangnya bagus, trendy semua");
}

@Then("^isi form4$")
public void isi_form4() throws Throwable{
	driver.findElement(By.xpath("//*[@id=\"telephone\"]")).sendKeys("082249882450");
}

}
