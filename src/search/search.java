package search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class search {
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

@Then("^click search4")
public void click_search4() throws Throwable {
	driver.findElement(By.id("search")).sendKeys("ergo");
	driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
}

@Then("^click search3")
public void click_search3() throws Throwable {
	driver.findElement(By.id("search")).sendKeys("!!!!!");
	driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
}

@Then("^click search2")
public void click_search2() throws Throwable {
	driver.findElement(By.id("search")).sendKeys("999999");
	driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
}

@Then("^click search1")
public void click_search1() throws Throwable {
	driver.findElement(By.id("search")).sendKeys("nike");
	driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
}
@Then("^click search")
public void click_search() throws Throwable {
	driver.findElement(By.id("search")).sendKeys("kensei evo");
	driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
}






}
