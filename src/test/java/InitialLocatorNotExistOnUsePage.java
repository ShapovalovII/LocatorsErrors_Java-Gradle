import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class InitialLocatorNotExistOnUsePage extends BaseTest {

    // TODO: Incorrect error message.
    @Test(description = "The use of TA locator, the initial locator which is taken from another page.")
    public void initialFromAnotherPage() {
        driver.get("https://accounts.google.com");

        //Used locator taken from another page
        By withTALocator = By.cssSelector(ta("Practike:Frame:iframe", "#courses-iframe"));
        String expectedError = "Element was not found on the page. Element 'Practike:Frame:iframe' with such locator is not on this page and could not be detected by TrueAutomation.";
        checkErrorMessage(withTALocator, expectedError);
    }
}