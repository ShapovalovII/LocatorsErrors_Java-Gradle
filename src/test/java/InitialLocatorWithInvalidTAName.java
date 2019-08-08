import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class InitialLocatorWithInvalidTAName extends BaseTest {

    @Test(description = "Create initial locator using wrong TA locator name.")
    public void initialWithInvalidTAName() {
        driver.get("https://accounts.google.com");

        By withTALocator = By.xpath(ta("ta-Name", "//span[@class='RveJvd snByac']"));
        String expectedError = "Such TrueAutomation locator name ta-Name can not be used. Locator name may consist of several parts separated by a colon. English letters, numbers and single underscores that are not at the beginning or at the end may be used. ";
        checkErrorMessage(withTALocator, expectedError);
    }
}
