package com.group2.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class customerForm {

    public void enterDetails(String fname, String lname, String address, String dob){
        $(By.id("firstName")).setValue(fname);
        $(By.id("lastName")).setValue(lname);
        $(By.id("address")).setValue(address);
        $(By.id("DOB")).setValue(dob);
        sleep(2000);
        $(By.xpath("//button[text()='Submit']")).click();
    }

    public String getCustomerPageText() {
        return $(By.cssSelector("body > div > form > h3")).getText().trim();
    }

}