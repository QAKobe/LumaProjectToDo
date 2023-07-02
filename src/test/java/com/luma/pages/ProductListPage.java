package com.luma.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import java.util.List;

public class ProductListPage {

    public ProductListPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='mode-list']")
    WebElement listView;

    @FindBy(css = "select[id='sorter']")
    WebElement sortByDropDown;

    @FindBy(xpath = "//select[@id='limiter']")
    List<WebElement> showDropDown;

    @FindBy(xpath = "//span[contains(@id,'product-price')]")
    List<WebElement> allProducts;

    @FindBy(css = "button[title='Add to Cart']")
    List<WebElement> addButton;

    @FindBy(xpath = "//div[@data-block='minicart']")
    WebElement cartButton;

    @FindBy(xpath = "//span[contains(.,'View and Edit Cart')]")
    WebElement editButton;



    public void listSortAndShowAll(WebDriver driver) throws InterruptedException {


        /*
        Implement this method:
        Product list is shown as table, you need to make it look as list, choose sort by as price
        and down below there is dropdown for showing all the products, show it all
         */

    }

    public void validateSortOrder() {

    /*
    Implement this method:
    Consider this as new functionality
    The main purpose of this method should be able to verify
    if the sort by price dropdown is actually showing in ascending order
    Here, you will need to figure out how you can compare similar records to each other,
    meaning all products coming from the app is sorted or not? How would you approach to this task?

   HINT: Sort one record, and compare to actual record from the app
     */

    }

    public void addProduct() throws InterruptedException {
        /*
        After sort functionality is working as expected, then add any product from the list to the cart,
        click cart button and then click edit cart link
         */
    }
}
