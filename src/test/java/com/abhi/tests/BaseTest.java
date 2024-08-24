package com.abhi.tests;

import com.abhi.browser.Driver;
import com.abhi.browser.DriverManager;
import com.abhi.constants.Constants;
import com.abhi.reports.ExtentReport;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class BaseTest {

    @BeforeSuite
    public void setUpSuite() {
        ExtentReport.initializeReports();
    }

//    @BeforeClass
//    public void setUp() throws MalformedURLException {
//        Driver.setUpDriver("chrome"); // or any other browser you are testing with
//    }

    @AfterSuite
    public void tearDownSuite() throws IOException {
//        ExtentReport.closeReports();

        File htmlFile = new File(Constants.EXTENTREPORTPATH);
//        Desktop.getDesktop().browse(htmlFile.toURI());
    }

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        Driver.setUpDriver("chrome");
    }

    @AfterMethod
    public void tearDown() {
        Driver.tearDownDriver();
    }

}
