package com.abhi.pages;

import com.abhi.browser.DriverManager;
import com.abhi.constants.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected BasePage() {

        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public static void click(WebElement element, String name) {
        explicitlyWait(element);
        element.click();
    }

    public static void explicitlyWait(WebElement element) {
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(Constants.EXPLICITWAIT))
                .until(ExpectedConditions.visibilityOf(element));
    }
}
