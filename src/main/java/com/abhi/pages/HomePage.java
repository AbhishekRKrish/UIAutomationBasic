package com.abhi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(id="nav-hamburger-menu")
    private WebElement link_hamburgermenu;
}
