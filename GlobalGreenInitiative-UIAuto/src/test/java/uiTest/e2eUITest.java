package uiTest;

import com.codeborne.selenide.Configuration;
import com.group2.pages.customerForm;
import com.group2.pages.grantSubmit;
import com.group2.pages.homePage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;


import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class e2eUITest {

    @BeforeAll
    public static void setup() {
        Configuration.headless = true;
        Configuration.browser = "chrome";
        Configuration.reopenBrowserOnFail= true;
        Configuration.baseUrl = "http://localhost:8080/homepage/new";
    }

    @Test
    // @Order(1)
    public void apply4Grant() {
        homePage home = new homePage();
        grantSubmit grant = new grantSubmit();
        customerForm form = new customerForm();

        home.open();
        sleep(1000);
        assertEquals("Group Two", home.getGroupText());

        //home.searchFor("Group 2");
        home.clickText("Apply");
        sleep(1000);
        home.clickText("Customer");
        sleep(1000);

        //enter customer details
        form.enterDetails("Abi", "Bolujo", "1 Mains Street", "l00186151atu.ie",  "01-12-1977", "Adding new customer");
        sleep(1000);
        form.selectGender("female");
        sleep(1000);

        //submit form
        form.clickSubmitButton();

        sleep(2000);
        assertEquals("thanks you for submitting your application", grant.getSubmitText());
        sleep(1000);

    }


}
