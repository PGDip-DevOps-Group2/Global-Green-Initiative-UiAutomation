package uiTest;

import com.codeborne.selenide.Configuration;
import com.group2.pages.customerForm;
import com.group2.pages.grantSubmit;
import com.group2.pages.homePage;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;
public class e2eUI {

    @BeforeAll
    public static void setup() {
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

        assertEquals(home.getHomePageText(), "Group 2");

        home.clickText("Apply");
        sleep(1000);
        grant.selectGrant("$10,000");
        sleep(1000);
        form.enterDetails("Abi", "Bolujo", "1 Mains Street", "01-12-1977");
        sleep(2000);

    }


}
