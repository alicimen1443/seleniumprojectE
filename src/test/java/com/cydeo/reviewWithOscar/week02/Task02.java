package com.cydeo.reviewWithOscar.week02;

import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task02 {
    public static void main(String[] args) {

        //@student Basic login authentication
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //- Go to:  http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //- Verify title equals: String expectedTitle = "Web Orders Login"
        String expectedTitle = "Web Orders Login";

        if(expectedTitle.equals(driver.getTitle())){
            System.out.println("success");
        }else{
            System.exit(1);
        }

        //- Enter username: Tester
        //- Enter password: test
        //- Click “Sign In” button
        WebElement userNameBox = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement passwordBox = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement signInButton = driver.findElement(By.id("ctl00_MainContent_login_button"));

        userNameBox.sendKeys("Tester");
        passwordBox.sendKeys("test");
        signInButton.click();

        //- Verify title equals: String expectedHomePageTitle = "Web Orders"

        String expectedHomePageTitle = "Web Orders";
        if(expectedHomePageTitle.equals(driver.getTitle())){
            System.out.println("PASSED");
        }else{
            System.exit(1);
        }

        ReviewUtils.staticWait(2);
        driver.close();


    }
}
