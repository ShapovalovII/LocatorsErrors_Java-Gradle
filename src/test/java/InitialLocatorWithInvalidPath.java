import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class InitialLocatorWithInvalidPath extends BaseTest {
    @Test(description = "Create initial locator with invalid xpath")
    public void initialWithInvalidXpath() {
        driver.get("https://accounts.google.com");

        //Missing two slashes "//"
        try {
            driver.findElement(By.xpath(ta("InitialLocator_Valid:Invalid_Xpath", "span[@class='RveJvd snByac']"))).click();
        } catch (NoSuchElementException e) {
            System.out.println("Step passed: element by invalid xpath not found.");
        }
    }

    @Test(description = "Create initial locator with invalid css selector")
    public void initialWithInvalidCssSelector() {
        driver.get("https://accounts.google.com");

        //Missing dot "."
        try {
            driver.findElement(By.cssSelector(ta("InitialLocator_Valid:Invalid_cssSelector", ".RveJvd snByac"))).click();
        } catch (NoSuchElementException e) {
            System.out.println("Step passed: element by invalid css selector not found.");
        }
    }

    @Test(description = "Create initial locator with invalid class name")
    public void initialWithInvalidClassName() {
        driver.get("https://accounts.google.com");

        //The extra two slashes "//"
        try {
            driver.findElement(By.className(ta("InitialLocator_Valid:Invalid_ClassName", "//RveJvd snByac"))).click();
        } catch (NoSuchElementException e) {
            System.out.println("Step passed: element by invalid class name not found.");
        }
    }

    @Test(description = "Create initial locator with invalid id")
    public void initialWithInvalidId() {
        driver.get("https://accounts.google.com");

        //The extra two slashes "//"
        try {
            driver.findElement(By.id(ta("InitialLocator_Valid:Invalid_Id", "//identifierId"))).click();
        } catch (NoSuchElementException e) {
            System.out.println("Step passed: element by invalid id not found.");
        }

    }

    @Test(description = "Create initial locator with invalid name")
    public void initialWithInvalidName() {
        driver.get("https://accounts.google.com");

        //The extra two slashes "//"
        try {
            driver.findElement(By.name(ta("InitialLocator_Valid:Invalid_Name", "//identifier"))).click();
        } catch (NoSuchElementException e) {
            System.out.println("Step passed: element by invalid name not found.");
        }
    }

    @Test(description = "Create initial locator with invalid link text")
    public void initialWithInvalidLinkText() {
        //driver.get("https://accounts.google.com");

        try {
            //driver.findElement(By.linkText(ta("InitialLocator_Valid:Invalid_LinkText",""))).click();
        } catch (NoSuchElementException e) {
            System.out.println("Step passed: element by invalid link test not found.");
        }
    }

    @Test(description = "Create initial locator with invalid partial link text")
    public void initialWithInvalidPartialLinkText() {
        driver.get("https://accounts.google.com");

        //The extra two slashes "//"
        try {
            driver.findElement(By.partialLinkText(ta("InitialLocator_Valid:Invalid_PartialLinkText", "//Справка"))).click();
        } catch (NoSuchElementException e) {
            System.out.println("Step passed: element by invalid partial link test not found.");
        }
    }
}
