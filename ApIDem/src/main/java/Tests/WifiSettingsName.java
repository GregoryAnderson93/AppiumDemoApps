package Tests;

import Infra.DriverFactory;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static Infra.DriverFactory.stopServices;

public class WifiSettingsName extends BaseTest {

    @Test
    public void Preferences() {
        WebElement preference = driver.findElement(AppiumBy.accessibilityId("Preference"));
        preference.click();
    driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();

       //Assertion to match title of pop up
       String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle,"WiFi settings");

        driver.findElement(By.id("android:id/edit")).sendKeys("Greg Wifi");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();

    }
/*@AfterClass
    public void stop(){"
        *//*driver.quit();
    DriverFactory.stopServices();*//*
}*/
}