import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import static io.trueautomation.client.TrueAutomationHelper.byTa;

public class SmartLocatorInDatabase extends BaseTest {

    @Test(description = "Using a smart locator taken from a different page")
    public void smartInDatabaseTest() {
        driver.get("https://accounts.google.com");

        //This locator is made on another page
        try {
            driver.findElement(byTa("Translate:Rus1")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Step passed: smart locator taken from another page not found.");
        }

    }
}