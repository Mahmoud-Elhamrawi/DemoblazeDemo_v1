package com.DemoblazeDemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_RegisterPage extends P00_pageBase {
    public P01_RegisterPage(WebDriver driver) {
        super(driver);
    }


    private final By assertOnTitleSignUp = By.id("signInModalLabel");
    private final By userNameInp = By.id("sign-username");
    private final By userPassInp = By.id("sign-password");
    private final By regBtn = By.xpath("//button[text()='Sign up']");
    private final By model = By.id("signInModal");


    public WebElement assertOnTit() {
        return driver.findElement(assertOnTitleSignUp);
    }

    public void fillingData(String userName, String Pass) {
        enterTxt(driver.findElement(userNameInp), userName);
        enterTxt(driver.findElement(userPassInp), Pass);
        clickEle(driver.findElement(regBtn));
    }

    public WebElement allModel() {
        return driver.findElement(model);
    }


}
