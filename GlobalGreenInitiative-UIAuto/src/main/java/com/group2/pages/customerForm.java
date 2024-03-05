package com.group2.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class customerForm {

    public void enterDetails(String fname, String lname, String address, String email,String dob, String msg){
        $(By.id("firstName")).setValue(fname);
        $(By.id("lastName")).setValue(lname);
        $(By.id("address")).setValue(address);
        $(By.id("Email")).setValue(email);
        $(By.id("DOB")).setValue(dob);
        $(By.id("message")).setValue(msg);

    }

    public void selectGender(String gender) {
       $(By.name("gender")).selectRadio(gender);
    }
   public void clickSubmitButton(){
       $(By.xpath("//button[text()='Submit']")).click();

   }
}