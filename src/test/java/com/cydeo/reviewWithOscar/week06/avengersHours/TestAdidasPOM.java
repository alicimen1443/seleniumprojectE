package com.cydeo.reviewWithOscar.week06.avengersHours;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class TestAdidasPOM {

    @Test
    public void Test(){
        /*
        Navigate to home page
        click laptops, and assert that the list of laptops match
        expected
         */

        Driver.getDriver().get("https://www.demoblaze.com/index.html");

        // create object for POM locators and methods
        ProductPage page = new ProductPage();
        page.getLink(Driver.getDriver(),"Laptops");




    }
}
