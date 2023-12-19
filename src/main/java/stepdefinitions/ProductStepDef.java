package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobjects.AddToCartPage;
import pageobjects.HomePage;
import pageobjects.ProductDetailsPage;
import pageobjects.ShippingAddressPage;
import utils.BrowserFactory;
import utils.GenericMethods;

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

    @When("I enter my valid username {string}")
    public void enterUserName(String userName){
        System.out.println("I enter my valid username and password" + userName);

    }

    @When("I enter my valid password {string}")
    public void password(String password){
        System.out.println("I enter my valid username and password" + password);

    }



    @Then("click the login button")
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





    @Given("I am on shopping website")
    public void launchWebsite(){
        driver.get("https://magento.softwaretestingboard.com/");
        Assert.assertTrue(driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/women.html']")).isDisplayed());

    }

    @When("I select a product that I want to purchase from list of products")
    public void selectProduct(){
        homePage.clickOnProduct();
        Assert.assertTrue(productDetailsPage.verifyIfAddToCartButtonIsDisplayed());

    }

    @Then("I select size of the product that I chose")
    public void selectSizeOfTheProduct(){
       productDetailsPage.selectSizeOfProduct();
        GenericMethods.pauseExecutionFor(2);

    }



    @And("I select color of the same product")
    public void selectColorOfTheProduct() {
        productDetailsPage.selectColorOfProduct();
        GenericMethods.pauseExecutionFor(2);
    }



    @Then("I add product to the cart")
    public void addProductToTheCart(){
        productDetailsPage.clickOnAddToCart();
        GenericMethods.pauseExecutionFor(2);
        Assert.assertTrue(productDetailsPage.verifyIfUserIsAbleToAddProductToCart());
        }




    @After
    public void tearDown(){
        driver.quit();

    }
}
