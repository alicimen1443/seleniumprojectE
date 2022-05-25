package com.cydeo.reviewWithOscar.week04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WindowHandleTask {


    /*
    When we have more than one window is opened how can we switch to different windows
    getWindowHandles() ----> Set of Strings : we want to take out any duplicate values
    driver.switchTo().window(string of windowHandle)
     */

    @Test
    public void windowsTest(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("");
    }
}
