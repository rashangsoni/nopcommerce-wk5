package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {


    @CacheLookup
    @FindBy(name = "products-orderby")
    WebElement dropDown;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")
    WebElement addToCart;


    public void selectDropDown(){
        selectByVisibleTextFromDropDown(dropDown,"products-orderby");
    }
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Add to cart" );
    }
}