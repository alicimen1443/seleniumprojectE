package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_xpath_practice {
    public static void main(String[] args) {

        //TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");
        //3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//button[.='Button 1']"));
        button1.click();

        WebElement displayedText = driver.findElement(By.xpath("//p[@id='result']"));

        //4. Verify text displayed is as expected:
        String expectedResult = "Clicked on button one!";
        String actualResult = displayedText.getText();

        if(actualResult.equals(expectedResult)){
            System.out.println("Test PASSED!");
        }else{
            System.out.println("Test FAILED!!!");
        }

        //Expected: “Clicked on button one!”
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
