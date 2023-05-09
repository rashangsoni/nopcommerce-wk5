package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {


    //By qty = By.xpath("#itemquantity11222");
    //By total = By.xpath("//td[@class='subtotal']");
    @CacheLookup
    @FindBy(id="termsofservice")
    WebElement checkbox;

    @CacheLookup
    @FindBy(id="checkout")
    WebElement checkoutButton;



//2.16
//public void changeOrderQty() {
//    clearTextFromField(qty);
//    sendTextToElement(qty, "2");
//}

/*
//2.16 Change the Qty to "2" and Click on "Update shopping cart"
    public void sendTextToQty (By by){
        clearTextFromField(qty);
        sendTextToElement(qty, "2");
        clickOnElement(By.xpath("//button[@id='updatecart']"));
    }
//2.17 Verify the Total"$2,950.00"
    public void setTotal () {
        clickOnElement(total);
    }*/

    //2.18 click on checkbox “I agree with the terms of service”
    public void setCheckbox() {
        clickOnElement(checkbox);
        CustomListeners.test.log(Status.PASS, "checkbox" );
    }

    //2.19 Click on “CHECKOUT”
    public void setCheckoutButton() {
        clickOnElement(checkoutButton);
        CustomListeners.test.log(Status.PASS, "checkoutButton" );
    }

}