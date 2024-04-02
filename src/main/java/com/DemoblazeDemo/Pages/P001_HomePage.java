package com.DemoblazeDemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P001_HomePage extends P00_pageBase {

    public P001_HomePage(WebDriver driver) {
        super(driver);
    }


    private final By registerLink = By.id("signin2");


    public void goToRegisterPage() {
        clickEle(driver.findElement(registerLink));
    }


}
