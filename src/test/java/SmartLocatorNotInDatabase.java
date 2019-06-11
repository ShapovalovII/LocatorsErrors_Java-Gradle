import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static io.trueautomation.client.TrueAutomationHelper.byTa;

public class SmartLocatorNotInDatabase extends BaseTest {

    // TODO: Incorrect error message.
    @Test(description = "Using a smart locator that does not exist in the database")
    public void smartNotInDatabaseTest() {
        driver.get("https://accounts.google.com");

        //The locator name does not exist in the database
        By withTALocator = byTa("SmartLocator:Not_in_the_database");
        String expectedError = "NOT_FOUND";
        checkErrorMessage(withTALocator, expectedError);
    }
}

