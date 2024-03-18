package Tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Miscellaneous extends BaseTest {

    @Test
    public void MiscellaneousActs() {

        /*Activity activity = new Activity("io.appium.android.apis",
                "io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies");*/

        /*((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(
                "intent","io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));*/



        WebElement preference = driver.findElement(AppiumBy.accessibilityId("Preference"));
        preference.click();
    driver.findElement(By.xpath
            ("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();

    driver.findElement(By.id("android:id/checkbox")).click();

        //device rotation

        DeviceRotation landscape = new DeviceRotation(0, 0, 90);
        driver.rotate(landscape);

        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        //reset to normal
        DeviceRotation reset = new DeviceRotation(0, 0, 0);
        driver.rotate(reset);

        //Send text to clipboard
        driver.setClipboardText("text lorem ipsum");
        //Paste on text field
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();


        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));

        //Assertion to match title of pop up
       /*String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle,"WiFi settings");

        driver.findElement(By.id("android:id/edit")).sendKeys("Greg Wifi");
        */



    }
/*@AfterClass
    public void stop(){"
        *//*driver.quit();
    DriverFactory.stopServices();*//*
}*/
}