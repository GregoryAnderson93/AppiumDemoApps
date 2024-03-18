package Tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Swipe extends BaseTest {

    @Test
    public void SwipeDemoTest() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();


        //find element for first image in scroll bar
        WebElement firstImage = driver.findElement(By.xpath("//android.widget.ImageView[1]"));

        //Before swipe Assertion to check if focus is on first image at scroll (image list)
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]"))
                .getAttribute("focusable"),"true");
        //Swipe code
        swipeAction(firstImage,"left");
        //After swipe Assertion to check if focus is on first image at scroll (image list)
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]"))
                .getAttribute("focusable"),"false");

    }
}