package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Steps {
	WebDriver driver;
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		
	    
	}

	@When("I enter a valid username and password")
	public void i_enter_a_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("nitheesh");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("P");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("nitheeshp898@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("nithi@9980");
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("nithi@9980");
		
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")).click();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("I should be logged in successfully and My account page should be displayed")
	public void i_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		boolean title = driver.findElement(By.xpath("//span[@class='base']")).isDisplayed();
		Assert.assertEquals(title, true);
	   // throw new io.cucumber.java.PendingException();
	}
}
