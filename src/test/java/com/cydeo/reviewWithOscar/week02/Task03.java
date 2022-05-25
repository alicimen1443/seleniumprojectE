package com.cydeo.reviewWithOscar.week02;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task03 {
    public static void main(String[] args) {

        //Task 3:
        //You have to Implement the following Web automated checks over our DEMO ONLINE SHOP: https://www.demoblaze.com/index.html
        //    • Customer navigation through product categories: Phones, Laptops and Monitors
        //    Navigate to "Laptop" → "Sony vaio i5" and verify the price is 790 dollars

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.demoblaze.com/index.html");

        driver.findElement(By.partialLinkText("Laptops")).click();

        driver.findElement(By.partialLinkText("Sony vaio i5")).click();

        int expectedPrice = 790;
        ReviewUtils.staticWait(3);

       String priceText =  driver.findElement(By.tagName("h3")).getText();

       int actualPrice = Integer.parseInt(priceText.split(" ")[0].substring(1));
        System.out.println("actualPrice = " + actualPrice);

        ReviewUtils.staticWait(3);

        if(expectedPrice==actualPrice){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED!!");
        }









    }
}
