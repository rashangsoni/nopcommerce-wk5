package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WelcomeSignInPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement checkoutGuest;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement register;


    //2.20 Verify the Text “Welcome, Please Sign In!”
    public String getWelcomeText() {
        CustomListeners.test.log(Status.PASS, "Welcome Text" );
        return getTextFromElement(welcomeText);

    }

    //2.21 Click on “CHECKOUT AS GUEST” Tab
    public void setCheckoutGuest() {
        clickOnElement(checkoutGuest);
        CustomListeners.test.log(Status.PASS, "Checkout Guest" );

    }

    public void clickOnRegisterButton() {
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS, "Register Button" );
    }
}