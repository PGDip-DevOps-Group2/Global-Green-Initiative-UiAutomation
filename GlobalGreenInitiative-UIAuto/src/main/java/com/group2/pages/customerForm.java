package com.group2.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class customerForm {

    public void enterDetails(String fname, String lname, String address, String email) {
        $(By.id("firstName")).setValue(fname);
        $(By.id("lastName")).setValue(lname);
        $(By.id("address")).setValue(address);
        $(By.id("email")).setValue(email);
    }

        public void selectGrantReq(String text) {
            $(By.name(""+text+"")).click();
        }

    public void selectGender(String gender) {
       $(By.name("gender")).selectRadio(gender);
    }

    public void clickButton(String text){
        //$(By.linkText(text)).pressEnter();
        $(By.xpath("//span[text()='" + text + "']")).click();
    }

   public void clickSubmitButton(){
       $(By.xpath("//button[text()='Submit']")).click();

   }
}