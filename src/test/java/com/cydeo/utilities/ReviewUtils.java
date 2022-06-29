package com.cydeo.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ReviewUtils {

    public static void staticWait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e){

        }
    }

    // will be used in demoblaze application, to navigate to different links at the page
   //will click on different elements/links at the page
    public static void getLink(WebDriver driver,String link){

        driver.findElement(By.partialLinkText(link)).click();
        staticWait(1);

    }

    public static double addProduct(WebDriver driver,String category,String product){
        getLink(driver,category); //click on category
        getLink(driver,product); //click on product
        //Let's get products price
        String priceText = driver.findElement(By.tagName("h3")).getText();
        double price = Double.parseDouble(priceText.substring(1,4));

        getLink(driver,"Add to cart");
        Alert alert =driver.switchTo().alert();
        alert.accept();
        return price;

    }

    //get List of WebElement as parameter and return list of String
    public static List<String> getElementsTexts(List<WebElement> inputList){
        List<String> list = new ArrayList<>();
        for (WebElement webElement : inputList) {
            list.add(webElement.getText());
        }
        return list;
    }


}
