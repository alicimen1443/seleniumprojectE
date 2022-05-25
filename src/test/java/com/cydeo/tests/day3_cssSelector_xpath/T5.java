package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5 {
    public static void main(String[] args) {

        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter Incorrect username in to login box:
        WebElement loginBox = driver.findElement(By.cssSelector("input[class='login-inp']"));
        loginBox.sendKeys("sth wrong"+ Keys.ENTER);

        //4- Click to `Reset password` button
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        resetPasswordButton.click();

        //5- Verify “error” label is as expected
        //Expected : Login or E-mail not found
        //WebElement actualErrorLabelText = driver.findElement(By.cssSelector("div[class='errortext']"));

        String expectedErrorLabel = "Login or E-mail not found";
        String actualErrorLabelText= driver.findElement(By.cssSelector("div[class='errortext']")).getText();

        System.out.println("expectedErrorLabel = " + expectedErrorLabel);
        System.out.println("actualErrorLabelText = " + actualErrorLabelText);

        if(actualErrorLabelText.equals(expectedErrorLabel)){
            System.out.println("Error text label verification passed!");
        }else{
            System.out.println("Error text label verification failed!!!");
        }


        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from

    }
}
