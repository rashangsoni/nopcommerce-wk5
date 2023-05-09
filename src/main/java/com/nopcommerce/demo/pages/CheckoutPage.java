package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_StateProvinceId']")
    WebElement stateField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1Field;

    @CacheLookup
    @FindBy(xpath = "/input[@id='BillingNewAddress_Address2']")
    WebElement address2Field;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement zipField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumberField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FaxNumber']")
    WebElement faxNumberField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FaxNumber']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Next Day Air ($0.00)']")
    WebElement nextDayAir;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButton1;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Credit Card']")
    WebElement creditCardPaymentMethod;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton2;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardType;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardDetails;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement month;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement year;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton3;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirm;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement continueButton4;


    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        CustomListeners.test.log(Status.PASS, "Enter Firstname " + firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        CustomListeners.test.log(Status.PASS, "Click on loginButton"+ lastName);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, "prime@gmail.com");
        CustomListeners.test.log(Status.PASS, "Enter email "+ email);
    }

    public void selectFromDropdownCountry(String country) {
        selectByVisibleTextFromDropDown(countryField, country);
        CustomListeners.test.log(Status.PASS, "select country");
    }
    //public void statefield

    public void enterCity(String city) {
        sendTextToElement(cityField, "Harrow");
        CustomListeners.test.log(Status.PASS, "Enter city" + city);
    }

    public void enterAddress1(String address1) {
        sendTextToElement(address1Field, "100");
        CustomListeners.test.log(Status.PASS, "Enter Address1" + address1);
    }

    public void enterAddress2(String address2) {
        sendTextToElement(address2Field, "ABC LANE");
        CustomListeners.test.log(Status.PASS, "Enter Address 2" + address2);
    }

    public void enterZip(String zip) {
        sendTextToElement(zipField, "HA2 9SE");
        CustomListeners.test.log(Status.PASS, "EnterZip" + zip);
    }

    public void enterPhoneNumber(String phoneNumber) {
        sendTextToElement(phoneNumberField, "0754741442");
        CustomListeners.test.log(Status.PASS, "Enter Phone Number" + phoneNumber);
    }

    public void enterFaxNumber(String faxNumber) {
        sendTextToElement(faxNumberField, "0192535448");
        CustomListeners.test.log(Status.PASS, "Enter Fax Number" + faxNumber);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on continue button");
    }

    public void clickOnNextDayAirButton() {
        clickOnElement(nextDayAir);
        CustomListeners.test.log(Status.PASS, "Next Day Air Button");
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
        CustomListeners.test.log(Status.PASS, "Click on continueButton1");
    }

    public void clickOnCreditCardPaymentMethod() {
        clickOnElement(creditCardPaymentMethod);
        CustomListeners.test.log(Status.PASS, "Credit card payment");
    }

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
        CustomListeners.test.log(Status.PASS, "Credit card payment");


    }

    public void selectCreditCardType(String creditCard) {
        selectByVisibleTextFromDropDown(creditCardType, creditCard);
        CustomListeners.test.log(Status.PASS, "Credit card payment");
    }

    public void fillingCardDetails(String cardName, String number, String month1, String year1, String code) {
        CustomListeners.test.log(Status.PASS, "Filling card details" );
        sendTextToElement(cardDetails, cardName);
        sendTextToElement(cardNumber, number);
        selectByVisibleTextFromDropDown(month, month1);
        selectByVisibleTextFromDropDown(year, year1);
        sendTextToElement(cardCode, code);

    }

    public void fillingCardDetails1(String country, String city, String address1, String zip, String phoneNumber) {
        CustomListeners.test.log(Status.PASS, "Filling card details1" );
        selectByVisibleTextFromDropDown(countryField, country);
        sendTextToElement(cityField, city);
        sendTextToElement(address1Field, address1);
        sendTextToElement(zipField, zip);
        sendTextToElement(phoneNumberField, phoneNumber);
    }

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
        CustomListeners.test.log(Status.PASS, "Continue button 3" );
    }

    public void clickOnConfirm() {
        clickOnElement(confirm);
        CustomListeners.test.log(Status.PASS, "Confirm" );
    }

    public void clickOnContinueButton4() {
        clickOnElement(continueButton4);
        CustomListeners.test.log(Status.PASS, "continue button 4" );

    }

}