package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {
    public DynamicControlsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //@FindBy(xpath=".='Remove'")
    @FindBy(css = "form#checkbox-example>button") //from parent to child
    public WebElement removeButton;

    @FindBy(css = "div#loading")
    public WebElement loadingBar;

    @FindBy(css = "input[type='checkbox']")
    public WebElement checkbox;

    //@FindBy(xpath = "//p[@id='message']")
    @FindBy(css = "p[id='message']")
    public WebElement message;











}
