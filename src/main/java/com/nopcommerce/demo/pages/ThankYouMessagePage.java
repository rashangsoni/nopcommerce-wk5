package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ThankYouMessagePage extends Utility{


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouMessage;

    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement yourOrder;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;


    public String thankYouMessageElement() {
        CustomListeners.test.log(Status.PASS, "Thank you message" );
        return getTextFromElement(thankYouMessage);

    }

    public String yourOrderMessageElement() {
        CustomListeners.test.log(Status.PASS, "Your Order Message" );
        return getTextFromElement(yourOrder);
    }

    public void clickOnContinueButton() {
        CustomListeners.test.log(Status.PASS, "Continue Button" );
        clickOnElement(continueButton);

    }
}