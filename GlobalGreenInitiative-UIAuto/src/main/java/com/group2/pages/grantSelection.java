package com.group2.pages;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
public class grantSelection {



    public void agreedTC(String text) {
        $(By.name(""+text+"")).click();
    }

    public void selectGrantOption(String text) {
        $(By.id(""+text+"")).click();
    }

}
