package uiTest;

import com.codeborne.selenide.Configuration;
import com.group2.pages.customerForm;
import com.group2.pages.grantSubmit;
import com.group2.pages.homePage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static com.codeborne.selenide.Selenide.sleep;
public class e2eUiTest {

    @BeforeAll
    public static void setup() {
        //Configuration.headless = true;
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://localhost:8080/homepage/new";
    }

    @Test
    // @Order(1)
    public void apply4Grant() {
        homePage home = new homePage();
        grantSubmit grant = new grantSubmit();
        customerForm form = new customerForm();

        home.open();
        sleep(2000);

        //To confirm the test on the home page
        assertEquals(home.getHomePageText(), "Group 2");

        home.clickText("Apply");
        sleep(1000);

        //To confirm the test on the grant page
        assertEquals(grant.getSubmitPageText(), "Select A Grant");

        grant.selectGrant("$10,000");
        sleep(1000);

        //To confirm the test on the customer form page
        assertEquals(form.getCustomerPageText(), "Customer Form");

        form.enterDetails("Abi", "Bolujo", "1 Mains Street", "01-12-1977");
        sleep(2000);

    }


}
