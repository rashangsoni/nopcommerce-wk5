package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CellPhonePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewTab;

    @CacheLookup
    @FindBy(xpath = "//h2//a[@href='/nokia-lumia-1020']")
    By nokiaLumia1020;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement changeQyt;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeBar;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCart;


    public void clickOnList() {
        clickOnElement(listViewTab);
        CustomListeners.test.log(Status.PASS, "Click on list");
    }

    public void clickOnNokiaLumia()  {
        JavascriptExecutor obj = (JavascriptExecutor) driver;
        obj.executeScript("nokiaLumia1020");
        clickOnElement(nokiaLumia1020);


        CustomListeners.test.log(Status.PASS, "Click on nokia lumia1020");
    }

    public void setChangeQty() {
        sendTextToElement(changeQyt, "2");
        CustomListeners.test.log(Status.PASS, "change qty 2" + "2");
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Add to cart");
    }

    public void setCloseBar() {
        clickOnElement(closeBar);
        CustomListeners.test.log(Status.PASS, "Close Bar");
    }

    public void mouseHoverAndClickOnShoppingCart() {
        mouseHoverToElementAndClick1(shoppingCart);
        CustomListeners.test.log(Status.PASS, "Click to shopping cart");
    }
}
