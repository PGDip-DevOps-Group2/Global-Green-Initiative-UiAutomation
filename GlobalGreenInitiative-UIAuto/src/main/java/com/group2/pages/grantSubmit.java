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

    public String getSubmitPageText() {
        return $(By.cssSelector("body > div.container > form > h3")).getText().trim();
    }

    public void submitGrant(String text){
        $(By.linkText(text)).pressEnter();
    }

    public String getSubmitText(){
        return $(By.xpath("//*[@id='group']/p[1]")).getText();
        //return $(By.linkText("submit")).getText();


    }

}

