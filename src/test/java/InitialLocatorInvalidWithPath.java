import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.testng.annotations.Test;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class InitialLocatorInvalidWithPath extends BaseTest {

    @Test(description = "Create initial locator using wrong TA locator name")
    public void initialInvalidWithValidXpath() {
        driver.get("https://accounts.google.com");

        try {
            driver.findElement(By.xpath(ta("InitialLocator:Not_!_Valid", "//span[@class='RveJvd snByac']"))).click();
        } catch (InvalidSelectorException e) {
            System.out.println("Step passed: element by invalid initial locator not found.");
        }

    }
}
