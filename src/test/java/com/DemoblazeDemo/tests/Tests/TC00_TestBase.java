package com.DemoblazeDemo.tests.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TC00_TestBase {


     protected WebDriver driver  ;

    @BeforeTest
    public void setUp()
    {
    driver = new ChromeDriver() ;

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ;

    driver.get("https://www.demoblaze.com/index.html#");
    }




    @AfterTest
    public void tearDown()
    {
     driver.quit();

    }


}
