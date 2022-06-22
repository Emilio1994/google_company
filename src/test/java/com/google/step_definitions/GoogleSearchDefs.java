package com.google.step_definitions;

import com.google.pages.GoogleSearchPage;
import com.google.utilities.ConfigurationReader;
import com.google.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class GoogleSearchDefs {


    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("I am on google search page")
    public void i_am_on_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));


    }
    @Given("I am on GM google search page")
    public void i_am_on_GM_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("you.url"));
    }

    @When("I search for the item")
    public void i_search_for_the_item() {

        googleSearchPage.searchField.sendKeys("car");
    }

    @When("I click on search button")
    public void i_click_on_search_button() {

        googleSearchPage.clickBtn.click();

    }

    @Then("the car page title should be displayed")
    public void the_car_page_title_should_be_displayed() {
        //About 2,720,000,000 results (0.85 seconds)
        //About2720000000results(0.85 seconds)

         String expectedResult = "2,720,000,000";

        String actualResult = googleSearchPage.result();
        //  String actual = actualResult.substring(5, 19).trim();
        // Assert.assertEquals(expectedResult,actual);
      /*
        String [] pp = actualResult.split(",");
        System.out.println(Arrays.toString(pp));
        System.out.println(pp[2]);

       */
        //About 2,720,000,000 results (0.85 seconds)
        String one = actualResult.replace(",","").trim();
        //About2720000000results(0.85 seconds)
        System.out.println(one.substring(one.indexOf("t")+1,one.indexOf("r")));
        //2720000000


//About 2,720,000,000 results (0.85 seconds)
        /*
        int indexOf1 = actualResult.indexOf(" ");
        int indexof2 = actualResult.indexOf(" results");

        String myNumber = actualResult.substring(indexOf1, indexof2).trim();
        System.out.println(myNumber);

         */

    }

}
