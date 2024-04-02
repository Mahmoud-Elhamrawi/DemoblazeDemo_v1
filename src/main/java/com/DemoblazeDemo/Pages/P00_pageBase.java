package com.DemoblazeDemo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P00_pageBase {
    protected WebDriver driver ;

    public P00_pageBase(WebDriver driver)
    {
        this.driver = driver ;
    }


    public void waiting(WebElement ele)

    {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ele));
    }

    public void clickEle(WebElement ele)
    {
        this.waiting(ele);
        ele.click();

    }

    public void  enterTxt(WebElement ele , String text)
    {
        this.waiting(ele);
        ele.sendKeys(text);
    }





}
