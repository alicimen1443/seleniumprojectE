package com.cydeo.reviewWithOscar.week06.webstaurantTask;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.ReviewUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest {

    @Test
    public void Test() {
        Driver.getDriver().get("https://www.webstaurantstore.com/");

        SearchResultPage page = new SearchResultPage();
        page.searchBox.sendKeys("Stainless Work Table" + Keys.ENTER);

        List<WebElement> resultList = page.resultList;

        for (WebElement eachElement : resultList) {
            Assert.assertTrue(eachElement.getText().toLowerCase().contains("table"));
        }

        List<WebElement> inStockItems = page.inStockItems;

        inStockItems.get(inStockItems.size() - 1).click();

// .ElementClickInterceptedException: element click intercepted:  WE need to handle the HTML Alert
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(page.cart).perform();

        page.closeAlert.click();

//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
//        wait.until(ExpectedConditions.invisibilityOf(page.closeAlert));
        ReviewUtils.staticWait(1);

        // verification of added and deleted item count
        int actualValue = Integer.parseInt(page.countOfItems.getText());
        Assert.assertTrue(actualValue == 1);

        page.cart.click();

        page.emptyCart.click();
        page.emptyCartAgain.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(page.emptyMessage));

        actualValue = Integer.parseInt(page.countOfItems.getText());
        Assert.assertTrue(actualValue == 0);


    }
}
/*
Interview Task from US

Go to https://www.webstaurantstore.com/
Search for "stainless work table"
check the search result and ensure that every item has "Table" in it's title
add the last found item
empty cart

Helpful Note: If you have an element that disappears and you need to locate it:
1. Click on Sources at the inspect page
2. hover over your webelement
3. click F-8 to stop debugger of browser, pauses the execution of the script
 */