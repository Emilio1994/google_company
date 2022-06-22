package com.google.pages;

import com.google.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {



    public GoogleSearchPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchField;

    @FindBy(xpath = "(//input[@name='btnK'])[1]")
    public WebElement clickBtn;


    @FindBy(xpath = "//div[@id='result-stats']")
    public WebElement searchResult;




    public String result(){

        return searchResult.getText();
    }

}


