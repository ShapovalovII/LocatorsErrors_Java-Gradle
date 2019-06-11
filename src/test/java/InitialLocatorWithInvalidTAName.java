import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class InitialLocatorWithInvalidTAName extends BaseTest {

    @Test(description = "Create initial locator using wrong TA locator name.")
    public void initialWithInvalidTAName() {
        driver.get("https://accounts.google.com");

        By withTALocator = By.xpath(ta("ta!Name", "//span[@class='RveJvd snByac']"));
        String expectedError = "TrueAutomation locator name contains unsupported characters. Please make sure to use only letters, numbers, colon and underscore symbols in locator names";
        checkErrorMessage(withTALocator, expectedError);
    }
}
