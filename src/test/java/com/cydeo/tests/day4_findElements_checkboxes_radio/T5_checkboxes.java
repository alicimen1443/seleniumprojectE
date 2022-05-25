package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {
    public static void main(String[] args) throws InterruptedException {

        //Practice: Checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/checkboxes");

        //we have to locate checkboxes
        WebElement cehckbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement cehckbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));


        //2. Confirm checkbox #1 is NOT selected by default
        System.out.println("cehckbox1.isSelected(), expecting false = " + cehckbox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("cehckbox2.isSelected(), expecting true = " + cehckbox2.isSelected());

        //4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        cehckbox1.click();

        //5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        cehckbox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("cehckbox1.isSelected(), expecting true = " + cehckbox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("cehckbox2.isSelected(), expecting false = " + cehckbox2.isSelected());
    }
}
