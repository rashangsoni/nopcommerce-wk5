package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computerField;

    @CacheLookup
    @FindBy(xpath = "//html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement electronics;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellPhones;


    //1.1 Click on Computer Menu
    public void mouseHoverOnComputer() {
        mouseHoverToElement1(computerField);
        CustomListeners.test.log(Status.PASS, "Computer" );
    }

    //1.2 Click on Desktop
    public void clickOnDesktop() {
        clickOnElement(desktop);
        CustomListeners.test.log(Status.PASS, "Desktop" );
    }

    //
    public void mouseHoverOnElectronics() {
        mouseHoverToElement1(electronics);
        CustomListeners.test.log(Status.PASS, "Electronics" );
    }

    public void clickIOnCellPhones() {
        clickOnElement(cellPhones);
        CustomListeners.test.log(Status.PASS, "Cell phone" );
    }
}