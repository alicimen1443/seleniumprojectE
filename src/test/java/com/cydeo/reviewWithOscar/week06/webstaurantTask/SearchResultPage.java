package com.cydeo.reviewWithOscar.week06.webstaurantTask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends HomePage {

    @FindBy(xpath = "//a[@data-testid='itemDescription'] ")
    public List<WebElement> resultList;

    @FindBy(xpath = "//input[@data-testid='itemAddCart']")
    public List<WebElement> inStockItems;

    @FindBy(xpath = "//button[@class='close p-2 mr-2 top-1']")
    public WebElement closeAlert;

    @FindBy(xpath = "(//span[.='Cart'])[2]")
    public WebElement cart;

    @FindBy(id ="cartItemCountSpan")
    public WebElement countOfItems;

    @FindBy(xpath = "//button[.='Empty Cart']")
    public WebElement emptyCart;

    @FindBy(xpath = "(//button[.='Empty Cart'])[2]")
    public WebElement emptyCartAgain;

    @FindBy(xpath = "//p[@class='header-1']")
    public WebElement emptyMessage;
}


