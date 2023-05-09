package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {


    @CacheLookup
    @FindBy(name = "product_attribute_1")
    WebElement processer;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement radioButtonHDD;

    @CacheLookup
    @FindBy(css = "#product_attribute_4_9")
    WebElement radioButtonOS;

    @CacheLookup
    @FindBy(css = "#product_attribute_5_10")
    WebElement microsoftOfficeCheckBox;

    @CacheLookup
    @FindBy(css = "label[for='product_attribute_5_12']")
    WebElement totalCommanderCheckbox;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement price;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement orderMessage;

    @CacheLookup
    @FindBy(css = "span[title='Close']")
    WebElement closeBar;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCart;


    //2.5 Verify the Text "Build your own computer"
    public void selectByVisibleText() {
        selectByVisibleTextFromDropDown(processer , "2.2 GHz Intel Pentium Dual-Core E2200");
        // Reporter.log("Verify computer Title" + processer.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "processer");
    }

    // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    public void setRam() {
        selectByVisibleTextFromDropDown(ram, "8GB [+$60.00]");
        CustomListeners.test.log(Status.PASS, "Enter ram " );
    }

    // 2.7.Select "8GB [+$60.00]" using Select class.
    public void setRadioButtonHDD() {
        clickOnElement(radioButtonHDD);
        CustomListeners.test.log(Status.PASS, "Enter radiobutton " );
    }

    // 2.8 Select HDD radio "400 GB [+$100.00]"
    public void setRadioButtonOS() {
        clickOnElement(radioButtonOS);
        CustomListeners.test.log(Status.PASS, "Set Radio Button");

    }

    // 2.9 Select OS radio "Vista Premium [+$60.00]"
    public void setMicrosoftOfficeCheckBox() {
        clickOnElement(microsoftOfficeCheckBox);
        CustomListeners.test.log(Status.PASS, "Set microsoft office checkbox");
    }

    // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
    //[+$5.00]"
    public void setTotalCommanderCheckbox() {
        clickOnElement(totalCommanderCheckbox);
        CustomListeners.test.log(Status.PASS, "Total commander checkbox");
    }

    // 2.11 Verify the price "$1,475.00"
    public void verifyThePrice() {
        clickOnElement(price);
        CustomListeners.test.log(Status.PASS, "Price");

    }

    // 2.12 Click on "ADD TO CARD" Button.
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Add to cart");
    }

    //2.13 Verify the Message "The product has been added to your shopping cart" on Top
//green Bar After that close the bar clicking on the cross button.
    public void verifyOrderMessage() {
        clickOnElement(orderMessage);
        CustomListeners.test.log(Status.PASS, "Order Message");
    }

    //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void setCloseBar() {
        clickOnElement(closeBar);
        CustomListeners.test.log(Status.PASS, "Close bar");
    }

    //2.15 Verify the message "Shopping cart"
    public void setShoppingCart() {
        mouseHoverToElementAndClick(shoppingCart);
        CustomListeners.test.log(Status.PASS, "Set shopping cart");
    }
}