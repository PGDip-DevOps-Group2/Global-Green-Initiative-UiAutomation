package uiTest;

import com.codeborne.selenide.Configuration;
import com.group2.pages.customerForm;
import com.group2.pages.grantSubmit;
import com.group2.pages.homePage;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;


import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;
public class e2eUI {

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abolu\\IdeaProjects\\GlobalGreenInitiative\\chromedriver.exe");

        Configuration.baseUrl = "http://localhost:8080/homepage/new";
    }

    @Test
    // @Order(1)
    public void apply4Grant() {
        homePage home = new homePage();
        grantSubmit grant = new grantSubmit();
        customerForm form = new customerForm();

        //home.open().searchFor("Nausicaä’s Global Green Initiative");
        home.open();
        sleep(2000);
        //home.searchFor("Group 2");
        home.clickText("Apply");
        sleep(2000);
        grant.selectGrant("$10,000");
        sleep(3000);
        form.enterDetails("Abi", "Bolujo", "1 Mains Street", "01-12-1977");
        sleep(3000);

    }


}
