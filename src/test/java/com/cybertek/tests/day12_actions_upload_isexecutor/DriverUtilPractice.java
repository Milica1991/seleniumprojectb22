package com.cybertek.tests.day12_actions_upload_isexecutor;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.cybertek.utilities.Driver.getDriver;

public class DriverUtilPractice {

    @Test
    public void simple_google_search_test(){
        //1- go to google.com
        //Driver.getDriver() -> create driver instance and ready to use
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));

        //2- Search for a value
        WebElement searchBox = getDriver().findElement(By.name("q"));

        String searchValue = ConfigurationReader.getProperty("searchValue");

        searchBox.sendKeys(searchValue + Keys.ENTER);

        //3- Verify value is contained in the title
        String actualTitle= getDriver().getTitle();
        String expectedInTitle = searchValue;

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        getDriver().quit();

        getDriver().get("https://etsv.com");

        Driver.closeDriver();

    }
}
