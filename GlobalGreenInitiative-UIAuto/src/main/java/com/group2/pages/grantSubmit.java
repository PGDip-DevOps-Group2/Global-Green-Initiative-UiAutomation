package com.group2.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class grantSubmit {


    public void selectGrant(String text){
        $(By.id("optionOne")).selectOption(text);
        sleep(2000);
        $(By.xpath("//button[text()='Submit']")).click();
    }

    public void submitGrant(String text){
        $(By.linkText(text)).pressEnter();

    }

}

