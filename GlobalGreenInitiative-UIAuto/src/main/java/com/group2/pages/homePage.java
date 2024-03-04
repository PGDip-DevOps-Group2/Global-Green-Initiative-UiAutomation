package com.group2.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class homePage {

    public homePage open() {
        Selenide.open("http://localhost:8080/homepage/new");
        return this;
    }

    public homePage searchFor(String text) {
        $(By.xpath("//html/body/div[1]/form/div/p[1]")).val(text).pressEnter();
        return this;
    }

    public void clickText(String text){
        $(By.linkText(text)).pressEnter();

    }

    public String getGroupText(){
        return $(By.className("navbar-brand")).getText();
    }

     public ElementsCollection results() {
        return $$(".srg .g");
    }


}
