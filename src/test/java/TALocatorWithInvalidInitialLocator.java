import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class TALocatorWithInvalidInitialLocator extends BaseTest {

    @Test(description = "Create TA locator with invalid xpath")
    public void TANameWithInvalidXpath() {
        driver.get("https://accounts.google.com");

        //Missing two slashes "//"
        By withTALocator = By.xpath(ta("taName", "span[@class='RveJvd snByac']"));
        String expectedError = "Unable to locate element { using: \"xpath\", selector: \"span[@class='RveJvd snByac']\" }";
        checkErrorMessage(withTALocator, expectedError);
    }

    @Test(description = "Create TA locator with invalid css selector")
    public void TANameWithInvalidCssSelector() {
        driver.get("https://accounts.google.com");

        //Missing dot "."
        By withTALocator = By.cssSelector(ta("taName", ".RveJvd snByac"));
        String expectedError = "Unable to locate element { using: \"css selector\", selector: \".RveJvd snByac\" }";
        checkErrorMessage(withTALocator, expectedError);
    }

    @Test(description = "Create TA locator with invalid class name")
    public void TANameWithInvalidClassName() {
        driver.get("https://accounts.google.com");

        //The extra two slashes "//"
        By withTALocator = By.className(ta("taName", "//RveJvd snByac"));
        String expectedError = "Unable to locate element { using: \"class name\", selector: \"//RveJvd snByac\" }";
        checkErrorMessage(withTALocator, expectedError);
    }

    @Test(description = "Create TA locator with invalid id")
    public void TANameWithInvalidId() {
        driver.get("https://accounts.google.com");

        //The extra two slashes "//"
        By withTALocator = By.id(ta("taName", "//identifierId"));
        String expectedError = "Unable to locate element { using: \"id\", selector: \"//identifierId\" }";
        checkErrorMessage(withTALocator, expectedError);
    }

    @Test(description = "Create TA locator with invalid name")
    public void TANameWithInvalidName() {
        driver.get("https://accounts.google.com");

        //The extra two slashes "//"
        By withTALocator = By.name(ta("taName", "//identifier"));
        String expectedError = "Unable to locate element { using: \"name\", selector: \"//identifier\" }";
        checkErrorMessage(withTALocator, expectedError);
    }

    @Test(description = "Create TA locator with invalid link text")
    public void TANameWithInvalidLinkText() {
        driver.get("https://accounts.google.com");

        //The extra two slashes "//"
        By withTALocator = By.linkText(ta("taName", "//Справка"));
        String expectedError = "Unable to locate element { using: \"link text\", selector: \"//Справка\" }";
        checkErrorMessage(withTALocator, expectedError);
    }

    @Test(description = "Create TA locator with invalid partial link text")
    public void TANameWithInvalidPartialLinkText() {
        driver.get("https://accounts.google.com");

        //The extra two slashes "//"
        By withTALocator = By.partialLinkText(ta("taName", "//Справка"));
        String expectedError = "Unable to locate element { using: \"partial link text\", selector: \"//Справка\" }";
        checkErrorMessage(withTALocator, expectedError);
    }

}