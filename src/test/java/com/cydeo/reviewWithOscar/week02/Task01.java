package com.cydeo.reviewWithOscar.week02;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task01 {
    public static void main(String[] args) {

        //open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //        go to https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");

        ReviewUtils.staticWait(1);

        //        then click on "forgot_password" link
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password"));
        forgotPasswordLink.click();

        ReviewUtils.staticWait(1);
        //        enter any email
        WebElement emailBox = driver.findElement(By.name("email"));

        String expectedEmail = "mike.smith@garbage.com";
        emailBox.sendKeys(expectedEmail);

        //        verify that email is displayed in the Input box
        String actualEmail = emailBox.getAttribute("value");

        System.out.println("actualEmail = " + actualEmail);

        //verify the test
        if(actualEmail.equalsIgnoreCase(expectedEmail)){
            System.out.println("PASS email verification");
        }else{
            System.out.println("FAILED email verification");
            System.out.println("actualEmail = " + actualEmail);
            System.out.println("expectedEmail = " + expectedEmail);
        }

        //        click on Retrieve password
        //use id
        //driver.findElement(By.id("form_submit")).click();

        //use css
        //driver.findElement(By.cssSelector("#form_submit")).click();

        //use Retrieve word to locate with XPATH : //i[contains(text,'Retrieve')]
        driver.findElement(By.xpath("//i[contains(text(),'Retrieve')]")).click();


        ReviewUtils.staticWait(1);
        //close or quit the page
        driver.close();

        //        verify that confirmation message says 'Your e-mail's been sent!'

        String expectedMessage = "Your e-mail's been sent!";
        String actualMessage = driver.findElement(By.name("confirmation_message")).getText();

        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASSED message text");
        }else {
            System.out.println("FAILED message text");
        }











    }
}
