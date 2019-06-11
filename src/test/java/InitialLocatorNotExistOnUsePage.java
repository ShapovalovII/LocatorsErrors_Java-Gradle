import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class InitialLocatorNotExistOnUsePage extends BaseTest {

    // TODO: Incorrect error message.
    @Test(description = "The use of TA locator, the initial locator which is taken from another page.")
    public void initialFromAnotherPage() {
        driver.get("https://accounts.google.com");

        //Used locator taken from another page
        By withTALocator = By.cssSelector(ta("Zachet:Zachet_Div_Initial", ".logo.top-menu"));
        String expectedError = "NOT_FOUND";
        checkErrorMessage(withTALocator, expectedError);
    }
}