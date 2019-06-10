import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import static io.trueautomation.client.TrueAutomationHelper.byTa;

public class SmartLocatorNotInDatabase extends BaseTest {

    @Test(description = "Using a smart locator that does not exist in the database")
    public void smartNotInDatabaseTest() {
        driver.get("https://accounts.google.com");

        //The locator name does not exist in the database
        try {
            driver.findElement(byTa("SmartLocator:Not_in_the_database")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Step passed: smart locator which does not exist in the database is not found.");
        }
    }
}

