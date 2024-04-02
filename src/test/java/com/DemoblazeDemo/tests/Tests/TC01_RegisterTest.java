package com.DemoblazeDemo.tests.Tests;

import com.DemoblazeDemo.Pages.P001_HomePage;
import com.DemoblazeDemo.Pages.P01_RegisterPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.security.Key;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class TC01_RegisterTest extends TC00_TestBase {


    P001_HomePage homePage;
    P01_RegisterPage registerPage;
    SoftAssert softAssert = new SoftAssert();


    @Test
    public void validRegister() throws InterruptedException {

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new java.util.Date());
        

        homePage = new P001_HomePage(driver);
        homePage.goToRegisterPage();

        registerPage = new P01_RegisterPage(driver);
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(registerPage.assertOnTit()));

        softAssert.assertTrue(registerPage.assertOnTit().getText().contains("Sign up"));

        registerPage.fillingData("test" + timeStamp, "5236416");
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();
        softAssert.assertAll();

    }


}
