import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        driver = new TrueAutomationDriver();
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }


    public void checkErrorMessage(By withTa, String expectedError) {
        try {
            driver.findElement(withTa).click();
        } catch (Exception ta) {
            String actualErrorMessageWithTA = ta.getMessage();

            System.out.println("\n**********************");
            System.out.println("Expected error: " + expectedError);
            System.out.println("**********************");

            System.out.println("\n**********************");
            System.out.println("Actual error: " + actualErrorMessageWithTA);
            System.out.println("**********************");

            Assert.assertTrue(actualErrorMessageWithTA.contains(expectedError), "Error messages not contains.");
        }
    }
}
