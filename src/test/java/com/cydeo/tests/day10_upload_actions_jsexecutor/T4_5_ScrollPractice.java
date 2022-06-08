package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_5_ScrollPractice {

    @Test
    public void scrollPractice_test(){

        //TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        //3- Scroll down to “Powered by CYDEO”
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(cydeoLink).perform();
        BrowserUtils.sleep(2);

        //4- Scroll using Actions class “moveTo(element)” method

        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button

        actions.sendKeys(homeLink,Keys.PAGE_UP).perform();
        BrowserUtils.sleep(2);
        Driver.closeDriver();







    }
}
