package com.abhi.browser;

import com.abhi.constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;

    private Driver(String browser) throws MalformedURLException {
        invokeDriver(browser);
        maximize();
        setImplicitWait();
    }

    private static void invokeDriver(String browser) throws MalformedURLException {
        if(Constants.RUNMODE.equals("local")) {
            if(browser.equalsIgnoreCase(Constants.CHROME)) {
                final ChromeOptions options = new ChromeOptions();
                options.setBrowserVersion("127");
                driver = new ChromeDriver(options);
            }
            else if(browser.equalsIgnoreCase(Constants.FIREFOX) || (browser.equalsIgnoreCase(Constants.MOZILLA))) {
                System.setProperty("webdriver.gecko.driver", Constants.GECKODRIVERPATH);
                driver = new FirefoxDriver();
            }
            else {
                System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVERPATH);
                driver = new ChromeDriver();
            }
        }
        DriverManager.setDriver(driver);
    }

    private static void maximize() {
        DriverManager.getDriver().manage().window().maximize();
    }

    private static void setImplicitWait() {
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICITWAIT, TimeUnit.SECONDS);
    }

    public static void setUpDriver(String browser) throws MalformedURLException {
        if(DriverManager.getDriver()==null) {
            new Driver(browser); //anonymous object -->No reference to this object
        }
    }

    public static void tearDownDriver() {
        if(DriverManager.getDriver()!=null) {
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
    }
}
