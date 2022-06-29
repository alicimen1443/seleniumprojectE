package com.cydeo.reviewWithOscar.week06.avengersHours;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.ReviewUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class AdidasBasePage {

    public AdidasBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void getLink(WebDriver driver, String link){
        driver.findElement(By.partialLinkText(link)).click();
        ReviewUtils.staticWait(1);

    }

    /*
    public final String str="Laptops"; // i made it constant
    @FindBy(linkText = str) //it works only with constants
    public WebElement getLinkElement;

     */
    @FindBy(xpath = "//a[@class='hrefch']")
    public List<WebElement> productName;


}
