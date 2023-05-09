package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility{



    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement dayDropDown;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement monthDropDown;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement yearDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailfield;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassWordField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continue1;

    public void fillingTheDetails(String firstName, String lastName, String day, String month, String year, String email, String password, String confirmPassword) {
        CustomListeners.test.log(Status.PASS, "Filling the Details" );
        sendTextToElement(firstNameField, firstName);
        sendTextToElement(lastNameField, lastName);
        selectByVisibleTextFromDropDown(dayDropDown, day);
        selectByVisibleTextFromDropDown(monthDropDown, month);
        selectByVisibleTextFromDropDown(yearDropDown, year);
        sendTextToElement(emailfield, email);
        sendTextToElement(passwordField, password);
        sendTextToElement(confirmPassWordField, confirmPassword);
    }

    public void clickOnRegister() {
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS, "Register" );
    }

    public void clickOnContinue1(){
        clickOnElement(continue1);
        CustomListeners.test.log(Status.PASS, "Continue 1" );
    }
}