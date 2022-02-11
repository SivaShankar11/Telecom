package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;




public class TelecomStepDefinition {


	public static WebDriver driver;

	@Given("Lauch Browser")
	public void lauch_Browser() {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/");
		driver.manage().window().maximize(); 
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	}

	@When("user enters username password")
	public void user_enters_username_password() {
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();

	}

	@And("click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.id("fname" )).sendKeys("siva");

	}

	@Then("user validates login screen")
	public void user_validates_login_screen() {

		String value = driver.findElement(By.xpath("//h1")).getText();
		System.out.println("value");

	}

}
