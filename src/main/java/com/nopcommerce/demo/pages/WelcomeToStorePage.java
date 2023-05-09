package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WelcomeToStorePage extends Utility {



    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeToOurStore;

    public String welcomeToOurStoreElement() {
        CustomListeners.test.log(Status.PASS, "Welcome to our store element" );
        return getTextFromElement(welcomeToOurStore);

    }
}