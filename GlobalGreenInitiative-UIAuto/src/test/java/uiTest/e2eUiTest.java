package uiTest;

import com.codeborne.selenide.Configuration;
import com.group2.pages.customerForm;
import com.group2.pages.grantSelection;
import com.group2.pages.grantSubmit;
import com.group2.pages.homePage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static com.codeborne.selenide.Selenide.sleep;
public class e2eUiTest {

    @BeforeAll
    public static void setup() {
       // Configuration.headless = true;
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://3.255.115.108:8080/homepage/new";
        open("/new");
    }

    @Test
    // @Order(1)
    public void apply4Grant() {
        open("/new");
        homePage home = new homePage();
        grantSelection grantSel = new grantSelection();
        grantSubmit grantSub = new grantSubmit();
        customerForm form = new customerForm();

        /*
        Selecting Ohmu Impact Grant
         */
        home.open().clickText("Apply");
        grantSel.agreedTC("optionOne");
        grantSel.selectGrantOption("btnOne");

        /*
        Nausicaä’s Global Green Initiative Form Personal Details
        */
        form.enterDetails("Abi","Bolujo","1IkoyiRoyalPalace","first.last@gmail.com");

        sleep(1000);

        //Impactful Project:
        form.selectGrantReq("requirementOne");
        //Innovative Approach:
        form.selectGrantReq("requirementTwo");
        //Community Involvement:
        form.selectGrantReq("requirementThree");

        form.clickButton("Submit");
        sleep(1000);

        /*
        Back to the home page
        */
        //Back to Home page
        grantSub.click("Home");
        sleep(1000);



    }


}
