package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenericMethods;

import static testcases.BaseTest.prop;

public class ShippingAddressPage {
    WebDriver driver;
    public ShippingAddressPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@)type='email']")
    WebElement emailAddressField;

    public void enterEmailAddressField(){
        Actions action = new Actions(driver);
        action.moveToElement(emailAddressField).build().perform();
        GenericMethods.pauseExecutionFor(2);
        emailAddressField.click();
        GenericMethods.pauseExecutionFor(2);
        emailAddressField.sendKeys("chhiring1998@gmail.com");
    }



   /* @FindBy(xpath = "//body/div[contains(@class,'page-wrapper')]/main[contains(@class,'page-main')]/div[contains(@class,'columns')]/div[contains(@class,'column main')]/div[contains(@class,'checkout-container')]/div[contains(@class,'opc-wrapper')]/ol[contains(@class,'opc')]/li[contains(@class,'checkout-shipping-address')]/div[contains(@class,'step-content')]/form[contains(@class,'form form-shipping-address')]/div[contains(@class,'fieldset address')]/div[1]/div[1]/input[1]")
    WebElement firstNameField;

    @FindBy(xpath = "//body/div[contains(@class,'page-wrapper')]/main[contains(@class,'page-main')]/div[contains(@class,'columns')]/div[contains(@class,'column main')]/div[contains(@class,'checkout-container')]/div[contains(@class,'opc-wrapper')]/ol[contains(@class,'opc')]/li[contains(@class,'checkout-shipping-address')]/div[contains(@class,'step-content')]/form[contains(@class,'form form-shipping-address')]/div[contains(@class,'fieldset address')]/div[2]/div[1]/input[1]")
    WebElement lastNameField;*/





}




