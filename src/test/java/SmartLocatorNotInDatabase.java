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
        String expectedError = "There is no such TA Locator in the objects repository. Element 'SmartLocator:Not_in_the_database' was not found in the objects repository of 'TestTA' project.";
        checkErrorMessage(withTALocator, expectedError);
    }
}

