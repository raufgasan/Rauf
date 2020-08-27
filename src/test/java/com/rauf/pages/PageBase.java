package com.rauf.pages;

import com.rauf.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);

    @FindBy(tagName = "title")
    protected WebElement title;

    @FindBy(xpath = "//div[text()='More travel']")
    protected WebElement moreTravel;

    @FindBy(css = "a[href='/Hotels']")
    protected WebElement stays;

    @FindBy(css = "a[href='/Flights']")
    protected WebElement flights;

    @FindBy(css = "a[href='/Vacation-Packages']")
    protected WebElement vacationPackages;

    @FindBy(css = "a[href='/Activities']")
    protected WebElement thingsToDo;

    @FindBy(css = "a[href='/Cruises']")
    protected WebElement cruises;

    @FindBy(css = "a[href='/Deals']")
    protected WebElement deals;

    public PageBase(){
        PageFactory.initElements(driver, this);
    }






}
