package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjects.AddToCartPage;
import pageobjects.HomePage;
import pageobjects.ProductDetailsPage;
import pageobjects.ShippingAddressPage;
import utils.BrowserFactory;

public class ProductStepDef {

    WebDriver driver = null;
    HomePage homePage;

    ProductDetailsPage productDetailsPage;

    AddToCartPage addToCartPage;

    ShippingAddressPage shippingAddressPage;


    @Before
    public void tearUp(){
        driver = BrowserFactory.launchGivenBrowser("Chrome");
        driver.get("https://magento.softwaretestingboard.com/");
        homePage = new HomePage(driver);
        productDetailsPage = new ProductDetailsPage(driver);

    }

    @Given("I am on the login page")
    public void verifyUserIsOnLogInPage(){
        System.out.println("I am on the login page");

    }

    @When("I enter my valid username and password")
    public void enterUserNamePassword(){
        System.out.println("I enter my valid username and password");

    }

    @Then("Click the login button")
    public void clickOnLoginButton(){
        System.out.println("Click the login button");

    }

    @Then("I should be redirected to the dashboard")
    public void verifyUserRedirectedToLoginPage(){
        System.out.println("I should be redirected to the dashboard");

    }

    @Given("I should see a welcome message")
    public void verifyUserSeeWelcomeMessage(){
        System.out.println(" should see a welcome message");

    }

    @After
    public void tearDown(){
        driver.quit();

    }
}
