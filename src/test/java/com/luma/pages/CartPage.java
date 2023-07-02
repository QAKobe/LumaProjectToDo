package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class CartPage {


    public CartPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//select[@class='select']")
    List<WebElement> twoDropDowns;

    @FindBy(xpath = "//input[@name='postcode']")
    WebElement postalCode;

    @FindBy(xpath = "//input[@value='flatrate_flatrate']")
    WebElement flatRate;

    @FindBy(xpath = "//input[@value='tablerate_bestway']")
    WebElement bestWay;

    @FindBy(xpath = "//div[@id='block-shipping']//div[@role='tab']")
    WebElement summary;

    public void ChooseCountryState(String state, String zipCode) throws InterruptedException {
        /*
        Implement this method:
        Choose state and provide zipcode with dataTable of Gherkin Language, country is selected by default


         */

    }

    public void compareRecords( WebDriver driver) throws InterruptedException {

        /*
        Implement this method:
        Check by clicking radio button for Flat Rate and take a screenshot of the page with Flat Rate price
        Check by clicking radio button for Best Way and take a screenshot of the page with Best Way price

         */

    }
}
