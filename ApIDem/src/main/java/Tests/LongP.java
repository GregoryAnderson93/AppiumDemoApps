package Tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LongP extends BaseTest {

    @Test
    public void LongPGestures() throws InterruptedException {


        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();


WebElement peopleNames = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
       longPressAction(peopleNames);
        // Use of method(longPressAction) in base class at here


        WebElement sampleMenuText = driver.findElement(By.id("android:id/title"));
        String textMenu = sampleMenuText.getText();
        Assert.assertEquals(textMenu, "Sample menu","Expected and Actual is not same");
        Assert.assertTrue(sampleMenuText.isDisplayed(),"Element not visible");


    }
/*@AfterClass
    public void stop(){"
        *//*driver.quit();
    DriverFactory.stopServices();*//*
}*/
}