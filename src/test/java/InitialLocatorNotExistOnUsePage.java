import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class InitialLocatorNotExistOnUsePage extends BaseTest {

    @Test(description = "Create initial locator using the path of another element from another page")
    public void initialFromAnotherPage() {
        driver.get("https://accounts.google.com");

        //Used locator taken from another page
        try {
            driver.findElement(By.cssSelector(ta("Zachet:Zachet_Div_Initial", ".logo.top-menu"))).click();
        }catch (NoSuchElementException e){
            System.out.println("Step passed: initial locator from another page not found.");
        }
    }
}