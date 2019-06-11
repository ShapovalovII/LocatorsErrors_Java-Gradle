import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static io.trueautomation.client.TrueAutomationHelper.byTa;

public class SmartLocatorInDatabase extends BaseTest {

    // TODO: Incorrect error message.
    @Test(description = "Using a smart locator taken from a different page")
    public void smartInDatabaseTest() {
        driver.get("https://accounts.google.com");

        //This locator is made on another page
        By withTALocator = byTa("Translate:Rus1");
        String expectedError = "NOT_FOUND";
        checkErrorMessage(withTALocator, expectedError);
    }
}